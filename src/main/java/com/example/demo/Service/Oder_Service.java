package com.example.demo.Service;

import com.example.demo.pojo.Oder_Format;

import java.util.ArrayList;

public interface Oder_Service {
    //增加订单
    public void insert_oder(Integer index,Integer fee,String addr,String time,String openid,String text,String telephone);
    //删除订单
    public void delete_oder(int id);
    //修改订单
    public void receive_oder(int oder_id,String student_id);
    public void delete_student(int oder_id);
    //查询订单
    public String select_all();
    //根据学科查询订单
    public String select_condition_oder(int index,int max,int min);
    public String select_money_oder(ArrayList<Oder_Format> arrayList, int max, int min);
    public String id_select(String openid);

    public String student_id_select(String openid);
}
