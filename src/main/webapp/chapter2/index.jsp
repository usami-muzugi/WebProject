<%--
  Created by IntelliJ IDEA.
  User: Wizard
  Date: 2018/3/1
  Time: 20:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>LoginPage</title>
</head>
<body>
    <center>
        <form action="http://localhost/chapter2/login" method="post">
            <p>用户名:<input type="text" name="username">
            <p>密&nbsp;码:<input type="password" name="password"></p>
            <P>
                <input type="submit" value="登录">
                <input type="reset" value="重置">
            </P>
        </form>
    </center>
</body>
</html>
