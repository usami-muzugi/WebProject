package chapter2.homework.foods;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "FoodsUploadUtilsServlet",urlPatterns = "/chapter2/homework/upload")
public class FoodsUploadUtilsServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
        // 1.创建一个磁盘文件项工厂对象
        DiskFileItemFactory diskFileItemFactory = new DiskFileItemFactory();
        // 2.创建一个核心解析类
        ServletFileUpload servletFileUpload = new ServletFileUpload(diskFileItemFactory);
        // 3.解析request请求，返回的是List集合，List集合中存放的是FileItem对象
            List<FileItem> list = servletFileUpload.parseRequest(request);
            if () {
            }
        } catch (FileUploadException e) {
            e.printStackTrace();
        }
    }
}
