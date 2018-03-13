package chapter2.homework.usersUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "UserPasswordFoundServlet",urlPatterns = "/chapter2/homework/PassWordFoundServlet")
public class UserPasswordFoundServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String string = request.getParameter("answer");
        User user = (User) request.getServletContext().getAttribute("thisUser");
        System.out.println(string);
        if (user.getUserQuestion().equals(string)) {
            request.setAttribute("answer", user.getUserAnswer());
        } else {
            request.setAttribute("Msg","密保回答错误！！！");
        }
        request.getRequestDispatcher("question.jsp").forward(request, response);
    }
}
