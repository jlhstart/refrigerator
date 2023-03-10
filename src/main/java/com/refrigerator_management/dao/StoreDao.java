package com.refrigerator_management.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.refrigerator_management.entity.Store;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface StoreDao extends BaseMapper<Store> {
    @Select("Select * from store WHERE refrigerator_id = #{refrigeratorId} AND layer_id=#{layerId}")
    List<Store> selectByIds(int refrigeratorId, int layerId);

    @Insert("Insert into store values=(null,#{refrigeratorId},#{contentId},#{layerId}" +
            ",#{amount},#{unit},#{dateStore},#{dateExpired}) ")
    boolean addStore(Store store);

    @Update("UPDATE store SET layer_id = #{layerId}," +
            " amount = #{amount}, " +
            "unit = #{unit}, " +
            "date_store = #{dateStore}, " +
            "date_expired = #{dateExpired}" +
            " WHERE id = #{id}")
    int updateStore(Store store);

    @Update("UPDATE store SET amount = #{amount} WHERE id = #{id}")
    void minusContentAmount(int id, double amount);

}