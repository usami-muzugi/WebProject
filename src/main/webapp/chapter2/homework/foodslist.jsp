<%@ page import="chapter2.homework.foodsUtils.Food" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Wizard
  Date: 2018/3/12
  Time: 20:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
    <title>菜品管理系统</title>
</head>
<body>
<header class="page-header">
    <h2 class="h2 text-center">菜品管理系统</h2>
    <h3 class="h3 text-right col-lg-11">欢迎回来，<%=session.getAttribute("username")%><img class="img img-thumbnail img-circle img-" src="upload/<%=request.getSession().getAttribute("icon")%>"> <a href="userinfo.jsp" class="btn btn-success">用户信息</a></h3>
</header>
<table class="table table-hover table-bordered table-striped">
    <tr class="table">
        <th>#</th>
        <th>菜品名</th>
        <th>菜品口味</th>
        <th>菜品图片</th>
        <th>菜品价格</th>
        <th>菜品信息</th>
        <th>修改</th>
        <th>删除</th>
    </tr>
    <%
        List<Food> list = (List<Food>)application.getAttribute("FoodList");
        for (Food li:list
                ) {
    %>
    <tr>
        <td><%=li.getFoodId()%></td>
        <td><%=li.getFoodName()%></td>
        <td><%=li.getFoodTaste()%></td>
        <td><%=li.getFoodIcon()%></td>
        <td><%=li.getFoodPrice()%></td>
        <td><%=li.getFoodInfo()%></td>
        <td><a class="btn btn-info">修改</a></td>
        <td><a class="btn btn-warning" href="remove.jsp?foodId=<%=li.getFoodId()%>">删除</a></td>
    </tr>
    <%
        }
    %>
</table>
<footer>
    <h3 class="col-lg-12 text-right"><a href="foodadd.jsp" class="btn btn-success">添加菜品</a></h3>
    <h3 class="col-lg-12 text-right"><a href="logout.jsp" class="btn btn-success">退出</a></h3>
</footer>
</body>
</html>