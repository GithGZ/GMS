package com.GMS.controller;

import com.GMS.service.EvaService;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "EvaServlet", value = "/EvaServlet")
public class EvaServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user_id = (String) request.getSession().getAttribute("user_id");
        String id = (String) request.getSession().getAttribute("id");
        String eva = request.getParameter("eva");
        EvaService es = new EvaService();
        String res = es.insert(user_id,id,eva);
        HttpSession session = request.getSession();
        session.setAttribute("type","user");
        session.setAttribute("res",res);
        response.sendRedirect("/GMS/jsp/res.jsp");
    }
}
