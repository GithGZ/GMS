package com.GMS.dao;

import com.GMS.util.DBUtil;

import java.sql.Connection;
import java.sql.Statement;

public class DelUserDao {
    public String delete(String id) {
        DBUtil util = new DBUtil();
        Connection conn = util.getConnection();
        Statement st = util.getStatenent();
        String sql ="delete from user where id='"+id+"';";
        String res = util.getSQLResult(sql,st);
        return res;
    }
}
