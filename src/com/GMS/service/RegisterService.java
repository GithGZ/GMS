package com.GMS.service;

import com.GMS.dao.RegisterDao;

public class RegisterService {
    public String register(String name, String pwd) {
        RegisterDao rd = new RegisterDao();
        String res = rd.register(name,pwd);
        return res;
    }
}
