package com.GMS.controller;

import com.GMS.service.AEvaluateService;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "AEvaluateServlet", value = "/AEvaluateServlet")
public class AEvaluateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        AEvaluateService us = new AEvaluateService();
        List list = us.evaluate(id);
        HttpSession session = request.getSession();
        session.setAttribute("Alist",list);
        response.sendRedirect("/GMS/jsp/evaluate-admin.jsp");

    }
}
