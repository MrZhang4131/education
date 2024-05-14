package com.example.demo.Dao;

import com.example.demo.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Mapper
public interface TestDao {
    @Select("select * from user")
    public ArrayList<User> getuserlist();
}
