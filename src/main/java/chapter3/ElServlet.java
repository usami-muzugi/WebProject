package chapter3;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ElServlet",urlPatterns = "/chapter3/ElServlet")
public class ElServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String age = request.getParameter("age");
        request.setAttribute("username", username);
        request.setAttribute("age", age);
        request.getRequestDispatcher("showEl.jsp").forward(request, response);
    }
}
