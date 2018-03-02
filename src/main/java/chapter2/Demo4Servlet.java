package chapter2;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-03-02
 * Time: 15:07
 * ProjectName: WebProject
 * To change this template use File | Settings | File Templates.
 **/

public class Demo4Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //转发带数据给某个JSP页面
        //request.setAttribute("ourinsama","give me five!");
        //request.getRequestDispatcher("demo.jsp").forward(request, response);

        //通过重定向
        response.sendRedirect("demo.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
