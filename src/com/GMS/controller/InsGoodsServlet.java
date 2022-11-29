package com.GMS.controller;

import com.GMS.service.InsGoodsService;
import com.GMS.service.InsUserService;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "InsGoodsServlet", value = "/InsGoodsServlet")
public class InsGoodsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String price = request.getParameter("price");
        String brief = request.getParameter("brief");
        InsGoodsService iis = new InsGoodsService();
        String res = iis.insert(name,price,brief);
        HttpSession session = request.getSession();
        session.setAttribute("type","admin");
        session.setAttribute("res",res);
        response.sendRedirect("/GMS/jsp/res.jsp");
    }
}
