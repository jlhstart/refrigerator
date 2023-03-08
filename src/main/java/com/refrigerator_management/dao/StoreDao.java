package com.refrigerator_management.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.refrigerator_management.entity.ContentShow;
import com.refrigerator_management.entity.Store;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface StoreDao extends BaseMapper<Store> {
    @Select("Select save.*,content.name, content.image,refrigerator.temp_cooler," +
            "refrigerator.temp_preserve,refrigerator.temp_freezer from save," +
            "content,refrigerator WHERE save.content_id =" +
            "content.id AND save.refrigerator_id = refrigerator.id" +
            " AND refrigerator.id=#{refrigeratorId} AND save.layer_id=#{layerId}")
    List<ContentShow> selectById(int refrigeratorId, int layerId);

    @Insert("Insert into save values=(null,#{stored.refrigeratorId},#{stored.contentId},#{stored.layerId}" +
            ",#{stored.amount},#{stored.unit},#{stored.dateStore},#{stored.dateExpired}) ")
    boolean AddContent(Store store);

    @Update("UPDATE save SET layer_id = #{stored.layerId}," +
            " amount = #{stored.amount}, " +
            "unit = #{stored.unit}, " +
            "date_store = #{stored.dateStore}, " +
            "date_expired = #{stored.dateExpired}" +
            " WHERE id = #{stored.id}")
    int updateFood(Store store);

    @Update("UPDATE save SET amount = #{amount} WHERE id = #{id}")
    void minusFoodAmount(int id, double amount);

}