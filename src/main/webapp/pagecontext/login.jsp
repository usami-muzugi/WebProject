<%--
  Created by IntelliJ IDEA.
  User: wzard
  Date: 2018/2/23
  Time: 14:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        pageContext.setAttribute("age", 22);
    %>

    pageContext中，作用域的值:<%=pageContext.getAttribute("age")%>
</body>
</html>
