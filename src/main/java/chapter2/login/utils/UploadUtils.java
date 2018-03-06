package chapter2.login.utils;

import java.util.UUID;

/**
 * 文件上传工具类
 */
public class UploadUtils {
    public static String getUUIDFileName(String filename) {
        int index = filename.lastIndexOf(".");
        String string = filename.substring(index);
        return UUID.randomUUID().toString() + string;
    }

    public static void main(String[] args) {
        System.out.println(getUUIDFileName("1.jpg"));
    }
}
