package bean;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-02-05
 * Time: 11:18
 * ProjectName: WebProject
 * To change this template use File | Settings | File Templates.
 **/

public class Emp {
    private String account;
    private String name;
    private String password;
    private String email;

    public Emp(String account, String name, String password, String email) {
        this.account = account;
        this.name = name;
        this.password = password;
        this.email = email;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
