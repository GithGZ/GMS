package com.GMS.dao;

import com.GMS.util.DBUtil;

import java.sql.Connection;
import java.sql.Statement;

public class EvaDao {
    public String insert(String user_id, String id, String eva) {
        DBUtil util = new DBUtil();
        Connection conn = util.getConnection();
        Statement st = util.getStatenent();
        String sql = "insert into evaluate(goods_id,evaluate,user_id) values ('"+id+"','"+eva+"','"+user_id+"');";
        String res = util.getSQLResult(sql,st);
        util.close(null,conn,st);
        return res;
    }
}
