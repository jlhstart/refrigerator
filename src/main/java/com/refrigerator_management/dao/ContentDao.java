package com.refrigerator_management.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.refrigerator_management.entity.Content;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ContentDao extends BaseMapper<Content> {
}
