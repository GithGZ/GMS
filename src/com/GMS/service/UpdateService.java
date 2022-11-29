package com.GMS.service;

import com.GMS.dao.UpdateDao;

public class UpdateService {
    public String update(String password, String username) {
        UpdateDao ud = new UpdateDao();
        return ud.update(password,username);
    }
}
