package com.GMS.dao;

import com.GMS.util.DBUtil;

import java.sql.Connection;
import java.sql.Statement;

public class UpdateDao {
    public String update(String password, String username) {
        DBUtil util = new DBUtil();
        Connection conn = util.getConnection();
        Statement st = util.getStatenent();
        String sql = "update user set password='"+password+"'where username = '"+username+"';";
        String res =util.getSQLResult(sql,st);
        util.close(null,conn,st);
        return res;
    }
}
