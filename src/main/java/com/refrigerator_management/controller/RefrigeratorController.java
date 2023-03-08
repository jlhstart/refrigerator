package com.refrigerator_management.controller;

import com.refrigerator_management.entity.Refrigerator;
import com.refrigerator_management.entity.Result;
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
    public Result GetRefrigerators(@CookieValue String userId) {
        List<Refrigerator> refrigerators = refrigeratorService.GetRefrigerators(Integer.parseInt(userId));
        if (refrigerators.isEmpty()) return new Result(404);
        else return new Result(200, refrigerators);
    }

    @PostMapping
    public Result GetBrand(Integer brandId) {
        return new Result(200, refrigeratorService.GetBrand(brandId));
    }

}

