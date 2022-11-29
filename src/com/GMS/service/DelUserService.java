package com.GMS.service;

import com.GMS.dao.DelUserDao;

public class DelUserService {
    public String delete(String id) {
        DelUserDao dud = new DelUserDao();
        return dud.delete(id);
    }
}
