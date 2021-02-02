package DistributedFinals;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by InvincibleDudu on 08/31/2020 at 14:08
 */
public class Reflection {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class<?> cl = Class.forName("DistributedFinals.Rectangle");
        Object rect = cl.getDeclaredConstructor().newInstance();
        Method area = cl.getMethod("area", double.class, double.class);
        //Get private field
        System.out.println(area.invoke(rect, 3.2, 5.9));
        var s = cl.getDeclaredField("s");
        s.setAccessible(true);
        System.out.println(s.get(rect));
    }

}

class Rectangle {
    private final static String s = "Private String";

    public double area(double width, double length) {
        return width * length;
    }

}