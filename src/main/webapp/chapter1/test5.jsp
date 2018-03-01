<%--
  Created by IntelliJ IDEA.
  chapter1.Person: Wizard
  Date: 2018/1/30
  Time: 22:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Test5</title>
</head>
<body>
<%!
    int x = 5, y = 0;
%>
<%
    if (x < 0) {
        y = -1;
    } else if (x > 0) {
        y = 1;
    } else {
        y = 0;
    }
%>
<%="当x<0时,输出<br>"%>
<%="x = "+ x%>
<%="y = "+ y%>
</body>
</html>
