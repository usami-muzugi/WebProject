<%@ page import="chapter2.homework.old.user.User" %><%--
  Created by IntelliJ IDEA.
  User: Wizard
  Date: 2018/3/8
  Time: 22:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="/bootstrap/css/bootstrap.css"/>
    <script src="/bootstrap/js/jquery-3.3.1.min.js"></script>
    <script src="/bootstrap/js/bootstrap.js"></script>
    <title>欢迎使用菜品管理系统</title>
</head>
<body>
<header class="page-header">
    <h2 class="h2 text-center">欢迎使用菜品管理系统</h2>
</header>
<div class="col-lg-2">
    <form class="form-group" action="/chapter2/homework/LoginServlet">
        <label>用户名:</label><input class="form-control" type="text" name="username" value="<%=User.getUserName()%>">
        <label>密码:</label><input class="form-control" type="password" name="password" value="<%=User.getUserPassword()%>"><button class="btn btn-info btn-block">登录</button>
    </form>
    <h3 class="h3 text-left text-warning">
        <%
            String string = (String) request.getAttribute("Msg");

            if (string!=null) {
                out.print(string);
            }
        %>
    </h3>
</div>
</body>
</html>