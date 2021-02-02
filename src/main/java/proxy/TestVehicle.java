package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Vector;

/**
 * Created by InvincibleDudu on 08/12/2020 at 11:25
 */
public class TestVehicle {
    public static void main(String[] args) {
//        Vehicle v = new Airplane();
//        var v = new Airplane();
//        v.drive();
//        v = new Train();
//        v.drive();
        InvocationHandler handler = new ProxyHandler(new Airplane());
        Vehicle vehicle = (Vehicle) Proxy.newProxyInstance(Airplane.class.getClassLoader(), Airplane.class.getInterfaces(), handler);
        vehicle.drive();
    }
}
