package com.refrigerator_management.controller;

import com.refrigerator_management.entity.ContentShow;
import com.refrigerator_management.entity.Storedtl;
import com.refrigerator_management.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 食材管理
 */
@RestController
public class ContentController {
    @Autowired
    public ContentService contentService;

    /**
     * 获取食材信息
     * @param refrigerator_id
     * @param layer_id
     * @return
     */
    @GetMapping("/content")
    public List<ContentShow> GetContentInfo(int refrigerator_id,int layer_id){
        System.out.println('y');
        String k='j';
        System.out.println(j);
        return contentService.GetContent(refrigerator_id,layer_id);
    }

    /**
     * 增加食材
     * @param storedtl
     * @return
     */
    @PostMapping("/content")
    public boolean AddContent(Storedtl storedtl){
        return contentService.AddContent(storedtl);
    }



    /**
     * 取出食材
     * @param storeId
     * @param amount
     * @return
     */
    @DeleteMapping("/food")
    public String takeFood(int storeId,double amount){
        return contentService.takeFood(storeId,amount);
    }

    /**
     * 更改食材
     * @param st
     * @return
     */
    @PutMapping("/food")
    public String updateFood(Storedtl st){
        return contentService.updateFood(st);
    }



}
