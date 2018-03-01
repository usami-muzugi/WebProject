<%--
  Created by IntelliJ IDEA.
  User: wzard
  Date: 2018/2/5
  Time: 11:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%
    request.setAttribute("name","ourinsma");
    //request.getRequestDispatcher("result.jsp").forward(request, response);
%>
<html>
<head>
    <title>login Page</title>
    <script type="text/javascript" src="../bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
<header>
    <div class="header-panel">
        <h3 align="center">人事管理系统登录页面
        </h3>
    </div>
</header>
<hr>
<!-- action 代表了服务端的处理程序-->
<form action="control.jsp">
    <table align="center">
        <tr>
            <td>
                账号:
            </td>
            <td>
                <input type="text" name="account">
            </td>
        </tr>
        <tr>
            <td>
                密码:
            </td>
            <td>
                <input type="password" name="password">
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit"  value="Login"/>
            </td>
    </table>

</form>
</body>
</html>
