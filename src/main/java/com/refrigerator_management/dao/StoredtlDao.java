package com.refrigerator_management.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.refrigerator_management.entity.Storedtl;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface StoredtlDao extends BaseMapper<Storedtl> {
    @Update("UPDATE storedtl SET store_layer_id = #{storeLayerId}," +
            " content_amount = #{contentAmount}, " +
            "content_unit = #{contentUnit}, " +
            "store_on_date = #{storeOnDate}, " +
            "quality_guarantee_before = #{qualityGuaranteeBefore}" +
            " WHERE store_id = #{storeId}")
    int updateFood(Storedtl st);

    @Update("UPDATE storedtl SET content_amount = #{amount} WHERE id = #{id}")
    void minusFoodAmount(int id,double amount);

}