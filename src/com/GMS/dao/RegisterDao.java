package com.GMS.dao;

import com.GMS.util.DBUtil;

import java.sql.Connection;
import java.sql.Statement;

public class RegisterDao {
    public String register(String name, String pwd) {
        String res = "fail";
        DBUtil util = new DBUtil();
        Connection conn = util.getConnection();
        Statement st = util.getStatenent();
        //注册默认为普通成员，可以由管理员admin修改权限
        String sql = "insert into user(username,password) values ('"+name+"','"+pwd+"');";
        res = util.getSQLResult(sql,st);
        util.close(null,conn,st);
        return res;
    }
}
