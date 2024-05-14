package com.example.demo.Dao;

import com.example.demo.pojo.Oder_Format;
import org.apache.ibatis.annotations.*;

import java.util.ArrayList;

@Mapper
public interface Oders {
    //增加数据库
    @Insert("INSERT INTO `oder_list` (`major`,`fee`,`addr`,`time`,`id`,`data`,`text`,`telephone`) " +
        "VALUES(#{major},#{fee},#{addr},#{time},#{openid},NOW(),#{text},#{telephone});")
    public void insert_oder(String major, Integer fee, String addr, String time, String openid,String text,String telephone);
    //查询数据库
    @Select("SELECT * FROM `oder_list` WHERE `major` = #{major} AND student_id IS NULL;")
    public ArrayList<Oder_Format> condition_select(String major);
    @Select("SELECT * FROM `oder_list` WHERE student_id IS NULL;")
    public ArrayList<Oder_Format> select_all();
    @Select("SELECT * FROM `oder_list` WHERE `id` = #{openid};")
    public ArrayList<Oder_Format> id_select(String openid);
    @Select("SELECT * FROM `oder_list` WHERE `student_id` = #{openid};")
    public ArrayList<Oder_Format> student_id_select(String openid);
    //更改数据库
    @Update("UPDATE oder_list SET student_id=#{student_id} WHERE oder_id=#{oder_id};")
    public void receive_oder(int oder_id,String student_id);
    @Update("UPDATE oder_list SET student_id = null WHERE oder_id=#{oder_id};")
    public void delete_student(int oder_id);
    //删除数据库
    @Delete("DELETE FROM oder_list WHERE oder_id=#{id}")
    public void delete_oder(int id);
}


