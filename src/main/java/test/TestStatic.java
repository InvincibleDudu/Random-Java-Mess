package test;

/**
 * Created by InvincibleDudu on 09/24/2020 at 13:45
 */
public class TestStatic {
    {
        System.out.println("Super Class Initializer");
    }
    static {
        System.out.println("Super Class Static");
    }

    public TestStatic() {
        System.out.println("Super Class Constructor");
    }

//    void method()
}

class Sub extends TestStatic {
    static {
        System.out.println("Sub Class Static");
    }

    public Sub() {
        System.out.println("Sub Class Constructor");
    }

//    void method()
    {
        System.out.println("Sub Class Initializer");
    }
}

class Test {
    public static void main(String[] args) {
        new Sub();
//        sub.method();
    }
}