package com.example.demo.Service.Service;

import com.example.demo.Dao.Oders;
import com.example.demo.Service.Oder_Service;
import com.example.demo.pojo.Oder_Format;
import com.example.demo.pojo.Uilt;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Iterator;

@Service
public class Oder_ServiceA implements Oder_Service {
    @Autowired
    private Oders oders;
    Gson gson=new Gson();
    @Override
    //增加订单
    public void insert_oder(Integer index,Integer fee,String addr,String time,String openid,String text,String telephone) {
        String major=Uilt.major_case(index);
        oders.insert_oder(major,fee,addr,time,openid,text,telephone);
    }
    //删除订单
    @Override
    public void delete_oder(int id) {
        oders.delete_oder(id);
    }
    //修改订单
    @Override
    public void receive_oder(int oder_id, String student_id) {
        oders.receive_oder(oder_id,student_id);
    }

    @Override
    public void delete_student(int oder_id) {
        oders.delete_student(oder_id);
    }

    //查询订单
    @Override
    public String select_all(){
        ArrayList<Oder_Format> arrayList =oders.select_all();
        String select_all=gson.toJson(arrayList);
        return select_all;
    }

    //根据学科查询订单
    @Override
    public String select_condition_oder(int index,int max,int min){
        String major= Uilt.major_case(index);
        ArrayList<Oder_Format> arrayList=oders.condition_select(major);
        String major_oder=select_money_oder(arrayList,max,min);
        return major_oder;
    }

    @Override
    public String select_money_oder(ArrayList<Oder_Format> arrayList,int max, int min) {
        Iterator<Oder_Format> iterator=arrayList.iterator();
        if(max!=0){
            while (iterator.hasNext()){
                Oder_Format oder_format=iterator.next();
                if(oder_format.getFee()>max){
                    iterator.remove();
                }
            }
        }
        iterator=arrayList.iterator();
        if(min!=0){
            while (iterator.hasNext()){
                Oder_Format oder_format=iterator.next();
                if(oder_format.getFee()<min){
                    iterator.remove();
                }
            }
        }
        String select_money_oder=gson.toJson(arrayList);
        return  select_money_oder;
    }

    @Override
    public String id_select(String openid) {
        ArrayList<Oder_Format> arrayList=oders.id_select(openid);
        String id_select=gson.toJson(arrayList);
        return id_select;
    }
    @Override
    public String student_id_select(String openid) {
        ArrayList<Oder_Format> arrayList=oders.student_id_select(openid);
        String student_id_select=gson.toJson(arrayList);
        return student_id_select;
    }
}
