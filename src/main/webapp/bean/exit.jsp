<%--
  Created by IntelliJ IDEA.
  User: wzard
  Date: 2018/2/23
  Time: 16:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  session.setAttribute("account",null);
  pageContext.forward("login.jsp");
%>