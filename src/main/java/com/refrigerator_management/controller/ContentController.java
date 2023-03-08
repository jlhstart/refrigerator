package com.refrigerator_management.controller;

import com.refrigerator_management.entity.ContentShow;
import com.refrigerator_management.entity.Save;
import com.refrigerator_management.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/content")
public class ContentController {
    @Autowired
    public ContentService contentService;

    @GetMapping
    public List<ContentShow> GetContentInfo(int refrigeratorId,int layerId){
        return contentService.GetContent(refrigeratorId,layerId);
    }

    @PostMapping
    public boolean AddContent(Save save){
        return contentService.AddContent(save);
    }
    
    @DeleteMapping
    public String takeFood(int saveId,double amount){
        return contentService.takeFood(saveId,amount);
    }

    @PutMapping
    public String updateFood(Save save){
        return contentService.updateFood(save);
    }



}
