<%@ page import="bean.test.Emp" %>
<%@ page import="java.util.Iterator" %><%--
  Created by IntelliJ IDEA.
  Food: wzard
  Date: 2018/2/26
  Time: 15:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%

    if (Emp.getUsername().equals(session.getAttribute("sessionAccount"))&&Emp.getPassword().equals(session.getAttribute("sessionPassword"))) {
        String infoId = request.getParameter("infoId");
        String infoName = request.getParameter("infoName");
        String infoMsg = request.getParameter("infoMsg");
        Iterator iterator = Emp.getMap().keySet().iterator();
        boolean flag = false;
        while (iterator.hasNext()) {
            if (iterator.next().equals(Integer.valueOf(infoId))) {
                flag = true;
                break;
            }
        }
        if (!flag) {
            Emp.infoAdd(new Emp.Info(Integer.valueOf(infoId), infoName, infoMsg));
            pageContext.forward("attention.jsp");
        } else {
            out.print("這個公告的編號已存在啊，請嘗試刪除喲！<h5 align=\"center\">請<a href=\"add.jsp\">返回去從新添加</a></h5>");
        }
    } else {
        out.print("非法訪問喲！<h5 align=\"center\">請<a href=\"login.jsp\">重新登錄</a></h5>");
    }
%>