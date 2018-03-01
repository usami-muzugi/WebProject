<%--
  Created by IntelliJ IDEA.
  chapter1.Person: Wizard
  Date: 2018/1/30
  Time: 20:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="../bootstrap/css/bootstrap.min.css"/>
    <script src="../bootstrap/js/jquery-3.3.1.min.js"></script>
    <script src="../bootstrap/js/bootstrap.min.js"></script>
    <title>Bootstrap</title>
</head>
<body>
<%!  //%！标签只能申明变量
    String string = new String("Hello World!");
    String getString(){
        return new String(" Hello World too!");
    }
%>
    <hr/>
<%
    out.println(this.string);
%>
<hr/>
<% out.print(this.getString());%>
    <p>一般的标题</p>
    <h1>h1</h1>
    <h2>h2</h2>
    <h3>h3</h3>
    <h4>h4</h4>
    <h5>h5</h5>
    <h6>h6</h6>
    <p>bootstrap</p>
    <span class="h1">标题<small>小标题</small></span>
    <span class="h2">标题</span>
    <span class="h3">标题</span>
    <span class="h4">标题</span>
    <span class="h5">标题</span>
    <span class="h6">标题</span>
    <span class="text-center">中对齐</span>
    <<br><br/>
    <P>
        <mark>张财源牛逼！！！</mark>张财源牛逼！！！
        <del>张财源牛逼！！！</del>
        <ins>张财源牛逼！！！</ins>张财源牛逼！！！张财源牛逼！！！
        张财源牛逼！！！张财源牛逼！！！张财源牛逼！！！张财源牛逼！！！张财源牛逼！！！
        张财源牛逼！！！张财源牛逼！！！张财源牛逼！！！张财源牛逼！！！张财源牛逼！！！</P>
    <P class="text-right">张财源牛逼！！！张财源牛逼！！！张财源牛逼！！！张财源牛逼！！！张财源牛逼！！！张财源牛逼！！！</P>
    <p class="text-left">ZCY</p><!--文字靠左-->
    <p class="text-center">ZCY</p><!--文字居中-->
    <p class="text-right">ZCY</p>  <!--文字靠右-->
    <p>HELLO!</p>
    <p class="text-lowercase">HELLO!</p> <!--大写转小写-->
    <p class="text-uppercase">hello!</p><!--小写转大写-->
    <p class="text-capitalize">hello!</p><!--小写转大写-->
</body>
</html>
