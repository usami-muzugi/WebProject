<%@ page import="chapter2.login.utils.CookieUtils" %><%--
  Created by IntelliJ IDEA.
  User: Wizard
  Date: 2018/3/12
  Time: 20:26
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
    <!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <script
            src="http://code.jquery.com/jquery-3.3.1.min.js"
            integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8="
            crossorigin="anonymous"></script>
    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
    <title>菜品管理系统界面</title>
</head>
<body>
<%
    String username="";
    Cookie[] cookies = request.getCookies();
    // 从Cookie的数组中查找指定名称的Cookie
    Cookie cookie = CookieUtils.findCookie(cookies, "username");
    if(cookie != null){
        username = cookie.getValue();
    }

    if(session.getAttribute("username")!=null){
        username = (String)session.getAttribute("username");
    }

    String msg = "";
    if (request.getAttribute("Msg") != null) {
        msg = (String) request.getAttribute("Msg");
    }
%>
<h3 class="h3 text-center">菜品管理系统界面-登录页面</h3>
<div class="col-lg-2">
    <h4 class="h4 color"><font color="#dc143c"><%=msg%></font></h4>
    <form class="form-group" action="/chapter2/homework/LoginServlet">
        <label>用户名:</label><input class="form-control" type="text" value="<%=username%>" name="user" placeholder="可输入用户名、Email、ID">
        <label>密码:</label><input class="form-control" type="password" name="userpassword">
        <input type="checkbox" name="remember" value="true" checked="checked"> 记住用户名</td>
        <button class="btn btn-info" type="submit">登录</button>
        <button class="btn btn-warning"><a href="forget.jsp">忘记密码？</a></button>
    </form>
</div>
</body>
</html>
