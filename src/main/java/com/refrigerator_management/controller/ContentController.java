package com.refrigerator_management.controller;

import com.refrigerator_management.entity.ContentShow;
import com.refrigerator_management.entity.Result;
import com.refrigerator_management.entity.Stored;
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
    public Result GetContentInfo(int refrigeratorId,int layerId){
        List<ContentShow> contentShows=contentService.GetContent(refrigeratorId,layerId);
        if(contentShows.isEmpty()) return new Result(404);
        else return new Result(200,contentShows);
    }

    @PostMapping
    public Result AddContent(Stored stored){
        if(contentService.AddContent(stored)) return new Result(200);
        else return new  Result(404);
    }
    
    @DeleteMapping
    public Result takeFood(int saveId,double amount){
        if(contentService.takeFood(saveId,amount)) return new Result(200);
        else return new Result(404);
    }

    @PutMapping
    public Result updateFood(Stored stored){
        if(contentService.updateFood(stored)) return new Result(200);
        else return new Result(404);
    }



}
