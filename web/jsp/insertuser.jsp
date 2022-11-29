<%--
  Created by IntelliJ IDEA.
  User: GZ
  Date: 2022/11/28
  Time: 15:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<% if(session.getAttribute("userName")==null)
    response.sendRedirect("/GMS/jsp/Login.jsp");%>

<html>
<head>
    <meta charset="utf-8">
    <title>新增用户</title>
    <link rel="stylesheet" type="text/css" href="../css/style-login.css">
</head>
<body>
<div id="maxbox">
    <h3>新增用户</h3>
    <form action="${pageContext.request.contextPath}/InsUserServlet" method="post">
        <div class="inputbox">
            <div class="inputText">
                <span class="iconfont icon-lock"></span> <input name="username" type="text" placeholder="username">
            </div>
            <div class="inputText">
                <span class="iconfont icon-lock"></span> <input name="password" type="text" placeholder="password">
            </div>
            <div class="inputText">
                <span class="iconfont icon-lock"></span> <input name="type" type="text" placeholder="type">
            </div>
            <input class="inputButton" type="submit" value="新     增">
        </div>
    </form>
</div>
</body>
</html>

