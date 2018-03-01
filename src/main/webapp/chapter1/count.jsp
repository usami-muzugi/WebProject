<%--
  Created by IntelliJ IDEA.
  chapter1.Person: Wizard
  Date: 2018/1/30
  Time: 22:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>1-100 Count</title>
</head>
<body>
<%
    int endIndex = 100,sum = 0;
    for (int i = 1; i <= endIndex; i++) {
        sum+=i;
    }
%>
<%
    out.println("1-100的和是:"+sum);
%>
<%
    //单行注释
    /**
     * 多行注释
     */
%>
<%-- JSP的脚本注释语法--%>

</body>
</html>
