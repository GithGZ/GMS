package com.GMS.service;


import com.GMS.dao.LoginDao;

import java.util.HashMap;

public class LoginService {

    public HashMap login(String userName,String pwd){
        //浏览器和数据库做比对处理
        String res = "fail";//返回给servlet的结果 默认失败
        String type = null;
        String id="";
        if (userName != null) {
            LoginDao dao = new LoginDao();
            HashMap map = dao.selectUser(userName);
            String str = map.keySet().toString();
            type = str.substring(1,str.length()-5);
            String password = (String) map.get(type);
            id= (String) map.get("id");
            if (password !=null&&pwd.equals(password)) {
                res = "success";  //成功
            }
        }
        HashMap map = new HashMap();
        map.put(type,res);
        map.put("id",id);
        return map;

    }

}
