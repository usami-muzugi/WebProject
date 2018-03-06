package chapter2.login;

import chapter2.login.utils.UploadUtils;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.*;

/**
 * 用户注册的Servlet
 */
public class RegistServlet extends HttpServlet {
    /**
     * 数据的接收
     * 文件上传的基本操作
     * 1.创建一个磁盘文件项工厂对象
     * 2.创建一个核心解析类
     * 3.解析request请求，返回的是List集合，List集合中存放的是FileItem对象
     * 4.遍历集合，获得每个FileItem，判断是表单项还是文件上传项
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            //创建一个磁盘文件项工厂对象
            DiskFileItemFactory diskFileItemFactory = new DiskFileItemFactory();
            //创建一个核心解析类
            ServletFileUpload servletFileUpload = new ServletFileUpload(diskFileItemFactory);
            //解析request请求，返回的是List集合，List集合中存放的是FileItem对象
            List<FileItem> list = servletFileUpload.parseRequest(req);
            Map<String, String> map = new HashMap<String, String>();
            User user;
            String name;
            String value;
            String hobbyvalue = "";
            String filePath = null;
            for (FileItem fileItem : list
                    ) {
                name = fileItem.getFieldName();
                value = fileItem.getString("UTF-8");
                if (fileItem.isFormField()) {
                    //表单数据处理
                    //如果是hobby多选项的处理方式
                    if (name.equals("hobby")) {
                        hobbyvalue = hobbyvalue + value + ",";
                    } else {
                        map.put(name,value);
                    }
                    map.put("hobby", hobbyvalue);
                } else {
                    //非表单数据处理
                    //上传文件项
                    //上传文件功能
                    //获取上传文件名
                    String string = fileItem.getName();
                    //获得上传文件的数据
                    InputStream inputStream = fileItem.getInputStream();
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
                    //获取文件上传路径
                    filePath = this.getServletContext().getRealPath("/chapter2/login/upload/img");
//                    System.out.println(filePath);
                    String newFileName = filePath + "\\" + UploadUtils.getUUIDFileName(string);
                    OutputStream outputStream = new FileOutputStream(new File(newFileName));
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
                    int len = 0;
                    byte[] bytes = new byte[1024];
                    while ((len = bufferedInputStream.read(bytes)) == -1) {
                        bufferedOutputStream.write(bytes, 0, len);
                    }
                    bufferedOutputStream.flush();
                    bufferedOutputStream.close();
                    outputStream.flush();
                    outputStream.close();
                    bufferedInputStream.close();
                    inputStream.close();
                }
            }
            System.out.println(map);
            //封装到User
            user = new User();
            user.setUsername(map.get("username"));
            user.setNickname(map.get("nickname"));
            user.setPassword(map.get("password"));
            user.setHobby(map.get("hobby"));
            user.setSex(map.get("sex"));
            user.setPath(filePath);
            //将这个注册用户的信息存入到List集合当中
            List<User> userList = (List<User>) this.getServletContext().getAttribute("list");
            userList.add(user);
            this.getServletContext().setAttribute("list", userList);
            req.getSession().setAttribute("username", user.getUsername());
            resp.sendRedirect("/chapter2/login/login.jsp");
        } catch (FileUploadException e) {
            e.printStackTrace();
        }
    }

}
