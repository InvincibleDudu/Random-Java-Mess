package test;

/**
 * Created by InvincibleDudu on 09/22/2020 at 16:43
 */
public abstract class TestAbstract {
    private int a = 3;
    abstract int uselessMethod(int a);

    static int anotherMethod(int a) {
        var s = "string";
        System.out.println("method in abstrac t" + s);
        return a * 3;
    }

    public static void main(String[] args) {
        System.out.println(anotherMethod(3));
    }
}

class AbstractExtends extends TestAbstract{

    @Override
    int uselessMethod(int a) {
        return 0;
    }

    public static void main(String[] args) {

    }
}