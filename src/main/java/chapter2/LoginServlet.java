package chapter2;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
//方法一，在web.xml加入<servlet>这个标签，顺便加入<servlet-mapping>这个标签

//还有就是，使用idea Maven，需要在main那里添加一个java然后右键他把他设置为Resource root attention!!
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取表单提交过来的数据
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("username:"+username+"\npassword:"+password);
        //如果用户名为ourinsama,密码为usamimizugi，则跳转到success.jsp页面 否则为fail.jsp
        /*转发是不会重定向的，所以就还是原来的页面*/
        if (username.equals("ourinsama") && password.equals("usamimizugi")) {
            request.getRequestDispatcher("success.jsp").forward(request,response);
        } else {
            //request.getRequestDispatcher("fail.jsp").forward(request,response);
            //这里使用的是跳转，跳转会请求两次跳转到另一个页面
            response.sendRedirect("fail.jsp");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*doGet(request,response);*/
    }
}
