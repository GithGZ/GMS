<%--
  Created by IntelliJ IDEA.
  User: GZ
  Date: 2022/11/21
  Time: 10:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<html>
<head>
  <meta charset="utf-8">
  <title>登陆页面</title>
  <link rel="stylesheet" type="text/css" href="../css/style-login.css">
</head>
<body>
<div id="maxbox">
  <h3>商品管理系统</h3>
  <form action="${pageContext.request.contextPath}/LoginServlet" method="post">
    <div class="inputbox">
      <div class="inputText">
        <span class="iconfont icon-mine"></span><h4>用户名：<input name="username" type="text"
                                                        placeholder="name" autocomplete="off"></h4>
      </div>
      <div class="inputText">
        <span class="iconfont icon-lock"></span> <h4>密码：<input name="password" type="password"
                                                        placeholder="Password"></h4>
      </div>
      <input class="inputButton" type="submit" value="登     录">
      &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<a class="loginA" href="register.jsp">注册</a>
    </div>
  </form>

</div>
</body>
</html>
