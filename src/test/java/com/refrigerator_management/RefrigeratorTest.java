package com.refrigerator_management;

import com.refrigerator_management.dao.BrandModelDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RefrigeratorTest {
    @Autowired
    private BrandModelDao brandModelDao;
    @Test
    void contextLoads() {
        System.out.println(brandModelDao.selectById(606));
    }

}
