package chapter2.homework.old;

import chapter2.homework.old.user.User;
import chapter2.homework.old.user.UserUtils;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if (UserUtils.isTrue(username, password)) {
            //密码正确设置session
            request.getSession().setAttribute("username",new User(username,password));
            request.getRequestDispatcher("foodslist.jsp").forward(request, response);
        } else {
            request.setAttribute("Msg","登录失败,用户名或密码错误，请重新登录！！");
            request.getRequestDispatcher("index.jsp").forward(request,response);
            System.out.println(1);
        }
    }
}
