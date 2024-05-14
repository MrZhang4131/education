package com.example.demo.conttler;

import com.example.demo.Service.Oder_Service;
import com.example.demo.pojo.Uilt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Oder {
    @Autowired
    private Oder_Service oder_service;
    @RequestMapping("/insert_oder")
    public void insert_oder(Integer index, Integer fee, String addr, String time, String openid, String text,String telephone){
        System.out.println(telephone);
        oder_service.insert_oder(index,fee,addr,time,openid,text,telephone);
    }
    //查询所有订单
    @RequestMapping("/select_all")
    public String select_all(){
        String select_all= oder_service.select_all();
        return select_all;
    }
    //条件查询订单
    @RequestMapping("/condition_select")
    public String condition_select(Integer index,int max,int min){
        index+=1;
//        System.out.println(max);
//        System.out.println(1);
//        Uilt.test(max);
        String select_all= oder_service.select_condition_oder(index,max,min);
        System.out.println(index+" max:"+max+" min:"+min);
        return select_all;
    }
    @RequestMapping("/id_select")
    public String id_Select(String openid){
//        System.out.println(openid);
//        System.out.println(1);
        return oder_service.id_select(openid);
    }
    @RequestMapping("/student_id_select")
    public String student_id_select(String openid){
        return oder_service.student_id_select(openid);
    }
    //删除订单
    @RequestMapping("/delete_oder")
    public void delete_oder(Integer id){
        oder_service.delete_oder(id);
    }
    //修改订单
    @RequestMapping("/delete_student")
    public void delete_student(Integer oder_id){oder_service.delete_student(oder_id);}
    @RequestMapping("/receive_oder")
    public void receive_oder(int oder_id,String student_id){
        System.out.println(oder_id);
        System.out.println(student_id);
        oder_service.receive_oder(oder_id,student_id);
        System.out.println(1);
    }
}
