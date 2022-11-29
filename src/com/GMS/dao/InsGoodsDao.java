package com.GMS.dao;

import com.GMS.util.DBUtil;

import java.sql.Connection;
import java.sql.Statement;

public class InsGoodsDao {
    public String insert(String name, String price, String brief) {
        DBUtil util = new DBUtil();
        Connection conn = util.getConnection();
        Statement st = util.getStatenent();
        String sql = "insert into goods(name,price,brief) values ('"+name+"','"+price+"','"+brief+"');";
        String res = util.getSQLResult(sql,st);
        util.close(null,conn,st);
        return res;
    }
}
