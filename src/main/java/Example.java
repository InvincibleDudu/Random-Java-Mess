import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by InvincibleDudu on 09/23/2020 at 10:22
 */
public class Example {
    String str = new String("hello");
    char[] ch = {'a', 'b'};

    public static void main(String args[]) {
        Example ex = new Example();
        ex.change(ex.str, ex.ch);
        System.out.println(ex.str + " and ");
        System.out.println(ex.ch);
        Object obj = new Object();
        List aList = new ArrayList();
        List bList = new LinkedList();
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            aList.add(0, obj);
        }
        long t2 = System.currentTimeMillis() - t1;
        t1 = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            bList.add(0, obj);
        }
        long t3 = System.currentTimeMillis() - t1;
        System.out.println(t2);
        System.out.println(t3);
        do {
            System.out.println("aaa");
            t1++;
        } while (t1 < 5);
    }

    public void change(String str, char[] ch) {
        str = "test ok";
        ch[0] = 'c';
        List<String> a = new ArrayList<>();

    }
}
