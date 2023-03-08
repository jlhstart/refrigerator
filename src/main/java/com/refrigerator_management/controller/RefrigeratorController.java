package com.refrigerator_management.controller;

import com.refrigerator_management.entity.BrandModel;
import com.refrigerator_management.entity.Refrigerator;
import com.refrigerator_management.service.ContentService;
import com.refrigerator_management.service.RefrigeratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/refrigerator")
public class RefrigeratorController {
    @Autowired
    public RefrigeratorService refrigeratorService;

    @Autowired
    public ContentService contentService;

    @GetMapping
    public List<Refrigerator> GetRefrigerators(@CookieValue String userId){
        System.out.println(userId);
        return refrigeratorService.GetRefrigerators(Integer.parseInt(userId));
    }

    @PostMapping
    public BrandModel GetBrand(Integer brandId){
        return refrigeratorService.GetBrand(brandId);
    }

}

