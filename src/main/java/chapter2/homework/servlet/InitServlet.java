package chapter2.homework.servlet;

import chapter2.homework.UserUtils.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-03-07
 * Time: 09:37
 * ProjectName: WebProject
 * To change this template use File | Settings | File Templates.
 **/

@WebServlet(name = "InitServlet",displayName = "InitServlet",urlPatterns = "/chapter2/homework/servlet/initservlet",loadOnStartup = 2)
public class InitServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        //搞一个集合
        List<User> list = new ArrayList<User>();
        //传进去哟
        this.getServletContext().setAttribute("UserList",list);
    }
}
