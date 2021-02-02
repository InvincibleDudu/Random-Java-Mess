package test;

/**
 * Created by InvincibleDudu on 09/28/2020 at 14:03
 */
public interface TestInterface {

    int a = 3;

    static void staticMethod() {
        System.out.println("Static Method");
    }

    int method();    //Can not have method body

    default void defaultMethod() {
        System.out.println("Default Method");
    }

}

interface AnotherInterface {
    void anotherMethod();

    static void anotherStaticMethod() {
        System.out.println("Another Static Method");
    }

    default void anotherDefaultMethod() {
        System.out.println("Another Default Method");
    }
}

class TestImpl implements  TestInterface, AnotherInterface {

//    @Override
//    public int method() {
//        System.out.println("Method");
//        return 0;
//    }

//    @Override
//    public void defaultMethod() {
//    }

    @Override
    public void anotherMethod() {
        System.out.println("Another Method");
    }

    @Override
    public int method() {
        System.out.println("Method");
        return 0;
    }
}

@AtInterface
class DriverInterface {
    public static void main(String[] args) {
        var t = new TestImpl();
        TestInterface.staticMethod();
        System.out.println(TestInterface.a);
        t.method();
        t.anotherMethod();
        t.defaultMethod();
        t.anotherDefaultMethod();
    }

}

@interface AtInterface {
    String s = "at";
    String stringMethod() default "";
}

@AtInterface
class atClass {
    public static void main(String[] args) {
        System.out.println();
    }

}
