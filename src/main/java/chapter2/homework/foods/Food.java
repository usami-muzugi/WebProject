package chapter2.homework.foods;

import java.io.InputStream;

/**
 * Foods类，专门存储菜品
 */
public class Food {
    private int foodsId;
    private String foodsName;
    private String foodsTaste;
    private InputStream foodsImg;
    private double foodsPrice;
    private String foodsInfo;

    public Food(int foodsId, String foodsName, String foodsTaste, InputStream foodsImg, double foodsPrice, String foodsInfo) {
        this.foodsId = foodsId;
        this.foodsName = foodsName;
        this.foodsTaste = foodsTaste;
        this.foodsImg = foodsImg;
        this.foodsPrice = foodsPrice;
        this.foodsInfo = foodsInfo;
    }

    public int getFoodsId() {
        return foodsId;
    }

    public void setFoodsId(int foodsId) {
        this.foodsId = foodsId;
    }

    public String getFoodsName() {
        return foodsName;
    }

    public void setFoodsName(String foodsName) {
        this.foodsName = foodsName;
    }

    public String getFoodsTaste() {
        return foodsTaste;
    }

    public void setFoodsTaste(String foodsTaste) {
        this.foodsTaste = foodsTaste;
    }

    public InputStream getFoodsImg() {
        return foodsImg;
    }

    public void setFoodsImg(InputStream foodsImg) {
        this.foodsImg = foodsImg;
    }

    public double getFoodsPrice() {
        return foodsPrice;
    }

    public void setFoodsPrice(double foodsPrice) {
        this.foodsPrice = foodsPrice;
    }

    public String getFoodsInfo() {
        return foodsInfo;
    }

    public void setFoodsInfo(String foodsInfo) {
        this.foodsInfo = foodsInfo;
    }

    @Override
    public String toString() {
        return "Food{" +
                "foodsId='" + foodsId + '\'' +
                ", foodsName='" + foodsName + '\'' +
                ", foodsTaste='" + foodsTaste + '\'' +
                ", foodsImg=" + foodsImg +
                ", foodsPrice=" + foodsPrice +
                ", foodsInfo='" + foodsInfo + '\'' +
                '}';
    }
}
