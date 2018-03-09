<%@ page import="bean.dbUtil.DbUtil" %>
<%@ page import="bean.Emp" %><%--
  Created by IntelliJ IDEA.
  Food: wzard
  Date: 2018/2/23
  Time: 16:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%

    String account = request.getParameter("account");
    String name = request.getParameter("name");
    String email = request.getParameter("email");
    String password = request.getParameter("password");
    DbUtil.map.replace(account, new Emp(account, name, password, email));
    out.print("修改成功，等待跳转");
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    pageContext.forward("control.jsp");
%>