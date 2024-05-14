package com.example.demo;

import com.example.demo.Dao.Oders;
import com.example.demo.Dao.OpenID_Dao;
import com.example.demo.Dao.TestDao;
import com.example.demo.Service.Oder_Service;
import com.example.demo.Service.OpenID_Service;
import com.example.demo.pojo.Oder_Format;
import com.example.demo.pojo.Uilt;
import com.example.demo.pojo.User;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
@RunWith(SpringRunner.class)
@SpringBootTest
class Demo3ApplicationTests {
    @Autowired
    OpenID_Dao openID_dao;
    @Autowired
    Oders oders;
    @Autowired
    OpenID_Service openID_service;
    @Autowired
    Oder_Service oder_service;
    @Test
    void contextLoads() {
        oder_service.select_condition_oder(1,23,90);

    }
    @Test
    void test(){
        openID_service.select("1213");
    }
    @Test
    void test1(){
        System.out.println(Uilt.major_case(2));
    }
    @Test
    void contextLoads1() {
        oder_service.insert_oder(1,70,"SMU","sunday","1","","121312");
    }
    @Test
    void contextLoads2() {
        oders.receive_oder(1,"test");
    }
    @Test
    void contextLoads3() {
        oders.delete_student(1);
    }

}
