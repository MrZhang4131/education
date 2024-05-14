package com.example.demo.conttler;

import com.example.demo.Service.OpenID_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Open_ID {
    @Autowired
    private OpenID_Service openIDService;
    //    获取小程序openid
    @RequestMapping("/testopenid")
    public String getUserInfo(@RequestParam(name = "code") String code) throws Exception {
        String openid=openIDService.  getid(code);
        System.out.println(1);
        return openid;
    }
    @RequestMapping("/getid")
    @CrossOrigin(origins = "*")
    public String getUserInfo(int id)  {
        System.out.println(id);
        System.out.println(1);
        return "222";
    }
}
