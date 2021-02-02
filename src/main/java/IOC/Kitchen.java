package IOC;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by InvincibleDudu on 08/11/2020 at 15:36
 */
public class Kitchen {
    public static Food getFood(String foodName) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, ClassNotFoundException {
        //根据参数foodName返回相应对象
        //例如，foodName为”Salad“，返回一个Salad对象，foodName为“Beef”，返回一个Beef对象。
        //采用反射，不得出现任何if等分支判断语句，不得修改本方法的签名signature
//        Class<?> c = Food.class;
        return (Food) Class.forName("IOC." + foodName).getDeclaredConstructor().newInstance();
//        Class<?>[] classes = c.getClasses();
//        Class<?> aClass = classes[0];
//        c.getDeclaringClass();
//        Method eat = c.getMethod("eat");
//        Object food = c.getConstructor().newInstance();
    }
}