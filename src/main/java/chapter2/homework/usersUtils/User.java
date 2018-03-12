package chapter2.homework.usersUtils;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-03-12
 * Time: 16:23
 * ProjectName: WebProject
 * To change this template use File | Settings | File Templates.
 **/

public class User {
    private int userId;
    private String userName;
    private String userEmail;
    private String userPassword;
    private String userQuestion;
    private String userAnswer;
    private String userIcon;

    public User(int userId, String userName, String userEmail, String userPassword) {
        this.userId = userId;
        this.userName = userName;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
    }

    public User(int userId, String userName, String userEmail, String userPassword, String userQuestion, String userAnswer) {
        this.userId = userId;
        this.userName = userName;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
        this.userQuestion = userQuestion;
        this.userAnswer = userAnswer;
    }

    public User(int userId, String userName, String userEmail, String userPassword, String userQuestion, String userAnswer, String userIcon) {
        this.userId = userId;
        this.userName = userName;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
        this.userQuestion = userQuestion;
        this.userAnswer = userAnswer;
        this.userIcon = userIcon;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserQuestion() {
        return userQuestion;
    }

    public void setUserQuestion(String userQuestion) {
        this.userQuestion = userQuestion;
    }

    public String getUserAnswer() {
        return userAnswer;
    }

    public void setUserAnswer(String userAnswer) {
        this.userAnswer = userAnswer;
    }

    public String getUserIcon() {
        return userIcon;
    }

    public void setUserIcon(String userIcon) {
        this.userIcon = userIcon;
    }
}
