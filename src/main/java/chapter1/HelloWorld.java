package chapter1;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        String info = getInfo();
        System.out.println(info);
    }

    public static String getInfo() {
        return "Hello World!";
    }

    public static void test() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World!");
        }
    }
}
