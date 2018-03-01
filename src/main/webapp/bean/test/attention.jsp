<%@ page import="bean.test.DbUtil.DbUtil" %>
<%@ page import="bean.test.Emp" %>
<%@ page import="java.util.Iterator" %>
<%--
  Created by IntelliJ IDEA.
  User: wzard
  Date: 2018/2/24
  Time: 15:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
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
<h3 align="center">公告顯示頁面</h3>
<h5 align="right">歡迎回來，<a href="userarea.jsp"><%=username%></a> ! 頁面訪問量:<%=application.getAttribute("count")%></h5>
<h2 align="left">公告列表:</h2>
<hr/>
<table align="center" border="1px" width="500px">
    <tr>
        <td>編號</td>
        <td>名稱</td>
        <td>内容</td>
        <td>刪除</td>
        <td>修改</td>
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
<h3 align="center">公告顯示頁面</h3>
<h5 align="center">用戶名或密碼錯誤，請<a href="login.jsp">重新登錄</a></h5>
<%
    }
%>
</body>
</html>
