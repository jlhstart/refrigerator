package com.refrigerator_management.service;

import com.refrigerator_management.dao.StoreDao;
import com.refrigerator_management.entity.ContentShow;
import com.refrigerator_management.entity.Store;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContentService {
    @Autowired
    public StoreDao storeDao;

    public List<ContentShow> GetContent(int refrigeratorId, int layerId) {
        return storeDao.selectById(refrigeratorId, layerId);
    }

    public boolean AddContent(Store store) {
        if (storeDao.AddContent(store)) {
            return true;
        } else return false;
    }

    public boolean takeFood(int saveId, double amount) {
        double _amount = storeDao.selectById(saveId).getAmount();
        _amount -= amount;
        if (_amount < 0) {
            System.out.println("没有这么多的物资数量");
            return false;
        } else if (_amount == 0) {
            storeDao.deleteById(saveId);
            System.out.println("该物资已用完，删除物资");
        } else {
            storeDao.minusFoodAmount(saveId, _amount);
            System.out.println("更改物资数量成功");
        }
        return true;
    }

    public boolean updateFood(Store store) {
        if (storeDao.updateFood(store) > 0) {
            System.out.println("更改数据成功");
            return true;
        } else {
            System.out.println("更改失败！");
            return false;
        }
    }
}
