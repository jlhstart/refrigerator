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
@RestController("/content")
public class ContentController {
    @Autowired
    public ContentService contentService;

    /**
     * 获取食材信息
     * @param refrigerator_id
     * @param layer_id
     * @return
     */
    @GetMapping
    public List<ContentShow> GetContentInfo(int refrigerator_id,int layer_id){
        return contentService.GetContent(refrigerator_id,layer_id);
    }

    /**
     * 增加食材
     * @param storedtl
     * @return
     */
    @PostMapping
    public boolean AddContent(Storedtl storedtl){
        System.out.println('p');
        return contentService.AddContent(storedtl);
    }



}
