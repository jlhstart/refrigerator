package com.refrigerator_management.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.refrigerator_management.entity.Refrigerator;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface RefrigeratorDao extends BaseMapper<Refrigerator> {

    @Select("select * from refrigerator where holdby_user_id = #{userid}")
    public List<Refrigerator> selectByUserId(int userid);
}
