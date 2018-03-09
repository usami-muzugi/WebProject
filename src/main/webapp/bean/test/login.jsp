<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="http://localhost/bootstrap/css/bootstrap.min.css"/>
    <script src="http://localhost/bootstrap/js/jquery-3.3.1.min.js"></script>
    <script src="http://localhost/bootstrap/js/bootstrap.min.js"></script>
<%--
  Created by IntelliJ IDEA.
  Food: wzard
  Date: 2018/2/24
  Time: 15:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
    <title>公告中心登录页面</title>
</head>
<body>
    <h3 class="h3 text-center "><span class="glyphicon glyphicon-bed"></span>登录页面</h3>
    <hr/>
    <form action="attention.jsp">
        <div class="form-group"><label for="username">
            <h5 class="h5">用户名:</h5><input type="text" id="username" name="username" class="form-control form-inline">
        </label>
            <label for="password">
            <h5 class="h5">密码:</h5><input type="password" id="password" name="password" class="form-control form-inline focus-indicator">
        </label></div>
        <input type="submit" value="登录" class="btn btn-default">
    </form>
</body>
</html>
