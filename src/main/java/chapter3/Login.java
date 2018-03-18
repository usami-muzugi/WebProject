package chapter3;

import org.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Login",urlPatterns = "/chapter3/login")
public class Login extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        //如果失败，则创建一个JsonObject
        JSONObject jsonObject;
        if (username.equals("usamimizugi") && password.equals("ourinsama")) {
            System.out.println(username);
            System.out.println(password);
            jsonObject = new JSONObject("{flag:true}");
            response.getOutputStream().write(jsonObject.toString().getBytes());
        } else {
            //返回jsonobject
            jsonObject = new JSONObject("{flag:false}");
            response.getOutputStream().write(jsonObject.toString().getBytes("UTF-8"));

        }
    }
}
