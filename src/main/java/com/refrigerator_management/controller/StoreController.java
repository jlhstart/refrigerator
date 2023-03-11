package com.refrigerator_management.controller;

import com.refrigerator_management.entity.Content;
import com.refrigerator_management.entity.Result;
import com.refrigerator_management.entity.Store;
import com.refrigerator_management.service.ContentService;
import com.refrigerator_management.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/store")
public class StoreController {
    @Autowired
    private StoreService storeService;

    @Autowired
    private ContentService contentService;

    @GetMapping
    public Result getContentInfo(Integer refrigeratorId, Integer layerId) {
        List<Store> stores = storeService.getStore(refrigeratorId, layerId);
        List<Map<String, Object>> contentShows = new ArrayList<>();
        for(int i=0;i<stores.size();i++){
            Map<String,Object> map=new HashMap<>();
            map.put("id",stores.get(i).getId());
            map.put("refrigeratorId",stores.get(i).getRefrigeratorId());
            int contentId=stores.get(i).getContentId();
            map.put("contentId",contentId);
            map.put("layerId",stores.get(i).getLayerId());
            map.put("amount",stores.get(i).getAmount());
            map.put("unit",stores.get(i).getUnit());
            map.put("dateExpired",stores.get(i).getDateExpired());
            Content content = contentService.getContentById(contentId);
            map.put("name",content.getName());
            map.put("image",content.getImage());
            contentShows.add(map);
        }
        if (contentShows.isEmpty()) return new Result(404);
        else return new Result(200, contentShows);
    }

    @PostMapping
    public Result addContent(Store store, String name) {
        int contentId=contentService.getContentId(name);
        store.setContentId(contentId);
        if (storeService.addStore(store)) return new Result(200);
        else return new Result(404);
    }

    @DeleteMapping
    public Result takeContent(Integer saveId, Double amount) {
        if (storeService.takeContent(saveId, amount)) return new Result(200);
        else return new Result(404);
    }

    @PutMapping
    public Result updateStore(Store store) {
        if (storeService.updateSore(store)) return new Result(200);
        else return new Result(404);
    }


}
