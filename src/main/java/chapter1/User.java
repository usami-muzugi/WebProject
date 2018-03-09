package chapter1;

public class User {
    private String name;
    private int age;

    public User() {
        System.out.println("这是一个没有参数的构造方法");
    }

    @Override
    public String toString() {
        return "chapter1.Food{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("这是一个带有参数的构造方法");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        //使用构造方法
        User user = new User();
        System.out.println(user.toString());
    }

    //https://class.imooc.com/lesson/373#mid=7144
}
