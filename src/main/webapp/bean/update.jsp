<%@ page import="bean.dbUtil.DbUtil" %><%--
  Created by IntelliJ IDEA.
  User: wzard
  Date: 2018/2/23
  Time: 14:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>员工更新页面</title>
</head>
<body>
    <h3 align="right">登录账号:<%=session.getAttribute("account")%></h3>
    <h3 align="center">员工更新页面</h3>
    <hr/>
<%

%>
    <form action="update_control.jsp">
        <table align="center" border="1" width="500px">
            <tr>
                <td>账号</td>
                <td><input type="text" name="account" value="<%=request.getParameter("account")%>"></td>
            </tr>
            <tr>
                <td>姓名</td>
                <td><input type="text" name="name" value="<%=request.getParameter("name")%>"></td>
            </tr>
            <tr>
                <td>邮箱</td>
                <td><input type="text" name="email" value="<%=request.getParameter("email")%>"></td>
            </tr>
            <tr>
                <td>密码</td>
                <td><input type="password" name="password" value="<%=DbUtil.map.get(request.getParameter("account")).getPassword()%>"></td>
            </tr>
            <tr>
                <td><span><input type="submit" align="right" value="修改"></span></td>
            </tr>
        </table>
    </form>
</body>
</html>
