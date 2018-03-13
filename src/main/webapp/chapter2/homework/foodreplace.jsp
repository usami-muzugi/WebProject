<%--
  Created by IntelliJ IDEA.
  User: Wizard
  Date: 2018/3/13
  Time: 20:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="chapter2.homework.foodsUtils.Food" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Iterator" %>
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
    <title>菜品管理系统 - 修改菜品</title>
</head>
<body>
<header class="page-header">
    <h2 class="h2 text-center">菜品管理系统 - 修改菜品</h2>
    <h3 class="h3 text-right col-lg-11">欢迎回来，<%=session.getAttribute("username")%><img class="img img-thumbnail img-circle img-" src="upload/<%=request.getSession().getAttribute("icon")%>"> <a href="userinfo.jsp" class="btn btn-success">用户信息</a></h3>
</header>
<%
    int index = Integer.valueOf(request.getParameter("foodId"));
    List<Food> list = (List<Food>) application.getAttribute("FoodList");
    Food food = null;
    Iterator<Food> iterator = list.iterator();
    while (iterator.hasNext()) {
        food = iterator.next();
        if (food.getFoodId() == index) {
            break;
        }
    }
%>
<form action="" enctype="multipart/form-data">
<table class="table">
    <tr>
        <th>#</th>
        <th>菜品名</th>
        <th>菜品口味</th>
        <th>菜品图片</th>
        <th>菜品价格</th>
        <th>菜品信息</th>
    </tr>
    <tr>
        <td><input type="text"name="id" value="<%=food.getFoodId()%>"></td>
        <td><input type="text"name="name" value="<%=food.getFoodName()%>"></td>
        <td><input type="text"name="taste" value="<%=food.getFoodTaste()%>"></td>
        <td><input type="file"name="file" value="<%=food.getFoodIcon()%>"></td>
        <td><input type="text"name="price" value="<%=food.getFoodPrice()%>"></td>
        <td><input type="text"name="info" value="<%=food.getFoodInfo()%>"></td>
    </tr>
</table>
    <input class="btn btn-info" type="submit" value="确定">
</form>
<footer>
    <h3 class="col-lg-12 text-right"><a href="foodadd.jsp" class="btn btn-success">添加菜品</a></h3>
    <h3 class="col-lg-12 text-right"><a href="foodslist.jsp" class="btn btn-success">返回</a></h3>
    <h3 class="col-lg-12 text-right"><a href="logout.jsp" class="btn btn-success">退出</a></h3>
</footer>
</body>
</html>