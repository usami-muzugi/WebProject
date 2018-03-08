package bean.dbUtil;

import bean.Emp;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * Food: wzard
 * Date: 2018-02-05
 * Time: 11:21
 * ProjectName: WebProject
 * To change this template use File | Settings | File Templates.
 **/

public class DbUtil {
    public static Map<String, Emp> map = new HashMap<String, Emp>();
    static {
        map.put("101", new Emp("101", "AA", "123456", "AA@a.com"));
        map.put("102", new Emp("102", "BB", "123456", "BB@a.com"));
        map.put("103", new Emp("103", "CC", "123456", "CC@a.com"));
        map.put("104", new Emp("104", "DD", "123456", "DD@a.com"));
        map.put("105", new Emp("105", "EE", "123456", "EE@a.com"));
    }
    //判断用户名和密码是否正确
    public static boolean selectEmpByAccountAndPassword(Emp emp) {
        boolean flag = false;
        for (String key:map.keySet()) {
            Emp e = map.get(key);
            if (emp.getAccount().equals(e.getAccount()) && emp.getPassword().equals(e.getPassword())) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}
