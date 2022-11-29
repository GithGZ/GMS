package com.GMS.service;

import com.GMS.dao.UserDao;

import java.util.List;

public class UserService {
    public List user() {
        UserDao ud = new UserDao();
        List list = ud.user();
        return list;
    }
}
