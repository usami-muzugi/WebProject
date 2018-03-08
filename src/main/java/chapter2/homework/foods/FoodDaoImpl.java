package chapter2.homework.foods;

import java.util.Iterator;
import java.util.List;

public class FoodDaoImpl {
    //添加菜品到list
    public static void uploadFoods(List<Food> list, Food food) {
        //判定一下添加的这个菜品是否在list里哟
        boolean flag = false;
        for (Food ignored : list
                ) {
            if (ignored.getFoodsId() == food.getFoodsId()) {
                flag = true;
            }
        }
        if (!flag) {
            list.add(food);
        }
    }

    //查询所有菜品信息
    public static List<Food> getAllFoods(List<Food> list) {
        return list;
    }

    //根据菜品名称查询菜品信息
    public static Food getFoodByName(List<Food> list, String foodName) throws FoodsNotFoundException {
        boolean flag = false;
        Food foods = null;
        for (Food food : list
                ) {
            if ((foods = food).getFoodsName().equals(foodName)) {
                flag = true;
                break;
            }
        }
        if (!flag) {
            return foods;
        } else {
            throw new FoodsNotFoundException("FoodsNotFoundException");
        }
    }
}
