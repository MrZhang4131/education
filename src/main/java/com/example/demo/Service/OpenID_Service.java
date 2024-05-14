package com.example.demo.Service;

import java.io.IOException;

public interface OpenID_Service {
    public String getid(String code) throws IOException;
    public void select(String openid);
}
