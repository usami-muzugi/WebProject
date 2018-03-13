<%--
  Created by IntelliJ IDEA.
  User: wzard
  Date: 2018/3/13
  Time: 10:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    session.removeAttribute("username");
    request.getRequestDispatcher("index.jsp").forward(request, response);
%>
