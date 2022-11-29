<%--
  Created by IntelliJ IDEA.
  User: GZ
  Date: 2022/11/28
  Time: 9:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% if(session.getAttribute("userName")==null)
    response.sendRedirect("/GMS/jsp/Login.jsp");%>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="../css/style-login.css">
</head>
<body>

<div id="maxbox">
    <h3>商品管理系统</h3>
    <%
        String res = (String) session.getAttribute("res");
        String type = (String) session.getAttribute("type");
        if(res != null) {
            if (!res.equals("fail"))
                out.println("<h2 style=\"color: #a6c0fe;\">操作成功<h2>");
            else
                out.println("<h2 style=\"color: #a6c0fe;\">操作失败<h2>");
        }%>
    <a href="${pageContext.request.contextPath}/ResServlet?type=<%out.print(type);%>"><button class="login-button">返回主页</button></a>
</div>

</body>
</html>

