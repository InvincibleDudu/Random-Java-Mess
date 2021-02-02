package DistributedFinals;

import org.apache.activemq.broker.scheduler.Job;
import org.w3c.dom.Text;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Path;
import java.util.Scanner;

/**
 * Created by InvincibleDudu on 08/31/2020 at 13:40
 */
public class Restaurant {
//    Beef b;

    public void order(String foodName) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        System.out.println("客人点了一份" + foodName);
//        b = new Beef();
        Food food = Kitchen.getFood(foodName);
        System.out.println("上菜。。。。");
        food.eat();
    }
}

class Kitchen {

    public static Food getFood(String foodName) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        //根据参数foodName返回相应对象
        //例如，foodName为”Salad“，返回一个Salad对象，foodName为“Beef”，返回一个Beef对象。
        //采用反射，不得出现任何if等分支判断语句，不得修改本方法的签名signature
        Class<?> aClass = Class.forName("DistributedFinals." + foodName);
        //        aClass.getDeclaredMethod("eat", );
        return (Food) aClass.getDeclaredConstructor().newInstance();
    }
}

class TestRestaurant {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Restaurant restaurant = new Restaurant();
        System.out.println("欢迎光临餐厅");
        Scanner in = new Scanner(System.in);
        String food = in.nextLine();
        in.close();
        restaurant.order(food);
        System.out.println("谢谢光临，再见");
    }
}

