<%@ page import="bean.test.Emp" %>

<%--
  Created by IntelliJ IDEA.
  User: wzard
  Date: 2018/2/26
  Time: 15:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%

    if (Emp.getUsername().equals(session.getAttribute("sessionAccount"))&&Emp.getPassword().equals(session.getAttribute("sessionPassword"))) {
%>
<h3 align="center">公告添加頁面</h3>
<table align="center" border="2px">
    <tr>
        <form action="addcontrol.jsp">
            <td>編號:<input type="text" name="infoId"></td>
            <td>名稱:<input type="text" name="infoName"></td>
            <td>内容:<input type="text" name="infoMsg"></td>
            <td><input type="submit" value="提交"></td>
        </form>
    </tr>
</table>
<%
    } else {
        out.print("非法訪問喲！<h5 align=\"center\">請<a href=\"login.jsp\">重新登錄</a></h5>");
    }
%>
