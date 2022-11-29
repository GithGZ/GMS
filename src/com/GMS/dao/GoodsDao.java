package com.GMS.dao;

import com.GMS.util.DBUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GoodsDao {
    public List Goods() {
        List list = new ArrayList<>();
        DBUtil util = new DBUtil();
        Connection conn = util.getConnection();
        Statement st = util.getStatenent();
        String sql = "select *from goods ;";
        try {
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()){
                String id = rs.getString("id");
                String name = rs.getString("name");
                String price = rs.getString("price");
                String brief = rs.getString("brief");
                HashMap map = new HashMap<>();
                map.put("id",id);
                map.put("name",name);
                map.put("price",price);
                map.put("brief",brief);
                list.add(map);
            }
            util.close(rs,conn,st);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
}
