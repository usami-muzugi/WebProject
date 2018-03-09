<%@ page import="bean.test.Emp" %><%--
  Created by IntelliJ IDEA.
  Food: wzard
  Date: 2018/2/26
  Time: 10:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>管理員頁面</title>
</head>
<body>
<h3>管理員界面</h3>
<hr/>
    <table align="center" width="500px" border="2px">
        <tr>
            <td>用戶名</td>
            <td>密碼</td>
            <td>操作</td>
        </tr>
        <tr>
            <form action="usercontrol.jsp">
                <td><input type="text"value="<%=Emp.getUsername()%>" name="username"></td>
                <td><input type="password" value="<%=Emp.getPassword()%>" name="password"></td>
                <td><input type="submit" value="修改"></td>
            </form>
        </tr>
    </table>
<h3 align="right"><a href="attention.jsp">返回公告顯示頁面</a></h3>
</body>
</html>
