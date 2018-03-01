<%@ page import="java.io.File" %><%--
  Created by IntelliJ IDEA.
  chapter1.Person: Wizard
  Date: 2018/1/30
  Time: 22:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@page import="java.util.Date" %>
<%@ page import="java.text.*" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%!
    public static String getNow() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss ");
        Date currentTime = new Date();
        return simpleDateFormat.format(currentTime);
    }
%>
<%=getNow()%>
</body>
</html>
