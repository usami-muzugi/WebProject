package chapter2.test;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-03-02
 * Time: 15:41
 * ProjectName: WebProject
 * To change this template use File | Settings | File Templates.
 **/

public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String string_1 = request.getParameter("var1");
        String string_2 = request.getParameter("var2");
        int var = Integer.valueOf(string_1) + Integer.valueOf(string_2);
        request.setAttribute("sum", var);
        request.getRequestDispatcher("test/sum.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
