package chapter2.homework.Utils;

import java.util.UUID;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-03-13
 * Time: 09:20
 * ProjectName: WebProject
 * To change this template use File | Settings | File Templates.
 **/

public class UuidMaker {
    public static String UuidMaker(String filename) {
        // 将文件名的前面部分进行截取：xx.jpg   --->   .jpg
        int index = filename.lastIndexOf(".");
        String extention = filename.substring(index);
        String uuidFileName = UUID.randomUUID().toString().replace("-", "")+extention;
        return uuidFileName;
    }
}
