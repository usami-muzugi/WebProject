<%--
  Created by IntelliJ IDEA.
  chapter1.Person: Wizard
  Date: 2018/1/30
  Time: 23:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ page import="java.util.List,java.util.ArrayList" %>
<%@ page import="java.util.Iterator" %>
<html>
<head>
    <title>List</title>
    <meta charset="UTF-8"/>
    <link type="text/css" rel="stylesheet" href="../bootstrap/css/bootstrap.min.css">
    <script type="text/javascript" src="../bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="../bootstrap/js/jquery-3.3.1.min.js"></script>
</head>
<body>
<%!
   List<String> list = new ArrayList<>();
%>
<%
    list.add("第1条:    JSP基础入门");
    list.add("第2条:    Servlet视频详解");
    list.add("第3条:    EL表达式初识");
    list.add("第4条:    JSTL标签库初识");
%>
<%
    Iterator iterator = list.iterator();
    while (iterator.hasNext()) {
        out.println(iterator.next()+"<br>");
    }
%>
</body>
</html>
