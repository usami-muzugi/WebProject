<%--
  Created by IntelliJ IDEA.
  User: Wizard
  Date: 2018/3/18
  Time: 22:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>AJAX</title>
    <script type="text/javascript" src="/bootstrap/js/jquery-3.3.1.min.js"></script>
</head>
<body>
<form action="/chapter3/login" method="post">
<input type="text" name="username">
<input type="password" name="password"><span class="tip"></span>
<button type="submit" id="submint">登录</button>
</form>
    <script>
        $("submit").click(function () {
            //单击登录按钮触发AJAX事件
            $.ajax({
                url: "/chapter3/AjaxServlet",
                type: "post",
                data: {
                    // language=JQuery-CSS
                    username: $("input[name=username]").val(),
                    // language=JQuery-CSS
                    password: $("input[name=password]").val()
                },
                dataType: "json",
                success: function (result) {
                    result.flag = undefined;
                    var flag = result.flag;
                    if (flag === true) {
                        //跳转到成功页面
                        window.location.href ="success.jsp";
                    }else {
                        //跳转到登录页面，同时给一个友好的提示
                        $(".tip").text("输入的用户名或者密码不正确！");
                    }
                }

            });

        });
    </script>
</body>
</html>
