package com.GMS.controller;

import com.GMS.service.UpdateService;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "UpdateServlet", value = "/UpdateServlet")
public class UpdateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = (String) request.getSession().getAttribute("name"); //用户名
        String password = request.getParameter("password");  //新密码
        String password1 = request.getParameter("password1"); // 确认密码
        String type = request.getParameter("type");
        String res = "fail";
        if(password1.equals(password)){   //两次输入结果对比 相同则进行修改否则直接返回结果
            UpdateService us = new UpdateService();
            res = us.update(password,username);
            HttpSession session = request.getSession();
            session.setAttribute("type",type);
            session.setAttribute("res",res);
        }else {
            HttpSession session = request.getSession();
            session.setAttribute("type",type);
            session.setAttribute("res",res);
        }
        response.sendRedirect("/GMS/jsp/res.jsp");

    }
}
