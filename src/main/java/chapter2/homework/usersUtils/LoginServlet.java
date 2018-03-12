package chapter2.homework.usersUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-03-12
 * Time: 16:41
 * ProjectName: WebProject
 * To change this template use File | Settings | File Templates.
 **/

@WebServlet(name = "LoginServlet",urlPatterns = "chapter2/homework/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取index.jsp传过来的信息
        String user = request.getParameter("user");
        String userpassword = request.getParameter("userpassword");
        //调取当前的UserList
        List<User> userList = (List<User>) getServletContext().getAttribute("UserList");
        Iterator<User> iterator = userList.iterator();

        //输出信息
        String msg;
        //临时user
        User indexUser;
        while (iterator.hasNext()) {
            //判断user是否为存在的用户名|id|Email
            if ((indexUser = iterator.next()).getUserId() == Integer.valueOf(user) | (indexUser.getUserName().equals(user)) | (indexUser.getUserEmail().equals(user))) {
                if (indexUser.getUserPassword().equals(userpassword)) {
                    //到这里就是全部正确的了,这里可以设置好session，和cookie？然后再跳转
                    request.getSession().setAttribute("username", indexUser.getUserName());
                    request.getRequestDispatcher("foodslist.jsp").forward(request, response);
                } else {
                    msg = "用户名或密码错误！请重新输入";
                }
            } else {
                msg = "未找到该用户所对应用户名、ID、Email";
            }
        }
    }
}
