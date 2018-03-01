package bean.test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-02-24
 * Time: 16:00
 * ProjectName: WebProject
 * To change this template use File | Settings | File Templates.
 **/

public class Emp {
    private static String username;
    private static String password;
    private static Map<Integer, Info> map;

    static {
        Emp.setUsername("ourinsama");
        Emp.setPassword("usamimizugi");
        map = new HashMap<Integer, Info>();
        map.put(101, new Info(101, "開學", "請同學們于9月1日前來報道!"));
        map.put(102, new Info(102, "選課", "開始選課啦~"));
        map.put(103, new Info(103, "競選班委", "將於近期競選班幹部~"));
        map.put(104, new Info(104, "評選獎學金", "評選獎學金啦~    "));

    }

    public static void infoAdd(Info info) {

        map.put(info.getInfoId(), info);

    }

    public static void infoRemove(Integer integer) {
        map.remove(integer);
    }

    public static void infoReplace(Info info) {
        map.replace(info.getInfoId(), info);
    }

    public static Map<Integer, Info> getMap() {
        return map;
    }

    public static void setMap(Map<Integer, Info> map) {
        Emp.map = map;
    }

    public static class Info {
        private int infoId;
        private  String infoName;
        private  String infoMsg;

        public Info(int infoId, String infoName, String infoMsg) {
            this.infoId = infoId;
            this.infoName = infoName;
            this.infoMsg = infoMsg;
        }

        public int getInfoId() {
            return infoId;
        }

        public void setInfoId(int infoId) {
            this.infoId = infoId;
        }

        public String getInfoName() {
            return infoName;
        }

        public void setInfoName(String infoName) {
            this.infoName = infoName;
        }

        public String getInfoMsg() {
            return infoMsg;
        }

        public void setInfoMsg(String infoMsg) {
            this.infoMsg = infoMsg;
        }
    }

    private Emp() {}

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        Emp.username = username;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        Emp.password = password;
    }
}

