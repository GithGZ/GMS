<%--
  Created by IntelliJ IDEA.
  User: GZ
  Date: 2022/11/28
  Time: 16:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<% if(session.getAttribute("userName")==null)
    response.sendRedirect("/GMS/jsp/Login.jsp");%>

<html>
<head>
    <meta charset="utf-8">
    <title>修改密码</title>
    <link rel="stylesheet" type="text/css" href="../css/style-login.css">
</head>
<body>
<div id="maxbox">
    <h3>修改密码</h3>
    <form action="${pageContext.request.contextPath}/UpdateServlet" method="post">
        <div class="inputbox">
            <%String name = (String) session.getAttribute("name"); out.print("<h4 style=\"color: #a6c0fe;\">用户名："+name+"</h4>");
                request.getSession().setAttribute("name",name);
                request.getSession().setAttribute("type","login");%>
            <div class="inputText">
                <span class="iconfont icon-mine"></span> <input name="password" type="password"
                                                                placeholder="新密码" autocomplete="off">
            </div>
            <div class="inputText">
                <span class="iconfont icon-lock"></span> <input name="password1" type="password"
                                                                placeholder="确认密码">
            </div>
            <input class="inputButton" type="submit" value="修     改">
        </div>
    </form>
</div>
</body>
</html>
