package com.GMS.dao;

import com.GMS.util.DBUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AEvaluateDao {
    public List evaluate(String id) {
        List list = new ArrayList<>();
        DBUtil util = new DBUtil();
        Connection conn = util.getConnection();
        Statement st = util.getStatenent();
        String sql = "select *from evaluate,goods where evaluate.goods_id=goods.id and goods.id = '"+id+"' ;";
        try {
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()){
                String name = rs.getString("id");
                String user_id = rs.getString("user_id");
                String price = rs.getString("price");
                String brief = rs.getString("brief");
                String evaluate = rs.getString("evaluate");
                HashMap map = new HashMap<>();
                map.put("name",name);
                map.put("user_id",user_id);
                map.put("price",price);
                map.put("brief",brief);
                map.put("evaluate",evaluate);
                list.add(map);
            }
            util.close(rs,conn,st);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
}
