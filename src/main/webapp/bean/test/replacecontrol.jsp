<%@ page import="bean.test.Emp" %>
<%--
  Created by IntelliJ IDEA.
  Food: wzard
  Date: 2018/2/26
  Time: 14:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%

    if (Emp.getUsername().equals(session.getAttribute("sessionAccount"))&&Emp.getPassword().equals(session.getAttribute("sessionPassword"))) {
        String infoId = request.getParameter("infoId");
        String infoName = request.getParameter("infoName");
        String infoMsg = request.getParameter("infoMsg");
        Emp.infoReplace(new Emp.Info(Integer.valueOf(infoId), infoName, infoMsg));
        pageContext.forward("attention.jsp");
    } else {
        out.print("非法訪問喲！<h5 align=\"center\">請<a href=\"login.jsp\">重新登錄</a></h5>");
    }
%>
