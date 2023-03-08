package com.refrigerator_management.service;

import com.refrigerator_management.dao.SaveDao;
import com.refrigerator_management.entity.ContentShow;
import com.refrigerator_management.entity.Save;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ContentService {
    @Autowired
    public SaveDao saveDao;

    public List<ContentShow> GetContent(int refrigeratorId,int layerId){
        return saveDao.selectById(refrigeratorId,layerId);
    }

    public boolean AddContent(Save save){
        if(saveDao.AddContent(save)){
            return true;
        }
        else return false;
    }

    public String takeFood(int saveId,double amount){
        double _amount = saveDao.selectById(saveId).getAmount();
        _amount -= amount;
        if(_amount < 0)
            return "没有这么多的物资数量";
        else if(_amount == 0){ //如果要取出所有物资，则删除该物资信息
            saveDao.deleteById(saveId);
            return "该物资已用完，删除物资";
        }
        else {
            saveDao.minusFoodAmount(saveId,_amount);
            return "更改物资数量成功";
        }
    }

    public String updateFood(Save save){
        if(saveDao.updateFood(save) > 0)
            return "更改数据成功";
        else
            return "更改失败！";
    }
}
