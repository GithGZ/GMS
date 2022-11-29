<%--
  Created by IntelliJ IDEA.
  User: GZ
  Date: 2022/11/27
  Time: 23:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<html>
<head>
  <meta charset="utf-8">
  <title>注册页面</title>
  <link rel="stylesheet" type="text/css" href="../css/style-login.css">
</head>
<body>
<div id="maxbox">
  <h3>账号注册</h3>
  <form action="${pageContext.request.contextPath}/RegisterServlet" method="post">
    <div class="inputbox">
      <div class="inputText">
        <span class="iconfont icon-mine"></span><h4>用户名：<input name="username" type="text"
                                                                  placeholder="name" autocomplete="off"></h4>
      </div>
      <div class="inputText">
        <span class="iconfont icon-lock"></span> <h4>密码：<input name="password" type="password"
                                                                 placeholder="Password"></h4>
      </div>
      <div class="inputText">
        <span class="iconfont icon-lock"></span> <h4>密码：<input name="password1" type="password"
                                                                 placeholder="Password"></h4>
      </div>
      <input class="inputButton" type="submit" value="注     册">
    </div>
  </form>
</div>
</body>
</html>

