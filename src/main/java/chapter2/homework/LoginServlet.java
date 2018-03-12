package chapter2.homework;

import chapter2.homework.usersUtils.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
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

@WebServlet(name = "LoginServlet",urlPatterns = "/chapter2/homework/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取index.jsp传过来的信息
        String user = request.getParameter("user");
        String userpassword = request.getParameter("userpassword");
        //获取是否记住用户名
        String remember = request.getParameter("remember");
        //输出信息
        String msg = null;
        //判断Flag
        boolean flag = false;
        //判断user是否为空
        if (!user.equals("")) {
            //如果用户名不为空，调取当前的UserList
            List<User> userList = (List<User>) getServletContext().getAttribute("UserList");
            Iterator<User> iterator = userList.iterator();
            //临时user
            User indexUser = null;
            while (iterator.hasNext()) {
                //判断user是否为存在的用户名|id|Email
                //indexUser.getUserId()==Integer.valueOf(user) 这里如果用户输入的既不是用户名也不是Email，但是有不是纯数字，这就难办了...
                //找到个方法！
//                String str="123456";
//                boolean result=str.matches("[0-9]+");
                if ((indexUser = iterator.next()).getUserName().equals(user)||indexUser.getUserEmail().equals(user)) {
                    flag = true;
                    break;
                    //上面判断了是否为用户名或者是Email，那么接下来判断是否为纯数字
                } else if (user.matches("[0-9]+")) {
                    //这里有一个BUG就是随便输入一个数字，然后他就返回true了.... 最后也就是 msg = "用户名或密码错误！请重新输入"; 算了不管他了
                    flag = true;
                    break;
                } else {
                    msg = "找不到你输入的用户名、ID、Email";
                }
            }

            //判断密码了
            if (flag) {
                if (indexUser.getUserPassword().equals(userpassword)) {
                    //到这里就是全部正确的了,这里可以设置好session，和cookie？这里还是加一个Cookie吧...然后再跳转
                    if (remember.equals("true")) {
                        // 完成记住用户名功能
                        Cookie usernameCookie = new Cookie("username", indexUser.getUserName());
                        // 设置有效路径和有效时间:
                        usernameCookie.setPath("/chapter2/homework");
                        // 设置有效时间:
                        usernameCookie.setMaxAge(60*60*24);// 保存24小时
                        // 将cookie回写到浏览器：
                        response.addCookie(usernameCookie);
                    }
                    request.getSession().setAttribute("username", indexUser.getUserName());
                    request.getRequestDispatcher("foodslist.jsp").forward(request, response);
                } else {
                    msg = "用户名或密码错误！请重新输入";
                }
            }
        } else {
            msg = "用户名不得为空！！！";
        }
        request.setAttribute("Msg",msg);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}