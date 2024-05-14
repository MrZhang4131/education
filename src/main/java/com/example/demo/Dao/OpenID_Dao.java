package com.example.demo.Dao;

import com.example.demo.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface OpenID_Dao {
    @Select("select * from user where id=#{id}")
    public User selectuser(String id);
    @Insert("insert into user(id, username)values (#{id},'null')")
    public void craetuser(String id);
}
