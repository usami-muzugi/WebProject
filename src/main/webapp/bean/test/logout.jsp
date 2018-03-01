<%--
  Created by IntelliJ IDEA.
  User: wzard
  Date: 2018/2/26
  Time: 11:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    session.setAttribute("sessionAccount",null);
    pageContext.forward("login.jsp");
%>


