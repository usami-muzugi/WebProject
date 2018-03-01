<%--
  Created by IntelliJ IDEA.
  User: wzard
  Date: 2018/2/23
  Time: 13:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        //pageContext.include("header.jsp");
        pageContext.forward("a.jsp?name=ourinsama");
        //url后面代表的是请求的资源和传递的参数内容 key=name value=ourinsama 多个参数用&
    %>
</body>
</html>
