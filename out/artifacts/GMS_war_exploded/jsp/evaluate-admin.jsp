<%@ page import="java.util.List" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: GZ
  Date: 2022/11/28
  Time: 18:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<% if(session.getAttribute("userName")==null)
    response.sendRedirect("/GMS/jsp/Login.jsp");%>
<html>
<head>
    <meta charset="utf-8">
    <title>查看商品信息</title>
    <link rel="stylesheet" type="text/css" href="../css/style-login.css">
</head>
<body>
<div id="maxbox">
    <h3>查看商品信息</h3>
    <%List<HashMap> list = (List) session.getAttribute("Alist");
        if(list!=null) {
            if(list.size()>0){%>
        <div class="inputbox">
            <div class="inputText">
                <span class="iconfont icon-mine"></span><h4>商品名： <%out.print(list.get(0).get("name"));%></h4>
            </div>
            <div class="inputText">
                <span class="iconfont icon-lock"></span> <h4>商品简介：<%out.print(list.get(0).get("brief"));%></h4>
            </div>
            <div class="inputText">
                <span class="iconfont icon-lock"></span> <h4>商品价格：<%out.print(list.get(0).get("price"));%></h4>
            </div>
            <div class="inputText">
                <%

                            for (int i = 0; i < list.size(); i++) {
                                out.print("<span class=\"iconfont icon-lock\"></span> <h4>商品评价:用户"+list.get(i).get("user_id")+"  " + list.get(i).get("evaluate") + "</h4>");
                            }
                        }else out.print("<h4>暂无评价！！！</h4>");
                    }%>
                <a href="goods-admin.jsp"><button class="login-button">返回</button></a>
            </div>

        </div>

</div>

</body>
</html>
