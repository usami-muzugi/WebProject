<%--
  Created by IntelliJ IDEA.
  User: Wizard
  Date: 2018/3/18
  Time: 19:49
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%> <%-- jstl 要导入这些taglib标签--%>
<html>
<head>
    <title>JSTL</title>
</head>
<body>
<%--jstl
    通用标签 set out remove
    条件标签 if choose forEach
--%>

<%--set out remove--%>
<c:set var="user" value="张三" scope="request"></c:set>
<%--将数据打印显示--%>
<c:out value="${user}"/>
</body>
</html>
