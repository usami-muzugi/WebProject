package chapter2.homework;

import chapter2.homework.foods.Food;
import chapter2.homework.foods.FoodDaoImpl;
import chapter2.homework.user.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "InitServlet",displayName = "InitServlet",urlPatterns = "/InitServlet",loadOnStartup = 2)
public class InitServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        //用户初始化
        User.setUserId(1);
        User.setUserName("usamimizugi");
        User.setUserEmail("3436260@qq.com");
        User.setUserPassword("ourinsama");
        //菜品列表初始化
        List<Food> list = new ArrayList<Food>();
        //自定义一些菜品
        //public Food(int foodsId, String foodsName, String foodsTaste, InputStream foodsImg, double foodsPrice, String foodsInfo)
        Food koushuiji = new Food(1,"口水鸡","还可以",null,30.00,"逢年过节，走亲访友是我们中国人的传统习惯，所以也免不了宴请亲朋好友在家聚一聚，吃顿饭，喝喝茶，聊聊天，" +
                "增加一些情感交流。都说无鸡不成宴，请客怎么少得了鸡呢。分享一道简单容易上手的宴客菜，闻到香味就要流口水的鸡肉菜式，被红油包裹的鸡肉，红艳鲜亮，皮脆肉嫩、麻辣鲜香、鲜美而不腻");
        Food shuizhuyu = new Food(2,"水煮鱼","也行",null,28.00,"鱼，不仅味美，而且营养，更被中国人谐意为“余”，常有“年年有余”“丰收富足之意”。于是，无论年节、喜庆、聚会等等" +
                "，餐桌上总少不了的就是鱼。。自己在家做水煮鱼，最大的好处是健康，不会添加那些什么一滴红、一滴香之类所谓效果神奇的调料。此外，也可以不必那么油，而且还能根据自家的口味调整麻辣的程度。");
        Food mapotoufu = new Food(3,"麻婆豆腐","还可以",null,30.00,"小时候外婆在自己田地里种了很多青豆，每到夏天青豆吃的差不多的时候，叶子变枯黄可以做干豆的时候外婆就会背着背篓在" +
                "田埂上，将那些已经干瘪的枝条拔起。傍晚时分坐在小凳子上边看着电视边剥着豆荚。看着一颗颗饱满的豆子外婆有些喜出望外。每次回家最想吃的就是外婆做的豆花，夏天的时候外婆做豆花会在里面加一些青豆，这样做出来的豆花有一股清香味。每次外婆做豆花" +
                "前都会给我先盛一碗豆浆留给我，喝着那种醇香的豆浆满满的都是一种幸福与喜悦。有的时候外婆做的豆花会多一些，外婆就会把豆花做成豆腐。即便做成了豆腐，做出来的豆腐也是不失一股豆子的原香味。家里做的最家常的莫过于麻婆豆腐。我们一家人老少都爱" +
                "吃麻辣，麻婆豆腐是我们家首选的豆腐做法。最主要的材料就是家里常备的豆瓣酱，这道菜做法简单，最主要可以开胃是一道不错的下饭菜。 麻婆豆腐是四川传统名菜之一，主要突出口感麻辣。麻主要是花椒，辣主要是豆瓣酱。来四川旅游的外地游客在中餐馆都不错" +
                "过的一道四川传统特色菜肴。麻婆豆腐因地域原因有些烹饪方法有些不同，有些地方是加了肉末，有些地方就是豆腐味主材料。但是麻婆豆腐的最主要是就是麻辣缺一不可。");
        Food shuancaiyu = new Food(4,"口水鸡","开胃",null,30.00,"开胃的很好吃，汤汤水水都要来几勺泡饭，美滋滋");
        Food laizji = new Food(5,"辣子鸡","这个好吃",null,25.00,"【辣子鸡】有两种做法，一种是用辣椒、泡椒、花椒炒制而成；另一种是用郫县豆瓣酱、泡椒、花椒炒制而成。并且主料要选择" +
                "当年土鸡。这道【辣子鸡】用的是鸡腿，并且加了一段藕搭配，算是一道家常改良版的【辣子鸡】");
        Food yuxiangrousi = new Food(6,"鱼香肉丝","这个可以",null,15.00,"这个补肾，味道可以的");
        //将自定义的菜品添加到菜品列表
        FoodDaoImpl.uploadFoods(list,koushuiji);
        FoodDaoImpl.uploadFoods(list,shuizhuyu);
        FoodDaoImpl.uploadFoods(list,mapotoufu);
        FoodDaoImpl.uploadFoods(list,shuancaiyu);
        FoodDaoImpl.uploadFoods(list,laizji);
        FoodDaoImpl.uploadFoods(list,yuxiangrousi);
        this.getServletContext().setAttribute("foodsList",list);
    }
}
