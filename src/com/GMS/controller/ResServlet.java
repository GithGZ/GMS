package com.GMS.controller;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "ResServlet", value = "/ResServlet")
public class ResServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String type = request.getParameter("type");
        if(type.equals("admin"))response.sendRedirect("/GMS/jsp/admin-index.jsp");
        else if(type.equals("user"))response.sendRedirect("/GMS/jsp/user-index.jsp");
        else response.sendRedirect("/GMS/jsp/Login.jsp");
    }
}
