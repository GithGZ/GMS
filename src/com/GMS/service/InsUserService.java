package com.GMS.service;

import com.GMS.dao.InsUserDao;

public class InsUserService {
    public String insert(String username, String password, String type) {
        InsUserDao iud = new InsUserDao();
        return iud.insert(username,password,type);
    }
}
