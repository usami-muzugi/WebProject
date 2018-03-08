<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="http://localhost/bootstrap/css/bootstrap.min.css"/>
    <script src="http://localhost/bootstrap/js/jquery-3.3.1.min.js"></script>
    <script src="http://localhost/bootstrap/js/bootstrap.min.js"></script>
<%@ page import="bean.test.DbUtil.DbUtil" %>
<%@ page import="bean.test.Emp" %>
<%@ page import="java.util.Iterator" %>
<%--
  Created by IntelliJ IDEA.
  Food: wzard
  Date: 2018/2/24
  Time: 15:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>

    <title>公告显示</title>
</head>
<body>
<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    if ((username == null)&&(password==null)) {
        username = (String) session.getAttribute("sessionAccount");
        password = (String) session.getAttribute("sessionPassword");
    }
    boolean flag = false;
    if (DbUtil.isTrue(username,password)) {
        flag = true;
        if (application.getAttribute("count") == null) {
            application.setAttribute("count",1);
        }else{
            application.setAttribute("count",(int)application.getAttribute("count")+1);
        }
        if (session.getAttribute("sessionAccount") == null) {
            session.setAttribute("sessionAccount", username);
            session.setAttribute("sessionPassword",password);
        }
    }
    if (flag) {
        %>
<h3 class="text-center">公告顯示頁面</h3>
<h5 class="text-right">歡迎回來，<a class="active" href="userarea.jsp"><%=username%></a> ! 頁面訪問量:<%=application.getAttribute("count")%></h5>
<h4 class="h4 text-left default-color0">公告列表:</h4>
<hr/>
<table align="center" border="1px" width="500px" class="table table-bordered table-striped table-hover table-condensed">
    <tr>
        <th>編號</th>
        <th>名稱</th>
        <th>内容</th>
        <th>刪除</th>
        <th>修改</th>
    </tr>
    <%
        Iterator<Emp.Info> iterator = Emp.getMap().values().iterator();
        while (iterator.hasNext()) {
            Emp.Info next = iterator.next();
    %>
    <tr>
        <td><%=next.getInfoId()%></td>
        <td><%=next.getInfoName()%></td>
        <td><%=next.getInfoMsg()%></td>
        <td><a href="remove.jsp?infoId=<%=next.getInfoId()%>">刪除</a></td>
        <td><a href="replace.jsp?infoId=<%=next.getInfoId()%>">修改</a></td>
    </tr>
    <%
        }
    %>
    <tr>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td><a href="add.jsp">添加公告</a> </td>
    </tr>
</table>
<hr/>
<h3 align="right"><a href="logout.jsp">退出登錄</a></h3>
<%
    }else{
        %>
<h3 class="h3 text-center">公告顯示頁面</h3>
<h5 align="h5 text-center">用戶名或密碼錯誤，請<a href="login.jsp">重新登錄</a></h5>
<%
    }
%>
</body>
</html>
