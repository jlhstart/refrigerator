package com.refrigerator_management.controller;

import com.refrigerator_management.entity.BrandModel;
import com.refrigerator_management.entity.Refrigerator;
import com.refrigerator_management.service.ContentService;
import com.refrigerator_management.service.RefrigeratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * 冰箱管理
 */
@RestController
public class RefrigeratorController {
    @Autowired
    public RefrigeratorService refrigeratorService;

    @Autowired
    public ContentService contentService;

    @GetMapping("/refrigerator")
    public List<Refrigerator> GetRefrigerators(@CookieValue String userid){
        return refrigeratorService.GetRefrigerators(Integer.parseInt(userid));
    }

    /**
     * 获取冰箱具体信息
     * @param brandid
     * @return
     */
    @PostMapping("/refrigerator")
    public BrandModel GetBrand(Integer brandid){
        return refrigeratorService.GetBrand(brandid);
    }

}

