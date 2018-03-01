package bean.test.DbUtil;

import bean.test.Emp;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-02-24
 * Time: 16:00
 * ProjectName: WebProject
 * To change this template use File | Settings | File Templates.
 **/

public class DbUtil {
    public static boolean isTrue(String username,String password) {
        boolean flag = false;
        if (Emp.getUsername().equals(username) && Emp.getPassword().equals(password)) {
            flag = true;
        }
        return flag;
    }
}
