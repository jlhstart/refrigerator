package com.refrigerator_management.service;

import com.refrigerator_management.dao.ContentInfoDao;
import com.refrigerator_management.dao.StoredtlDao;
import com.refrigerator_management.entity.ContentInfo;
import com.refrigerator_management.entity.ContentShow;
import com.refrigerator_management.entity.Storedtl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContentService {
    @Autowired
    private ContentInfoDao contentInfoDao;
    @Autowired
    public StoredtlDao storedtlDao;

    public List<ContentShow> GetContent(int refrigerator_id,int layer_id){
        return contentInfoDao.selectById(refrigerator_id,layer_id);
    }

    public boolean AddContent(Storedtl storedtl){
        if(contentInfoDao.AddContent(storedtl)){
            return true;
        }
        else return false;
    }

    public String takeFood(int storeId,double amount){
        double _amount = storedtlDao.selectById(storeId).getContentAmount();
        _amount -= amount;
        if(_amount < 0)
            return "没有这么多的物资数量";
        else if(_amount == 0){ //如果要取出所有物资，则删除该物资信息
            storedtlDao.deleteById(storeId);
            return "该物资已用完，删除物资";
        }
        else {
            storedtlDao.minusFoodAmount(storeId,_amount);
            return "更改物资数量成功";
        }
    }

    public String updateFood(Storedtl st){
        if(storedtlDao.updateFood(st) > 0)
            return "更改数据成功";
        else
            return "更改失败！";
    }
}
