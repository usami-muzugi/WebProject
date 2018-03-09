package chapter2.homework.UserUtils;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-03-07
 * Time: 09:29
 * ProjectName: WebProject
 * To change this template use File | Settings | File Templates.
 **/

public class User {
    /**
     * 菜ID、菜名、口味、菜品图片、菜品价格、菜品描述
     */
    private static int foodsId;
    private static String foodsName;
    private static String foodsTaste;
    private static float foodsPrice;
    private static String foodsInfo;

    public static int getFoodsId() {
        return foodsId;
    }

    public static void setFoodsId(int foodsId) {
        User.foodsId = foodsId;
    }

    public static String getFoodsName() {
        return foodsName;
    }

    public static void setFoodsName(String foodsName) {
        User.foodsName = foodsName;
    }

    public static String getFoodsTaste() {
        return foodsTaste;
    }

    public static void setFoodsTaste(String foodsTaste) {
        User.foodsTaste = foodsTaste;
    }

    public static float getFoodsPrice() {
        return foodsPrice;
    }

    public static void setFoodsPrice(float foodsPrice) {
        User.foodsPrice = foodsPrice;
    }

    public static String getFoodsInfo() {
        return foodsInfo;
    }

    public static void setFoodsInfo(String foodsInfo) {
        User.foodsInfo = foodsInfo;
    }
}
