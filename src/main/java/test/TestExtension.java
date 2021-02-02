package test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by InvincibleDudu on 09/28/2020 at 14:49
 */
public class TestExtension {
    public static void main(String[] args) {
        Base b = new SubClass();
        b.baseMethod(3);
//        SubClass s = new SubClass();
//        s.baseMethod(3);
//        s.subMethod(3);
    }
}

class Person {
    String name = "No name";
//    public Person(String nm) {
//        name = nm;
//    }
}

class Employee extends Person {
    String empID = "0000";

    public Employee(String id) {
//        super(id);
        empID = id;
    }
}

class Base {
    private String baseName = "base";

    public Base() {
        System.out.println("Base Constructor");
        callName();
    }

    public void callName() {
        System.out.println(baseName);
    }

    void baseMethod(int a) {
        System.out.println("Base Method: " + a);
    }

    String baseMethod(String a) {
        return "Base String Method: " + a;
    }
}

class SubClass extends Base {
    private String baseName = "sub";

    public SubClass() {
        System.out.println("Sub Constructor");
        callName();
    }

    public void callName() {
        System.out.println(baseName);
    }

    void subMethod(int a) {
        System.out.println("Sub Method: " + a);
    }

    String subMethod(String a) {
        return "Sub String Method: " + a;
    }

}

class A {
}

class B extends A {
}

class C extends A {
}

class D extends B {
}

class AnotherTest {
    static int s = 3;
    static int i;
    static String str;
    static boolean b;

    public static void main(String[] args) {
        class inner {

        }
        System.out.println(s);
        System.out.println(i);
        System.out.println(str);
        System.out.println(b);
        List<A> a = new ArrayList<>();
        List<B> b = new ArrayList<>();
        List<D> d = new ArrayList<>();
        List<Object> o = new ArrayList<>();
        List<? extends A> exA = new ArrayList<>();
        List<? super A> sA = new ArrayList<>();
        List<? extends B> exB = new ArrayList<>();
//        a = exA; ERROR
        exA = a;
        exA = b;
        exA = exB;
        exB = d;
    }
}

class Fruit {
    String s = "Fruit";
}

class Apple extends Fruit {
    String s = "Apple";
}

class Jonathan extends Apple {
    String s = "Jonathan";
}

class Orange extends Fruit {
    String s = "Orange";
}

class Test3 {

    public static void main(String[] args) {
        List<? super Apple> superList = new ArrayList<>();
        superList.add(new Apple());
        superList.add(new Jonathan());
        var o = (Apple) superList.get(0);
        System.out.println(o.s);
        List<? extends Apple> extendsList = new ArrayList<>();
//        extendsList.add(new Fruit());
    }
//    list.add()
    //get Apple对象会报错
    //Apple apple = flistBottem.get(0);

}