package test;

/**
 * Created by InvincibleDudu on 10/14/2020 at 14:05
 */
public class TestRecursion {
    static void recurs(int i){
//        int a = 0;
        System.out.println(i);
        recurs(++i);
    }

    public static void main(String[] args) {
        try {
            recurs(3);
        } catch (Exception ignored) {
//            e.printStackTrace();
        }
    }
}
