package com.GMS.util;

import java.sql.*;

public class DBUtil {
    public Connection getConnection(){
        Connection conn;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/goods";
            String dbUserName = "root";//mysql数据库软件的用户
            String dbUserPwd = "root";//mysql数据库软件的密码
            conn = DriverManager.getConnection(url,dbUserName,dbUserPwd);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return conn;
    }
    public Statement getStatenent(){
        Statement stmt;
        try {
            Connection conn = getConnection();
             stmt = conn.createStatement();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return stmt;

    }

    public void close(ResultSet rs,Connection conn,Statement stmt)  {
        try {
            if(rs != null)
                rs.close();

            if(conn != null)
                conn.close();

            if (stmt != null)
                stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    /**
     * 获取SQL语句执行结果(增删改)
     * */
    public String getSQLResult(String sql,Statement stmt ){
        String res = "fail";
        try {
            int a = stmt.executeUpdate(sql);
            if(a != 0){
                res = "success";
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }
}
