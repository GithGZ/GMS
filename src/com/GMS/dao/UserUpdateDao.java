package com.GMS.dao;

import com.GMS.util.DBUtil;

import java.sql.Connection;
import java.sql.Statement;

public class UserUpdateDao {
    public String update(String id, String typename, String newname) {
        String res = "fail";
        DBUtil util = new DBUtil();
        Connection conn = util.getConnection();
        Statement st = util.getStatenent();
        String sql = "update user set "+typename+"='"+newname+"'where id = '"+id+"';";
        res = util.getSQLResult(sql,st);
        util.close(null,conn,st);
        return res;
    }
}
