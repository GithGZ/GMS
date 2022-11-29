package com.GMS.controller;

import com.GMS.service.GoodsService;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "GoodsServlet", value = "/GoodsServlet")
public class GoodsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String type = (String) request.getSession().getAttribute("type");
        GoodsService us = new GoodsService();
        List list = us.Goods();
        HttpSession session = request.getSession();
        session.setAttribute("list",list);
        if(type.equals("admin")) response.sendRedirect("/GMS/jsp/goods-admin.jsp");
        else response.sendRedirect("/GMS/jsp/goods-user.jsp");
    }
}
