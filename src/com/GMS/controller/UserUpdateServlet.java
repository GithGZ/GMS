package com.GMS.controller;

import com.GMS.service.UserUpdateService;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "UserUpdateServlet", value = "/UserUpdateServlet")
public class UserUpdateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = (String) request.getSession().getAttribute("id");
        String typename = (String) request.getSession().getAttribute("typename");
        String newname = request.getParameter("new");
        UserUpdateService uus = new UserUpdateService();
        String res = uus.update(id,typename,newname);
        HttpSession session = request.getSession();
        session.setAttribute("type","admin");
        session.setAttribute("res",res);
        response.sendRedirect("/GMS/jsp/res.jsp");
    }
}
