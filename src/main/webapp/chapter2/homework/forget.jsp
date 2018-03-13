<%--
  Created by IntelliJ IDEA.
  User: Wizard
  Date: 2018/3/12
  Time: 21:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>忘记密码</title>
</head>
<body>
<h3 align="left">忘记密码</h3>
<h3 align="left"><%
    String string;
    if ((string = (String) request.getAttribute("Msg")) != null) {
        out.print(string);
    }
%></h3>
<form action="/chapter2/homework/UserForgetPasswordServlet">
    用户名:<input name="username">
    <input type="submit" value="确认">
</form>
</body>
</html>
