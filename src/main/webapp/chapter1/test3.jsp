<%--
  Created by IntelliJ IDEA.
  chapter1.Person: Wizard
  Date: 2018/1/30
  Time: 22:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Test3</title>
</head>
<body>
<%!
    String string = "Hello World!";

%>
<%--
<%
    out.println(string);
%>
--%>

<%
    out.println(new String("Hello World!"));
%>
<hr/>
<%=string%>
</body>
</html>
