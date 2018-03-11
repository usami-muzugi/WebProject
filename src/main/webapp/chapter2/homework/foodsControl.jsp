<%@ page import="chapter2.homework.foods.Food" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Wizard
  Date: 2018/3/11
  Time: 20:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%
    String id = request.getParameter("id");
    String name = request.getParameter("name");
    String taste = request.getParameter("taste");
    double price = Double.valueOf(request.getParameter("price"));
    String info = request.getParameter("info");
    List<Food> list = (List<Food>)application.getAttribute("foodsList");
    list.add(new Food(id, name, taste, , price, info));
    request.getRequestDispatcher("foodslist.jsp").forward(request,response);
%>
