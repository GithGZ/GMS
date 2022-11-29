package com.GMS.dao;

import com.GMS.util.DBUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UserDao {
    public List user() {
        List list = new ArrayList<>();
        DBUtil util = new DBUtil();
        Connection conn = util.getConnection();
        Statement st = util.getStatenent();
        String sql = "select *from user ;";
        try {
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()){
                String id = rs.getString("id");
                String username = rs.getString("username");
                String password = rs.getString("password");
                String type = rs.getString("type");
                HashMap map = new HashMap<>();
                map.put("id",id);
                map.put("username",username);
                map.put("password",password);
                map.put("type",type);
                list.add(map);
            }
            util.close(rs,conn,st);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
}
