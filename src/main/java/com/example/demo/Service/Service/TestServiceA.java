package com.example.demo.Service.Service;

import com.example.demo.Dao.TestDao;
import com.example.demo.Service.TestService;
import com.example.demo.pojo.User;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TestServiceA implements TestService {
    @Autowired
    private TestDao testDao;
    @Override
    public String json() {
        ArrayList<User> userList=testDao.getuserlist();
        Gson gson=new Gson();
        String str=gson.toJson(userList);
        return str;
    }
}
//        for (int i=0;i<userList.size();i++) {
//            str+= userList.get(i).toString();
//            if(i<userList.size()-1)
//            {
//                str+=","+"\n";
//            }
//        }
//        str+="]}";