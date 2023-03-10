package com.refrigerator_management.controller;

import com.refrigerator_management.entity.Refrigerator;
import com.refrigerator_management.entity.Result;
import com.refrigerator_management.service.RefrigeratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/refrigerator")
public class RefrigeratorController {
    @Autowired
    private RefrigeratorService refrigeratorService;

    @GetMapping
    public Result getRefrigerators(@CookieValue String userId) {
        List<Refrigerator> refrigerators = refrigeratorService.getRefrigerators(Integer.parseInt(userId));
        if (refrigerators.isEmpty()) return new Result(404);
        else return new Result(200, refrigerators);
    }

    @PostMapping
    public Result getBrand(Integer brandId) {
        return new Result(200, refrigeratorService.getBrand(brandId));
    }

}

