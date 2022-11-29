package com.GMS.controller;

import com.GMS.service.LoginService;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.HashMap;

@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //1.用户信息接收
        String userName = request.getParameter("username");
        String pwd = request.getParameter("password");
        //2.将数据传递给service去处理，并接收service处理结果
        LoginService service = new LoginService();
        HashMap map = service.login(userName, pwd);
        String str = map.keySet().toString();
        String type = str.substring(1, str.length() - 5);
        String res = (String) map.get(type);
        String id = (String) map.get(("id"));
        if (res ==null) {
            response.sendRedirect("/GMS/jsp/Login.jsp");
        } else if ("success".equals(map.get(type).toString())) {
            //把用户信息放session中
            HttpSession session = request.getSession();
            session.setAttribute("userName", userName);
            session.setAttribute("user_id",id);
            //跳转到主页面
            if (type.equals("1"))
                response.sendRedirect("/GMS/jsp/admin-index.jsp");
            else
                response.sendRedirect("/GMS/jsp/user-index.jsp");

        } else {
            response.sendRedirect("/GMS/jsp/Login.jsp");
        }
    }

}
