package com.GMS.service;

import com.GMS.dao.UserUpdateDao;

public class UserUpdateService {
    public String update(String id, String typename, String newname) {
        UserUpdateDao uud = new UserUpdateDao();
        String res = uud.update(id,typename,newname);
        return res;
    }
}
