<%@ page import="chapter2.homework.foodsUtils.Food" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Iterator" %><%--
  Created by IntelliJ IDEA.
  User: Wizard
  Date: 2018/3/12
  Time: 22:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%
    String string = request.getParameter("foodId");
    int index = Integer.valueOf(string);
    List<Food> list = (List<Food>)application.getAttribute("FoodList");
    Iterator<Food> iterator = list.iterator();
    Food food;
    while (iterator.hasNext()) {
        if ((food = iterator.next()).getFoodId() == index) {
            list.remove(food);
            break;
        }
    }
    request.getRequestDispatcher("foodslist.jsp").forward(request,response);
%>
