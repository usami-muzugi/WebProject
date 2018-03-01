package chapter2;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * ServletContext ==JSP application :表示JAVAWEB整个工程对象
 * ServletConfig ==JSP config :表示JAVAWEB配置对象
 */
public class DemoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取整个JAVAWEB的context对象
        ServletContext context = this.getServletContext();
        //context对象也是所谓的一个域对象，可以往某一个域对象中存储数据，并且还可以取出来用
        context.setAttribute("username","ourinsma");
        //往context对象中存放数据
        Object object = context.getAttribute("username");
        //打印去除的结果
        System.out.println(object);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
