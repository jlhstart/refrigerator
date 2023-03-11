package com.refrigerator_management.service;

import com.refrigerator_management.dao.ContentDao;
import com.refrigerator_management.entity.Content;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContentService {
    @Autowired
    private ContentDao contentDao;

    public Content getContentById(int id){
        return contentDao.selectById(id);
    }

    public int getContentId(String name){
        return contentDao.selectByName(name);
    }

}
