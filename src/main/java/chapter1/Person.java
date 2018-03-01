package chapter1;

public class Person {
    private String name;
    private int id;

    public static void main(String[] args) {
        Person user = new Person();
        user.name = "james";
        user.id = 21;
        System.out.println(user);
        //修改文件名 shift + F6
        //不仅仅可以修改类名，也可以修改成员变量名称
    }

    //ctrl + ALT + m 可以抽取方法中的代码为新的方法
    public static void print() {
        System.out.println("Hello World!");
        System.out.println("Hello World!");
    }

    @Override
    public String toString() {
        return "chapter1.Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
