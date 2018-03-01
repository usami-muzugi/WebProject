<%--
  Created by IntelliJ IDEA.
  chapter1.Person: Wizard
  Date: 2018/1/30
  Time: 22:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Test3</title>
</head>
<body>
<%!
    int totalCount = 0;  //成员变量，一直都保持的
%>

<%
    int localCount = 0;  //局部变量，会在每一次访问后，都被刷新
    totalCount++;
    localCount++;
%>
<%
    out.println(totalCount);
    out.println("<hr>");
    out.println(localCount);
%>
</body>
</html>
