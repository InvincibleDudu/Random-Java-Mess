package test;

/**
 * Created by InvincibleDudu on 09/24/2020 at 13:56
 */
public class TestFinally {

    public static void main(String args[]) {
        int num = 10;
        System.out.println(test(num));
        for(a();true;num++){

        }
    }

    static boolean a(){
        System.out.println("aa");
        return true;
    }

    public static int test(int b) {
        try {
            b += 10;
            return b;
        } catch (RuntimeException e) {
        } catch (Exception e2) {
        } finally {
            b += 10;
            return b;
        }
    }
}
