<%@ page import="chapter2.homework.usersUtils.User" %><%--
  Created by IntelliJ IDEA.
  User: Wizard
  Date: 2018/3/13
  Time: 21:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>question</title>
</head>
<body>
<form action="PassWordFoundServlet">
    <h3><%
        String msg;
        if ((msg = (String) request.getAttribute("Msg")) != null) {
            out.print(msg);
        }
    %></h3>
    密保问题:<%
    User user = (User) request.getServletContext().getAttribute("thisUser");
    if (user != null) {
        out.print(user.getUserQuestion());
    }
    %>
    <h1><%
        if (request.getAttribute("answer")!=null) {
            out.print("密保答案:" + request.getAttribute("answer"));
        }
    %></h1>
    密保回答:<input type="text" name="answer">
    <input type="submit" value="确定">
</form>

</body>
</html>
