package chapter1;

/**
 * Created by IntelliJ IDEA.
 * chapter1.User: wzard
 * Date: 2018-01-31
 * Time: 16:03
 * ProjectName: WebProject
 * To change this template use File | Settings | File Templates.
 **/

public class Student {
    private static String name;
    private static int age;

    public Student() {
    }

    public void printName() {
        System.out.println("chapter1.User name is :"+this.name);
    }

    //Ctrl + D 快速复制代码
    public void printAge() {
        //Ctrl + W 选择代码
        //Ctrl + Shift + W 释放代码
        //Ctrl + Left/Right 移动光标到单词最左或最右
        System.out.println("chapter1.User name is :"+this.age);
    }


    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Student.name = name;
    }

    public static int getAge() {
        return age;
    }

    public static void setAge(int age) {
        Student.age = age;
    }
}
