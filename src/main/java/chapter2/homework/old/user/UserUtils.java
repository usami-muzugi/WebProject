package chapter2.homework.old.user;

public class UserUtils {
    private static String username = User.getUserName();
    private static String password = User.getUserPassword();

    public static boolean isTrue(String username, String password) {
        boolean flag = false;
        if (username.equals(UserUtils.username) & (password.equals(UserUtils.password))) {
            flag = true;
        }
        return flag;
    }
    private UserUtils() {

    }
}
