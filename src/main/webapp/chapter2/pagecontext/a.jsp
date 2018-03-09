<%--
  Created by IntelliJ IDEA.
  User: wzard
  Date: 2018/2/23
  Time: 13:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%=pageContext.getRequest().getParameter("name")%>
    <%=this.getServletConfig()%>
</body>
</html>
