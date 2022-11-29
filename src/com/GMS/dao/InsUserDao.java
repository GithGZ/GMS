package com.GMS.dao;

import com.GMS.util.DBUtil;

import java.sql.Connection;
import java.sql.Statement;

public class InsUserDao {
    public String insert(String username, String password, String type) {
        DBUtil util = new DBUtil();
        Connection conn = util.getConnection();
        Statement st = util.getStatenent();
        String sql = "insert into user(username,password,type) values ('"+username+"','"+password+"','"+type+"');";
        String res = util.getSQLResult(sql,st);
        util.close(null,conn,st);
        return res;
    }
}
