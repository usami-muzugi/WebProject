<%@ page import="bean.Emp" %>
<%@ page import="bean.dbUtil.DbUtil" %>
<%@ page import="java.util.Map" %>
<%@ page import="javafx.application.Application" %>
<%--
  Created by IntelliJ IDEA.
  Food: wzard
  Date: 2018/2/5
  Time: 11:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page   contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" errorPage="error.jsp" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <!--
    1.获取用户名以及密码 并且调用DbUtil的方法来判断是否存在指定的信息，
        如果正确，DbUtil方法返回值返回true，显示成功页面
        如果错误，返回false，显示错误消息。
        request: 获取请求信息，包括请求信息。
        getParameter(String name):可以通过一个控件的name 属性来获取控件的值

        out:输出流对象，输出指定信息。
        println();
    -->

    <h3 align="left">从request对象中获取key为name对应的值<%=request.getAttribute("name")%> 响应字符集:<%= response.getCharacterEncoding()%></h3>
<%
    String accout = request.getParameter("account");
    String password = request.getParameter("password");

    if (DbUtil.selectEmpByAccountAndPassword(new Emp(accout, null, password, null))) {
        //设置session
        Object object = application.getAttribute("count");
        if (object == null) {
            application.setAttribute("count", 1);
        } else {
            int count = Integer.parseInt(object.toString());
            application.setAttribute("count", count + 1);
        }
        session.setAttribute("account",accout);
        %>
    <h3 align="right">欢迎回来<%=session.getAttribute("account")%> 访问量:<%=application.getAttribute("count")%></h3>
    <hr/>
    <h3 align="center">欢迎来到人事管理系统</h3>
    <table align="center" border="2" width="500px">
        <tr>
            <td>账号</td>
            <td>名字</td>
            <td>邮箱</td>
            <td>修改</td>
        </tr>
        <%
            for (String key:DbUtil.map.keySet()
                 ) {
                Emp emp = DbUtil.map.get(key);
                %>
        <tr>
            <!-- 这样子的写法-->
            <td><%= emp.getAccount()%></td>
            <td><%= emp.getName()%></td>
            <td><%= emp.getEmail()%></td>
            <td><a href="update.jsp?account=<%=emp.getAccount()%>&name=<%=emp.getName()%>&email=<%=emp.getEmail()%>" >点击修改</a></td>
        </tr>
                <%
            }
        %>
    </table>
    <hr/>
    <a href="exit.jsp">退出</a>
        <%
    } else {
        %>


    <form action="login.jsp">
        <input type="submit" name="error" id="error" class="bg-danger" value="error">
    </form>
        <%
    }
%>
</body>
</html>
