package chapter2.homework.usersUtils;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

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
 * Time: 17:02
 * ProjectName: WebProject
 * To change this template use File | Settings | File Templates.
 **/

@WebServlet(name = "UserUploadServlet",urlPatterns = "/chapter2/homework/UserUploadServlet")
public class UserUploadServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<User> userList = (List<User>) getServletContext().getAttribute("UserList");
        try {
            // 1.创建一个磁盘文件项工厂对象
            DiskFileItemFactory diskFileItemFactory = new DiskFileItemFactory();
            // 2.创建一个核心解析类
            ServletFileUpload servletFileUpload = new ServletFileUpload(diskFileItemFactory);
            // 3.解析request请求，返回的是List集合，List集合中存放的是FileItem对象
            List<FileItem> list = servletFileUpload.parseRequest(request);
            int userid = 0;
            String username = null;
            String useremail = null;
            String userpassword = null;
            String userquestion = null;
            String useranswer = null;
            for (FileItem fileItem:list
                    ) {
                if(fileItem.isFormField()){
                    // 普通表单项:
                    // 接收表单项参数的值:
                    String name = fileItem.getFieldName(); // 获得表单项的name属性的值
                    String value = fileItem.getString("UTF-8");// 获得表单项的值
                    switch (name) {
                        case "userid" :
                            userid = Integer.valueOf(value); break;
                        case "username" :
                            username = value; break;
                        case "useremail" :
                            useremail = value; break;
                        case  "userpassword" :
                            userpassword = value; break;
                        case "userquestion" :
                            userquestion = value; break;
                        case "useranswer" :
                            useranswer = value; break;
                    }
                }
            }
            String indexUserName = (String) request.getSession().getAttribute("UserList");
            User oldUser;
            Iterator<User> iterator = userList.iterator();
            while (iterator.hasNext()) {
                if ((oldUser = iterator.next()).equals(indexUserName)) {
                    userList.remove(oldUser);
                    break;
                }
            }
            userList.add(new User(userid,username,useremail,userpassword,userquestion,useranswer));
            request.getRequestDispatcher("userinfo.jsp").forward(request,response);
        } catch (FileUploadException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
