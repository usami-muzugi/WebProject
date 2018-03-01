<%--
  Created by IntelliJ IDEA.
  chapter1.Person: Wizard
  Date: 2018/1/6
  Time: 12:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<html>
  <head>
    <title>Bootstrap + JSP开发</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width,initial-scale=1"/>
    <script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
    <script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
    <link href="bootstrap/css/bootstrap.min.css" type="text/css" rel="stylesheet">
  </head>
  <body>
  <div class="container">
      <form id="loginForm" action="check.jsp" method="post">
          <fieldset>
              <legend><label><span class="glyph glyph-user"></span> 用户登录</label></legend>
              <div class="form-group" id="midDiv">
                  <label class="col-md-3 control-label" for="midDiv">用户名:</label>
                  <div class="col-md-5">
                      <%-- id是为了JavaScript服务的 而name是为了JSP接受数据服务的--%>
                      <input type="text" id="mid" name="mid" class="form-control">
                  </div>
              </div>
          </fieldset>
      </form>
  </div>

  </body>
</html>
