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
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
