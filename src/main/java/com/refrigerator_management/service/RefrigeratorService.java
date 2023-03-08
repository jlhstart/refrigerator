package com.refrigerator_management.service;

import com.refrigerator_management.dao.BrandModelDao;
import com.refrigerator_management.dao.RefrigeratorDao;
import com.refrigerator_management.entity.BrandModel;
import com.refrigerator_management.entity.Refrigerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RefrigeratorService {
    @Autowired
    private RefrigeratorDao refrigeratorDao;

    @Autowired
    private BrandModelDao brandModelDao;

    public List<Refrigerator> GetRefrigerators(int userId) {
        return refrigeratorDao.selectByUserId(userId);
    }

    public BrandModel GetBrand(int brandId) {
        return brandModelDao.selectById(brandId);
    }

}
