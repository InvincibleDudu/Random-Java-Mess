package IOC;

import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

/**
 * Created by InvincibleDudu on 08/11/2020 at 15:37
 */
public class TestRestaurant {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Restaurant restaurant = new Restaurant();
        System.out.println("欢迎光临餐厅");
        Scanner in = new Scanner(System.in);
        String food = in.nextLine();
        in.close();
        restaurant.setFood(Kitchen.getFood(food));
        restaurant.order();
        System.out.println("谢谢光临，再见");
    }
}
