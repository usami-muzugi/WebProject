<%@ page import="Student.Student" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: wzard
  Date: 2018/2/5
  Time: 15:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生成绩</title>

</head>
<body>
<%
    Map<String,Student> map = new HashMap<String, Student>();
    map.put("赵明",new Student(11071010,"赵明",78));
    map.put("李雷",new Student(11071011,"李雷",100));
    map.put("朝梅梅",new Student(11071012,"朝梅梅",90));
    map.put("大熊",new Student(11071013,"大熊",80));
    map.put("李静香",new Student(11071014,"李静香",92));
    map.put("胖虎",new Student(11071015,"胖虎",42));
%>
</body>
<%
    int sum = 1;
    String string = "";
    for (String key:map.keySet()
         ) {
        string += "第"+sum+"条"+map.get(key).toString()+"<br>";
        sum++;
    }
%>
<%=string%>
</html>
