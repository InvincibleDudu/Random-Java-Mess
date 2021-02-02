package IOC;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by InvincibleDudu on 08/11/2020 at 15:35
 */
public class Restaurant {
    Food food;

    public void setFood(Food food) {
        this.food = food;
    }

    public void order(String foodName) throws InvocationTargetException, NoSuchMethodException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        System.out.println("客人点了一份" + foodName);
//        b = new Beef();
        food = Kitchen.getFood(foodName);
        System.out.println("上菜。。。。");
        food.eat();
    }

    public void order() {
        System.out.println("上菜。。。。");
        food.eat();
    }
}