package codewars.four;

import lombok.ToString;

import java.lang.reflect.*;
//interface BagelInterface {
//    Bagel getBagel();
//}

/**
 * Created by InvincibleDudu on 10/19/2020 at 11:38
 */
public class Bagel {
    public final int getValue() {
        return 3;
    }
}

class BagelSolver {

    //    @Override
    public static Bagel getBagel() throws NoSuchFieldException, IllegalAccessException {
        // TODO : Implement me.
//        InvocationHandler handler = new Handler(new Bagel());
//        var v = (BagelInterface) Proxy.newProxyInstance(BagelSolver.class.getClassLoader(), BagelSolver.class.getInterfaces(), handler);
////        v.getBagel();
//        System.out.println("!!");
//        System.out.println(v);
////        return (Bagel) v;
//        var b = new Bagel();
//        b.getClass().
        var f = Boolean.class.getDeclaredField("TRUE");
//        var m = Field.class.getDeclaredField("modifiers");
//        m.setAccessible(true);
//        m.setInt(f, f.getModifiers() & ~Modifier.FINAL);
        f.setAccessible(true);
        f.set(null, Boolean.FALSE);
        return new Bagel();
    }

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
//        BagelInterface b = new BagelSolver();
        var m = Field.class.getDeclaredField("modifiers");
        var bagel = BagelSolver.getBagel();
        System.out.println(bagel.getValue());
//        var cl = Class.forName("codewars.four.Bagel");
    }
}

@ToString
class Handler implements InvocationHandler {

    Object obj;

    public Handler(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws InvocationTargetException, IllegalAccessException {
//        method.invoke(obj, args);
        return 4;
    }
}