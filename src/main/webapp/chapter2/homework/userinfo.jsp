<%@ page import="chapter2.homework.usersUtils.User" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Wizard
  Date: 2018/3/12
  Time: 22:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%
    List<User> userList = (List<User>) application.getAttribute("UserList");
    User user = null;
    for (User u:userList
         ) {
        if (u.getUserName().equals(session.getAttribute("username"))) {
            user = u;
        }
    }

%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <script
            src="http://code.jquery.com/jquery-3.3.1.min.js"
            integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8="
            crossorigin="anonymous"></script>
    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
    <title>用户信息</title>
</head>
<body>
<h3 class="h3 text-center">菜品管理系统界面-用户信息管理</h3>
<hr/>
<h4 class="h4 text-left">当前用户信息</h4>
<h4>用户ID:<%=user.getUserId()%></h4>
<h4>用户名:<%=user.getUserName()%></h4>
<h4>用户邮箱:<%=user.getUserEmail()%></h4>
<h4>用户密码:<%=user.getUserPassword()%></h4>
<h4>用户问题:<%=user.getUserQuestion()%></h4>
<h4>用户密保:<%=user.getUserAnswer()%></h4>
<h4>用户头像:<%=user.getUserIcon()%></h4>
<hr>
<h3 class="h3 text-left">修改</h3>
<form action="/chapter2/homework/UserUploadServlet" method="post" class="form-group col-lg-2" enctype="multipart/form-data">
    <label>用户ID:</label><input class="form-control" name="userid" type="text" value="<%=user.getUserId()%>">
    <label>用户名:</label><input class="form-control" name="username" type="text" value="<%=user.getUserName()%>">
    <label>用户邮箱:</label><input class="form-control" name="useremail" type="text" value="<%=user.getUserEmail()%>">
    <label>用户密码:</label><input class="form-control" name="userpassword" type="text" value="<%=user.getUserPassword()%>">
    <label>用户问题:</label><input class="form-control" name="userquestion" type="text" value="<%=user.getUserQuestion()%>">
    <label>用户密保:</label><input class="form-control" name="useranswer" type="text" value="<%=user.getUserAnswer()%>">
    <label>用户头像:</label><input class="form-control" type="file" name="upload">
    <button class="btn btn-info" type="submit">修改</button>
    <button class="btn btn-warning"><a href="foodslist.jsp">返回</a></button>
</form>
</body>
</html>
