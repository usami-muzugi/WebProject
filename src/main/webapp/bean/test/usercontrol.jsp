<%@ page import="bean.test.Emp" %><%--
  Created by IntelliJ IDEA.
  Food: wzard
  Date: 2018/2/26
  Time: 11:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%

    if (Emp.getUsername().equals(session.getAttribute("sessionAccount"))&&Emp.getPassword().equals(session.getAttribute("sessionPassword"))) {
        Emp.setUsername(request.getParameter("username"));
        Emp.setPassword(request.getParameter("password"));
        session.setAttribute("sessionAccount", request.getParameter("username"));
        session.setAttribute("sessionPassword", request.getParameter("password"));
        pageContext.forward("userarea.jsp");
    } else {
        out.print("非法訪問喲！<h5 align=\"center\">請<a href=\"login.jsp\">重新登錄</a></h5>");
    }
%>