<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: GZ
  Date: 2022/11/29
  Time: 10:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<% if(session.getAttribute("userName")==null)
    response.sendRedirect("/GMS/jsp/Login.jsp");%>

<html>
<head>
    <meta charset="utf-8">
    <title>评论</title>
    <link rel="stylesheet" type="text/css" href="../css/style-login.css">
</head>
<body>
<div id="maxbox">
    <h3>评论</h3>
    <%
        String id = request.getParameter("id");
        String user_id = (String) request.getSession().getAttribute("user_id");
        request.getSession().setAttribute("user_id",user_id);
        request.getSession().setAttribute("id",id);
        List<HashMap> list = (List) session.getAttribute("elist");
        if(list!=null) {
            if(list.size()>0){%>
    <form action="${pageContext.request.contextPath}/EvaServlet" method="post">
        <div class="inputText">
            <span class="iconfont icon-mine"></span><h4>商品名： <%out.print(list.get(0).get("name"));%></h4>
        </div>
        <div class="inputText">
            <span class="iconfont icon-mine"></span><h4>用户ID： <%out.print(user_id);%></h4>
        </div>
        <div class="inputbox">
            <div class="inputText">
                    <textarea rows="8" cols="30" name="eva"></textarea>
            </div>
            <input class="inputButton" type="submit" value="新     增">
        </div>
    </form>
    <%}}%>
</div>
</body>
</html>



