package chapter2.homework.FoodsUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-03-07
 * Time: 09:43
 * ProjectName: WebProject
 * To change this template use File | Settings | File Templates.
 **/

public class FoodDaoImpl {
    /**
     * l  菜品数据处理类FoodDaoImpl：
     * 类型描述：
     * 存放菜品信息的List：private static final List<Map<String, Object>> db;
     * 提示：Map中存储的就是一条菜品的信息，也就是UploadUtils中的Map
     * 方法：
     * 添加菜品：public void addFood(Map<String, Object> food)
     * 查询所有菜品信息：public List<Map<String, Object>> getAllFood()
     * 根据菜品名称查询菜品信息：public List<Map<String, Object>> getFoodByName(String foodName)
     * 菜品修改：public void updateFood(Map<String, Object> food
     * 根据菜品ID进行删除：public void deleteFoodById(String id)
     */
    //map用于存储单个菜品的所有信息
    private static Map<String, Object> map; //<>
    //list用于存储所有的菜品
    private static List list;

    static {
        //初始化菜品
        map = new HashMap();
        map
    }

    //


}
