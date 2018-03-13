package chapter2.homework.usersUtils;

import javax.servlet.ServletContext;
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
 * Time: 17:01
 * ProjectName: WebProject
 * To change this template use File | Settings | File Templates.
 **/

@WebServlet(name = "UserForgetPasswordServlet",urlPatterns = "/chapter2/homework/UserForgetPasswordServlet")
public class UserForgetPasswordServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String string = request.getParameter("username");
        if (string != null && !string.equals("")) {
            List<User> userList = (List<User>) request.getServletContext().getAttribute("UserList");
            boolean flag = false;
            User indexUser = null;
            Iterator<User> userIterator = userList.iterator();
            //找用户
            while (userIterator.hasNext()) {
                if ((indexUser = userIterator.next()).getUserName().equals(string)) {
                    flag = true;
                    System.out.println(indexUser);
                    break;
                }
            }
            //找用户
//            for (User user:userList
//                 ) {
//                if ((indexUser = user).getUserName().equals(string)) {
//                    flag = true;
//                    System.out.println(indexUser);
//                    break;
//                }
//            }
            if (!flag) {
                request.setAttribute("Msg", "没找到这个用户，或者密码不对");
            } else {
                //找到了就要验证下密保，没密保就凉了

                /*
                * User{userId=1, userName='usaimimizugi', userEmail='3436260@qq.com', userPassword='ourinsama', userQuestion='null', userAnswer='null', userIcon='null'}
                ？？？？？ 为什么
                 * UserUploadServlet line:120
                * */
                if (indexUser.getUserQuestion()!=null) {
                    System.out.println(1111111);
                    System.out.println(indexUser);
                    request.getServletContext().setAttribute("thisUser", indexUser);
//                    request.getServletContext().setAttribute("UserList",userList);
                    request.getRequestDispatcher("question.jsp").forward(request, response);
                } else {
                    request.setAttribute("Msg", "凉凉，都没有设置密保问题");
                }
            }
        } else {
            request.setAttribute("Msg","不准给我输null！");
        }
        request.getRequestDispatcher("forget.jsp").forward(request, response);
    }
}
