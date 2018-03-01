<%--
  Created by IntelliJ IDEA.
  chapter1.Person: Wizard
  Date: 2018/1/30
  Time: 22:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    int i = 10;
%>
<%                        //纯语言式代码写法
    if (i > 10) {
        out.println("i > 10"); //System.out.print() 直接给输出到了控制台...
    } else out.println("i <10");
%>
<hr/>
<% if (i > 10) {          //交叉式代码写法                     %>
<span>i > 10</span>
<%}else{%>
<span>i <= 10 </span>
<%}%>



</body>
</html>
