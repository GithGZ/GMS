package com.GMS.controller;

import com.GMS.service.InsUserService;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "InsUserServlet", value = "/InsUserServlet")
public class InsUserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String type = request.getParameter("type");
        InsUserService iis = new InsUserService();
        String res = iis.insert(username,password,type);
        HttpSession session = request.getSession();
        session.setAttribute("type","admin");
        session.setAttribute("res",res);
        response.sendRedirect("/GMS/jsp/res.jsp");
    }
}
