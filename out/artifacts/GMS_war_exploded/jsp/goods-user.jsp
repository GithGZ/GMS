<%--
  Created by IntelliJ IDEA.
  User: GZ
  Date: 2022/11/28
  Time: 17:04
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
        <th>商品名</th>
        <th>价格</th>
        <th>简介</th>
        <th>查看</th>
    </tr>
    </thead>
    <tbody>
    <%
        List<HashMap> list = (List) session.getAttribute("list");
        request.getSession().setAttribute("elist",list);
        String user_id = (String) request.getSession().getAttribute("user_id");
        request.getSession().setAttribute("user_id",user_id);
        Integer p = 1;
        if(list != null){
            int t = 5;
            if(t>list.size())t=list.size();
            for (int i = 0;i<t;i++) {
                out.print("<tr>");
                out.print("<td>"+list.get(i).get("id")+"</td>");
                out.print("<td>"+list.get(i).get("name")+"</td>");
                out.print("<td>"+list.get(i).get("price")+"</td>");
                out.print("<td>"+list.get(i).get("brief")+"</td>");
                out.print("<td><a href=\"evaluate.jsp?id="+list.get(i).get("id")+"\">评论<a></td>");
                out.print("</tr>");
            }
        }
        request.getSession().setAttribute("p",p);
    %>
    </tbody>
</table>
<br>
<div align="center">
    <a href="goods-user2.jsp"><button class="login-button">上一页</button></a>
    第<%out.print(p);%>页
    <a href="goods-user1.jsp"><button class="login-button">下一页</button></a>
    <a href="admin-index.jsp"><button class="login-button">返回主页</button></a>
</div>
</body>
</html>
