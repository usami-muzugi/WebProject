package chapter2.homework.usersUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-03-12
 * Time: 17:02
 * ProjectName: WebProject
 * To change this template use File | Settings | File Templates.
 **/

@WebServlet(name = "UserUploadServlet",urlPatterns = "chapter2/homework/UserUploadServlet")
public class UserUploadServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
