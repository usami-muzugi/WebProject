package chapter2.homework.usersUtils;

import chapter2.homework.Utils.UuidMaker;
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
import java.io.*;
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

            String  url;
            String uuidFileName = null;
            for (FileItem fileItem:list
                    ) {
                if (fileItem.isFormField()) {
                    // 普通表单项:
                    // 接收表单项参数的值:
                    String name = fileItem.getFieldName(); // 获得表单项的name属性的值
                    String value = fileItem.getString("UTF-8");// 获得表单项的值
                    switch (name) {
                        case "userid":
                            userid = Integer.valueOf(value);
                            break;
                        case "username":
                            username = value;
                            break;
                        case "useremail":
                            useremail = value;
                            break;
                        case "userpassword":
                            userpassword = value;
                            break;
                        case "userquestion":
                            userquestion = value;
                            break;
                        case "useranswer":
                            useranswer = value;
                            break;
                    }
                } else {
                    // 文件上传项:
                    // 文件上传功能：
                    // 获得文件上传的名称：
                    String fileName = fileItem.getName();
                    if(fileName !=null && !"".equals(fileName)){
                        // 通过工具类获得唯一文件名:
                        uuidFileName = UuidMaker.UuidMaker(fileName);
                        // 获得文件上传的数据：
                        InputStream inputStream = fileItem.getInputStream();
                        // 获得文件上传的路径:
                        /*
                        *  foodslist.jsp
                        * */
                        String path = request.getServletContext().getRealPath("/chapter2/homework/upload");
                        // 将输入流对接到输出流就可以了:
                        url = path+"\\"+uuidFileName;
                        OutputStream outputStream = new FileOutputStream(url);
                        int len = 0;
                        byte[] b = new byte[1024];
                        while((len = inputStream.read(b))!=-1){
                            outputStream.write(b, 0, len);
                            outputStream.flush();
                        }
                        inputStream.close();
                        outputStream.close();
                    }
                }
            }







/*





            删除 List 中的元素会产生两个问题：

            删除元素后 List 的元素数量会发生变化；
            对 List 进行删除操作可能会产生并发问题；
            我们通过代码示例演示正确的删除逻辑

package com.ips.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

            public class ArrayListRemove {
                public static void main(String[] args) {
                    ArrayList<String> list = new ArrayList<String>();
                    list.add("beijing");
                    list.add("shanghai");
                    list.add("shanghai");
                    list.add("guangzhou");
                    list.add("shenzhen");
                    list.add("hangzhou");
                    remove11(list, "shanghai");

                }

                private static void print(List<String> list){
                    for (String item : list) {
                        System.out.println("元素值：" + item);
                    }
                }

                *//*
                 * 错误
                 *//*
                public static void remove11(List<String> list, String target){
                    int size = list.size();
                    for(int i = 0; i < size; i++){
                        String item = list.get(i);
                        if(target.equals(item)){
                            list.remove(item);
                        }
                    }
                    print(list);
                }
                *//*
                 * 错误
                 *//*
                public static void remove12(List<String> list, String target){
                    for(int i = 0; i < list.size(); i++){
                        String item = list.get(i);
                        if(target.equals(item)){
                            list.remove(item);
                        }
                    }
                    print(list);
                }
                *//*
                 * 错误
                 *//*
                public static void remove13(List<String> list, String target){
                    int size = list.size();
                    for(int i = size - 1; i >= 0; i--){
                        String item = list.get(i);
                        if(target.equals(item)){
                            list.remove(item);
                        }
                    }
                    print(list);
                }
                *//*
                 * 正确
                 *//*
                public static void remove14(List<String> list, String target){
                    for(int i = list.size() - 1; i >= 0; i--){
                        String item = list.get(i);
                        if(target.equals(item)){
                            list.remove(item);
                        }
                    }
                    print(list);
                }

                *//*
                 * 错误
                 *//*
                public static void remove21(List<String> list, String target){
                    for(String item : list){
                        if(target.equals(item)){
                            list.remove(item);
                        }
                    }
                    print(list);
                }

                *//*
                 * 正确
                 *//*
                public static void remove22(ArrayList<String> list, String target) {
                    final CopyOnWriteArrayList<String> cowList = new CopyOnWriteArrayList<String>(list);
                    for (String item : cowList) {
                        if (item.equals(target)) {
                            cowList.remove(item);
                        }
                    }
                    print(cowList);
                }

                *//*
                 * 错误
                 *//*
                public static void remove31(List<String> list, String target){
                    Iterator<String> iter = list.iterator();
                    while (iter.hasNext()) {
                        String item = iter.next();
                        if (item.equals(target)) {
                            list.remove(item);
                        }
                    }
                    print(list);
                }
                *//*
                 * 正确
                 *//*
                public static void remove32(List<String> list, String target){
                    Iterator<String> iter = list.iterator();
                    while (iter.hasNext()) {
                        String item = iter.next();
                        if (item.equals(target)) {
                            iter.remove();
                        }
                    }
                    print(list);
                }

            }
            */

            String indexUserName = (String) request.getSession().getAttribute("UserList");
            //获取老User对象再给删除
            User user = null;
/*            Iterator<User> iterator = userList.iterator();
            while (iterator.hasNext()) {
//                if (iterator.next().equals(indexUserName)) {
//                    //移除
//                    //也就是说这个删除不起作用！！！  好像记起来不能用break？？ ....好像也不是..
//                    iterator.remove();
//                    break;
//                }
                User user = iterator.next();
                if (user.getUserName().equals(indexUserName)) {
                    iterator.remove();
                }
            }*/
            Iterator<User> iterator = userList.iterator();
            while (iterator.hasNext()) {
                user = iterator.next();
                if (user.getUserName().equals(indexUserName)) {
                    break;
                }
            }
            //搞定了...remove放在外面
            userList.remove(user);
            System.out.println(user);
            userList.add(new User(userid,username,useremail,userpassword,userquestion,useranswer,uuidFileName));
            request.getServletContext().setAttribute("UserList",userList);
            request.getSession().setAttribute("icon", uuidFileName);
            System.out.println(userList);
/*            System.out.println(userList);
            [User{userId=1, userName='usaimimizugi', userEmail='3436260@qq.com', userPassword='ourinsama', userQuestion='null', userAnswer='null', userIcon='null'}, User{userId=1, userName='usaimimizugi', userEmail='3436260@qq.com', userPassword='ourinsama', userQuestion='123', userAnswer='123', userIcon='null'}]
            定位到问题所在，原来是搞了两个user出来
            */

            request.getRequestDispatcher("userinfo.jsp").forward(request,response);
        } catch (FileUploadException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
