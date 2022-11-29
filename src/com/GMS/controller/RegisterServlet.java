package com.GMS.controller;

import com.GMS.service.RegisterService;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "RegisterServlet", value = "/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String pwd = request.getParameter("password");
        String pwd1 = request.getParameter("password1");
        String res = "fail";
        HttpSession session = request.getSession();
        if(pwd.equals(pwd1)){
            String name = request.getParameter("username");
            RegisterService rs = new RegisterService();
            res = rs.register(name,pwd);
            session.setAttribute("res",res);
            session.setAttribute("type","register");
        }
        session.setAttribute("res",res);
        response.sendRedirect("/GMS/jsp/res.jsp");
    }
}
