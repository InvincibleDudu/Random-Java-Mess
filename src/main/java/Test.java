import bean.Student;
import util.ArrayUtil;

import javax.swing.tree.TreeNode;
import java.applet.Applet;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.*;

/**
 * Created by InvincibleDudu on 07/08/2020 at 19:00
 */
public class Test {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, UnsupportedEncodingException {
//        int[] arr = {6, 1, 2, 9, 3, 4, 5};
//        int[] result = bubbleSort(arr);
//        for (int i = 0; i < arr.length; i++)
//            System.out.print(result[i] + " ");
//        var i = 1;
//        i = i++;
//        System.out.println(i);
//        var j = i++;
//        System.out.println("i = " + i + " j = " + j );
//        var k = i+ ++i * i++;
//        System.out.println(i + j + k);
//        byte x = 64;
//        System.out.println(x);
//        var i = x<<2;
//        byte y = (byte)(-257);
//        System.out.println(i+" "+y);
//        B b = new C();
//        A a = b;
//        if(a instanceof A) System.out.println("A");
//        if(a instanceof B) System.out.println("B");
//        if(a instanceof C) System.out.println("C");
//        if(a instanceof D) System.out.println("D");
//        System.out.println(Math.random());
//        System.out.println();
//
//        2020-08-11 10:57:34
//        Thread t = new Thread( () -> System.out.println("This is the sub thread"));
//        t.start();
//
//        2020-08-11 13:48:04
        Class<?> c = Student.class;
        var setAge = c.getMethod("setAge", int.class);
        var student = c.getConstructor(int.class, String.class).newInstance(30, "invdu");
        setAge.invoke(student, 50);
        var check = c.getMethod("testStudent", int.class, String.class);
        var invdudududu = (String) check.invoke(student, 20, "invdudududu");
        System.out.println(invdudududu);
        Class<?> rectClass = Rectangle.class;
        Method area = rectClass.getDeclaredMethod("area", double.class, double.class);
        Object rect = rectClass.getConstructor().newInstance();
        System.out.println(area.invoke(rect, 3, 5));
        System.out.println("Args: " + Arrays.toString(args));
        var a = new int[3];
        var s = new Stack<Integer>();
        System.out.println(s.contains(3));
        s.push(3);
        System.out.println(s.contains(3));
//        var ll = new LinkedList<Integer>();
//        ll.add(3, 5);
//        System.out.println(ll.get(3));
        var h = new Hashtable<Student, String>();
        var hm = new HashMap<Student, String>();
//        Iterator<String> i = new Iterator<>();
        h.put(new Student(), "a");
        hm.put(new Student(), "a");
        h.put(new Student(15, "dumb"), "b");
        hm.put(new Student(15, "dumb"), "b");
        System.out.println(h);
        System.out.println(hm);
        Applet ap = new Applet();
        System.out.println(ap instanceof Object);
        var aa = "3";
        var bb = "3";
        System.out.println(aa.hashCode());
        System.out.println(bb.hashCode());
        byte b1 = 1, b2 = 2, b3, b6;
        final byte b4 = 4, b5 = 6;
        b6 = b4 + b5;
        b3 = (byte) (b1 + b2);
        System.out.println(b6);
        byte[] src = new byte[]{3, 5};
        var dst = new String(src, "GBK").getBytes(StandardCharsets.UTF_8);
        System.out.println(Arrays.toString(dst));
//        String a = "87";
//        int b= Integer.parseInt(a);
//        System.out.println(b);
//        int f = 53252523;
//        String ss = String.valueOf(f);
//        System.out.println(ss.length());
        int[] arr2 = new int[]{3, 2, 1};
//        for (int arr: arr2) {
//            System.out.println(arr.);
        Object o = new Object() {
            @Override
            public boolean equals(Object obj) {
                return true;
            }
        };
        System.out.println(o.equals("aaa"));
//        }
        int[] arr = new int[]{5, 1, 6, 3};
        int b = 3;
        swap(arr, b);
        System.out.println(Arrays.toString(arr) + b);
        new HelloB();
        String s1 = "uml";
        String s2 = "uml";
        String s3 = new String("uml");
        String s4 = new String("uml");
        System.out.println(s1 == s2);
        System.out.println(s3 == s4);
        var bin = 0x0003;   //0000 0011
        bin = 0x0001;
        var dec = 7;    //0000 0111
        System.out.println(bin);
        System.out.println(~bin);
        System.out.println(bin | dec);
    }


    public static void swap(int[] a, int b) {
        final int c;
        b = 13;
        a[0] = 595;
    }

    void Test() {
        var a = "aaa";
    }

}

//class A {
//    public static void main(String[] args) {
//        int[] a = new int[3];
//        Test.bubbleSort(a);
//    }
//}
//class B extends A{}
//class C extends B{}
//class D extends C{}
class HelloA {
    static {
        System.out.println("helloa");
    }

    public HelloA() {
        System.out.println("constructA");
    }
}

class HelloB extends HelloA {
    static {
        System.out.println("helloB");
    }

    public HelloB() {
        System.out.println("constructB");
    }
}

class Value {
    public int i = 15;
}

class Test2 {
    public static void main(String[] argv) {
        Test2 t = new Test2();
        t.first();
    }

    public void first() {
        int i = 5;
        Value v = new Value();
        v.i = 25;
        System.out.println("before first " + v.i);
        second(v, i);
        System.out.println("first " + v.i);
    }

    public void second(Value v, int i) {
        i = 0;
        v.i = 20;
        Value val = new Value();
        v = val;
        System.out.println("second " + v.i + " " + i);
    }
}

class C {
    public static final int i = 0;

    public static void main(String[] args) {
        System.out.println(3 | 4);
    }
}

class Ali {
    public static void main(String[] args) {
        var count = 0;
        for (int i = 1000; i < 2000 ; i++) {
            var integers = ArrayUtil.intToDigits(i);
            int i1 = integers.get(0);
            int i2 = integers.get(1);
            int i3 = integers.get(2);
            int i4 = integers.get(3);
            boolean twoDigits =  i1 == i2 || i1 == i3 || i1 == i4 || i2 == i4 || i2 == i3|| i3 == i4;
            boolean threeDigits = !(i1 == i2 && i2 == i3) && !(i1 == i3 && i3 == i4) && !(i1 == i4 && i2 == i4) && !(i2 == i3 && i2 == i4);
            boolean doubleTwoDigits = !(i1 == i4 && i2 == i3) && !(i3 == i1 && i2 == i4) && !(i2 == i1 && i3 == i4);
            if (twoDigits && threeDigits && doubleTwoDigits) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println(count);
    }
}

class TreeN {
    public static void main(String[] args) {
        TreeNode tn;
        System.out.println("3" + args[0]);
    }
}

class Test1 {
    void method() {

    }
    public static void main(String[] args) {
        char s = '\u2013';
        double d = 100;
        TreeN.main(new String[]{"0", "2"});
        System.out.println(s);
    }
//    int method() {
//       return 1;
//    }


}

