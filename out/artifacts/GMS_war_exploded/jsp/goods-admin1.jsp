<%--
  Created by IntelliJ IDEA.
  User: GZ
  Date: 2022/11/28
  Time: 17:08
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
    Integer p=(Integer) request.getSession().getAttribute("p");
    if(p !=null&&(p*5)<list.size()) p =p+1;
    if(list != null){
      for (int i = 5*(p-1);i<5*p;i++) {
        if(i>=list.size())break;
        out.print("<tr>");
        out.print("<td>"+list.get(i).get("id")+"</td>");
        out.print("<td><a href=\"update-goods.jsp?typename=name&id="+list.get(i).get("id")+"\">"+list.get(i).get("name")+"</a></td>");
        out.print("<td><a href=\"update-goods.jsp?typename=price&id="+list.get(i).get("id")+"\">"+list.get(i).get("price")+"</a></td>");
        out.print("<td><a href=\"update-goods.jsp?typename=brief&id="+list.get(i).get("id")+"\">"+list.get(i).get("brief")+"</a></td>");
        out.print("<td><a href=\"/GMS/AEvaluateServlet?id="+list.get(i).get("id")+"\">查看<a></td>");
        out.print("</tr>");
      }
    }
    request.getSession().setAttribute("p",p);
  %>
  </tbody>
</table>
<br>
<div align="center">
  <a href="insertgoods.jsp"><button class="login-button">新增商品</button></a>
  <a href="goods-admin2.jsp"><button class="login-button">上一页</button></a>
  第<%out.print(p);%>页
  <a href="goods-admin1.jsp"><button class="login-button">下一页</button></a>
  <a href="admin-index.jsp"><button class="login-button">返回主页</button></a>
</div>
</body>
</html>
