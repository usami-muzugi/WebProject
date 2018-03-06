package chapter2.login.UserUtil;

public class User {
    private static String name;
    private static String password;
    private static String nickname;
    private static String hobby;
    private static String sex;

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        User.name = name;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        User.password = password;
    }

    public static String getNickname() {
        return nickname;
    }

    public static void setNickname(String nickname) {
        User.nickname = nickname;
    }

    public static String getHobby() {
        return hobby;
    }

    public static void setHobby(String hobby) {
        User.hobby = hobby;
    }

    public static String getSex() {
        return sex;
    }

    public static void setSex(String sex) {
        User.sex = sex;
    }
}
