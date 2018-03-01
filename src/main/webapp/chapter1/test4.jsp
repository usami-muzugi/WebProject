<%--
  Created by IntelliJ IDEA.
  chapter1.Person: Wizard
  Date: 2018/1/30
  Time: 22:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Test5</title>
</head>
<body>
<%!
    int i = 10;
%>
i的值是:<%=i%>
i的值是:<%
    // %=比第二种更简洁明了
    out.println(i);
%>
</body>
</html>
