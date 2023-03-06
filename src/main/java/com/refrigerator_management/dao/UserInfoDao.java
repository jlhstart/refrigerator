package com.refrigerator_management.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.refrigerator_management.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserInfoDao extends BaseMapper<UserInfo> {
}
