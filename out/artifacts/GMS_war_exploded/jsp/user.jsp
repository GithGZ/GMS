<%--
  Created by IntelliJ IDEA.
  User: GZ
  Date: 2022/11/28
  Time: 15:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.List" %>
<%@ page import="java.util.HashMap" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% if(session.getAttribute("userName")==null)
    response.sendRedirect("/GMS/jsp/Login.jsp");%>
<html>
<head>
    <title>用户信息</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/table.css" />
    <link rel="stylesheet" type="text/css" href="../css/style-login.css">
</head>
<body>
<table class="table">
    <thead>
    <tr>
        <th>序号</th>
        <th>账户</th>
        <th>密码</th>
        <th>类型</th>
        <th>删除</th>
    </tr>
    </thead>
    <tbody>
    <%
        List<HashMap> list = (List) session.getAttribute("list");
        Integer p = 1;
        if(list != null){
            int t = 5;
            if(t>list.size())t=list.size();
            for (int i = 0;i<t;i++) {
                out.print("<tr>");
                out.print("<td>"+list.get(i).get("id")+"</td>");
                out.print("<td><a href=\"update-user.jsp?typename=username&id="+list.get(i).get("id")+"\">"+list.get(i).get("username")+"</a></td>");
                out.print("<td><a href=\"update-user.jsp?typename=password&id="+list.get(i).get("id")+"\">"+list.get(i).get("password")+"</a></td>");
                out.print("<td><a href=\"update-user.jsp?typename=type&id="+list.get(i).get("id")+"\">"+list.get(i).get("type")+"</a></td>");
                out.print("<td><a href=\"/GMS/DelUserServlet?id="+list.get(i).get("id")+"\">删除用户<a></td>");
                out.print("</tr>");
            }
        }
        request.getSession().setAttribute("p",p);
    %>
    </tbody>
</table>
<br>
<div align="center">
    <a href="insertuser.jsp"><button class="login-button">新增信息</button></a>
    <a href="user2.jsp"><button class="login-button">上一页</button></a>
    第<%out.print(p);%>页
    <a href="user1.jsp"><button class="login-button">下一页</button></a>
    <a href="admin-index.jsp"><button class="login-button">返回主页</button></a>
</div>
</body>
</html>

