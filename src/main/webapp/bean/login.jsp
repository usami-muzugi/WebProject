<%--
  Created by IntelliJ IDEA.
  User: wzard
  Date: 2018/2/5
  Time: 11:32
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%
    request.setAttribute("name","ourinsma");
    //request.getRequestDispatcher("result.jsp").forward(request, response);
%>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
    <title>login Page</title>
    <link rel="stylesheet" href="/bootstrap/css/bootstrap.min.css"/>
    <script type="text/javascript" src="../bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="../bootstrap/js/jquery-3.3.1.min.js"></script>
</head>
<body>
<header>
    <div class="header-panel">
        <h3 align="center">人事管理系统登录页面
        </h3>
    </div>
</header>
<hr>
<!-- action 代表了服务端的处理程序-->
<form action="control.jsp" class="col-xs-3 center-block">
    <div class="form-group">
        <label for="account">Account</label>
        <input class="form-control" type="text" name="account" id="account">
    </div>
    <div class="form-group">
        <label for="password">Password</label>
        <input class="form-control" id="password" name="password" type="password"/>
    </div>
    <input type="submit" class="btn btn-default" value="Login"/>

</form>
</body>
</html>
