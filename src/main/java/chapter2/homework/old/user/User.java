package chapter2.homework.old.user;

public class User {
    private static String userEmail;
    private static String userName;
    private static String userPassword;
    private static String userQuestion;
    private static String userAnser;

    public static String getUserEmail() {
        return userEmail;
    }

    public static void setUserEmail(String userEmail) {
        User.userEmail = userEmail;
    }

    public static String getUserName() {
        return userName;
    }

    public static void setUserName(String userName) {
        User.userName = userName;
    }

    public static String getUserPassword() {
        return userPassword;
    }

    public static void setUserPassword(String userPassword) {
        User.userPassword = userPassword;
    }

    public static String getUserQuestion() {
        return userQuestion;
    }

    public static void setUserQuestion(String userQuestion) {
        User.userQuestion = userQuestion;
    }

    public static String getUserAnser() {
        return userAnser;
    }

    public static void setUserAnser(String userAnser) {
        User.userAnser = userAnser;
    }

    public User(String userName,String userPassword) {
        User.userName = userName;
        User.userPassword = userPassword;
    }

    @Override
    public String toString() {
        return userName;
    }
}
