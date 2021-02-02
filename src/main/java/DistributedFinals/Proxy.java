package DistributedFinals;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
//import java.lang.reflect.Proxy;

interface Vehicle {
    void drive();
}

interface Calc {
    int divide(int a, int b);
}

/**
 * Created by InvincibleDudu on 08/31/2020 at 16:11
 */
public class Proxy {
    public static void main(String[] args) {
        InvocationHandler handler = new ProxyHandler(new Train());
        var v = (Vehicle) java.lang.reflect.Proxy.newProxyInstance(Train.class.getClassLoader(),
                Train.class.getInterfaces(), handler);
        v.drive();

    }
}

class ProxyHandler implements InvocationHandler {

    Object obj;

    public ProxyHandler(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("BEFORE");
        method.invoke(obj, args);
        System.out.println("AFTER");
        return null;
    }
}

class Car implements Vehicle {

    @Override
    public void drive() {
        System.out.println("Car Spins...");
    }
}

class Train implements Vehicle {

    @Override
    public void drive() {
        System.out.println("Train Derails...");
    }
}

class Airplane implements Vehicle {

    @Override
    public void drive() {
        System.out.println("Airplane Crashes...");
    }
}

class Division implements Calc {

    @Override
    public int divide(int a, int b) {
        int result = -1;
        try {
            System.out.println("开始计算.....");
            result = a / b;
            System.out.println("计算完毕.....");
            return result;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

}

@SuppressWarnings("SuspiciousInvocationHandlerImplementation")
class CalcProxyHandler implements InvocationHandler {

    Object obj;

    public CalcProxyHandler(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        var result = -9999;
        if ((int) args[1] == 0) {
            System.out.println("除零错误！");
            return result;
        }
        result = (int) method.invoke(obj, args);
//        result = ((int)args[0] / (int)args[1]);
        if (((int) args[0] % (int) args[1]) != 0) {
            System.out.println("余数为：" + ((int) args[0] % (int) args[1]));
        }
        return result;
    }
}

class TestCalc {
    public static void main(String[] args) {
        InvocationHandler handler = new CalcProxyHandler(new Division());
        var div = (Calc) java.lang.reflect.Proxy.newProxyInstance
                (Division.class.getClassLoader(), Division.class.getInterfaces(), handler);
        System.out.println(div.divide(7, 2));
        System.out.println("");
        System.out.println(div.divide(7, 0));
        System.out.println("");
        System.out.println(div.divide(18, 3));
    }
}