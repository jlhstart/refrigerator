package com.refrigerator_management.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.refrigerator_management.entity.ContentShow;
import com.refrigerator_management.entity.Save;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface SaveDao extends BaseMapper<Save> {
    @Select("Select save.*,content.name, content.image,refrigerator.temp_cooler," +
            "refrigerator.temp_preserve,refrigerator.temp_freezer from save," +
            "content,refrigerator WHERE save.content_id =" +
            "content.id AND save.refrigerator_id = refrigerator.id"+
            " AND refrigerator.id=#{refrigeratorId} AND save.layer_id=#{layerId}")
    List<ContentShow> selectById(int refrigeratorId, int layerId);

    @Insert("Insert into save values=(null,#{save.refrigeratorId},#{save.contentId},#{save.layerId}" +
            ",#{save.amount},#{save.unit},#{save.dateStore},#{save.save}) ")
    boolean AddContent(Save save);
    @Update("UPDATE save SET layer_id = #{save.layerId}," +
            " amount = #{save.amount}, " +
            "unit = #{save.unit}, " +
            "date_store = #{save.dateStore}, " +
            "date_expired = #{save.dateExpired}" +
            " WHERE id = #{save.id}")
    int updateFood(Save save);

    @Update("UPDATE save SET amount = #{amount} WHERE id = #{id}")
    void minusFoodAmount(int id,double amount);

}