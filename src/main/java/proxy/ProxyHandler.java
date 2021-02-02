package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by InvincibleDudu on 08/12/2020 at 13:29
 */
public class ProxyHandler implements InvocationHandler {
    Object object;

    public ProxyHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Before...");
        method.invoke(object, args);
        System.out.println("After...");
        return null;
    }
}
