<%@ page import="chapter2.homework.user.User" %>
<%@ page import="chapter2.homework.foods.Food" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Wizard
  Date: 2018/3/11
  Time: 20:12
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
    <title>菜品管理系统 - 添加菜品</title>
</head>
<body>
<header class="page-header">
    <h2 class="h2 text-center">菜品管理系统 - 添加菜品</h2>
    <h3 class="h3 text-right col-lg-11">欢迎回来，<%=User.getUserName()%> <a href="userinfo.jsp" class="btn btn-success">用户信息</a></h3>
</header>
<div>
    <table class="table table-hover table-bordered table-striped">
        <tr class="table">
            <th>#</th>
            <th>菜品名</th>
            <th>菜品口味</th>
            <th>菜品图片</th>
            <th>菜品价格</th>
            <th>菜品信息</th>
        </tr>
        <%
            List<Food> list = (List<Food>)application.getAttribute("foodsList");
            for (Food li:list
                    ) {
        %>
        <tr>
            <td><%=li.getFoodsId()%></td>
            <td><%=li.getFoodsName()%></td>
            <td><%=li.getFoodsTaste()%></td>
            <td><%=li.getFoodsImg()%></td>
            <td><%=li.getFoodsPrice()%></td>
            <td><%=li.getFoodsInfo()%></td>
        </tr>
        <%
            }
        %>
    </table>
</div>
<hr/>
<form action="/chapter2/homework/upload" enctype="multipart/form-data">
    <div class="form-group">
    <table class="table table-hover table-bordered table-striped">
        <tr class="table">
            <th>#</th>
            <th>菜品名</th>
            <th>菜品口味</th>
            <th>菜品图片</th>
            <th>菜品价格</th>
            <th>菜品信息</th>
        </tr>
        <tr>
            <td><input class="form-control" name="id"></td>
            <td><input class="form-control" name="name"></td>
            <td><input class="form-control" name="taste"></td>
            <td><input class="form-control" type="file" name="img"></td>
            <td><input class="form-control" name="price"></td>
            <td><input class="form-control" name="info"></td>
        </tr>
    </table>
        <input class="col-lg-1 btn btn-info pull-right" value="提交" type="submit">
    </div>
</form>
</body>
</html>
