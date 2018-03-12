package chapter2.homework.foodsUtils;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-03-12
 * Time: 16:32
 * ProjectName: WebProject
 * To change this template use File | Settings | File Templates.
 **/

public class Food {
    private int foodId;
    private String foodName;
    private String foodTaste;
    private String foodIcon;
    private double foodPrice;
    private String foodInfo;

    public Food(int foodId, String foodName, String foodTaste, String foodIcon, double foodPrice, String foodInfo) {
        this.foodId = foodId;
        this.foodName = foodName;
        this.foodTaste = foodTaste;
        this.foodIcon = foodIcon;
        this.foodPrice = foodPrice;
        this.foodInfo = foodInfo;
    }

    public Food(int foodId, String foodName, String foodTaste, double foodPrice, String foodInfo) {
        this.foodId = foodId;
        this.foodName = foodName;
        this.foodTaste = foodTaste;
        this.foodPrice = foodPrice;
        this.foodInfo = foodInfo;
    }

    public Food(int foodId, String foodName) {
        this.foodId = foodId;
        this.foodName = foodName;
    }

    public int getFoodId() {
        return foodId;
    }

    public void setFoodId(int foodId) {
        this.foodId = foodId;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodTaste() {
        return foodTaste;
    }

    public void setFoodTaste(String foodTaste) {
        this.foodTaste = foodTaste;
    }

    public String getFoodIcon() {
        return foodIcon;
    }

    public void setFoodIcon(String foodIcon) {
        this.foodIcon = foodIcon;
    }

    public double getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(double foodPrice) {
        this.foodPrice = foodPrice;
    }

    public String getFoodInfo() {
        return foodInfo;
    }

    public void setFoodInfo(String foodInfo) {
        this.foodInfo = foodInfo;
    }
}
