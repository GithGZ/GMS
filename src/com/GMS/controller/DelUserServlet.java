package com.GMS.controller;

import com.GMS.service.DelUserService;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "DelUserServlet", value = "/DelUserServlet")
public class DelUserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        DelUserService dus = new DelUserService();
        String res = dus.delete(id);
        HttpSession session = request.getSession();
        session.setAttribute("res",res);
        session.setAttribute("type","admin");
        response.sendRedirect("/GMS/jsp/res.jsp");
    }
}
