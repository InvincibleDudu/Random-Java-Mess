package codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by InvincibleDudu on 09/08/2020 at 13:29
 * <p>
 * A number m of the form 10x + y is divisible by 7 if and only if x − 2y is divisible by 7. In other words, subtract twice the last digit from the number formed by the remaining digits. Continue to do this until a number known to be divisible or not by 7 is obtained; you can stop when this number has at most 2 digits because you are supposed to know if a number of at most 2 digits is divisible by 7 or not.
 * <p>
 * The original number is divisible by 7 if and only if the last number obtained using this procedure is divisible by 7.
 * <p>
 * Examples:
 * <p>
 * 1 - m = 371 -> 37 − (2×1) -> 37 − 2 = 35 ; thus, since 35 is divisible by 7, 371 is divisible by 7.
 * <p>
 * The number of steps to get the result is 1.
 * <p>
 * 2 - m = 1603 -> 160 - (2 x 3) -> 154 -> 15 - 8 = 7 and 7 is divisible by 7.
 * <p>
 * 3 - m = 372 -> 37 − (2×2) -> 37 − 4 = 33 ; thus, since 33 is not divisible by 7, 372 is not divisible by 7.
 * <p>
 * The number of steps to get the result is 1.
 * <p>
 * 4 - m = 477557101->47755708->4775554->477547->47740->4774->469->28 and 28 is divisible by 7, so is 477557101.
 * <p>
 * The number of steps is 7.
 * <p>
 * Task:
 * Your task is to return to the function seven(m) (m integer >= 0) an array (or a pair, depending on the language) of numbers, the first being the last number m with at most 2 digits obtained by your function (this last m will be divisible or not by 7), the second one being the number of steps to get the result.
 * <p>
 * Forth Note:
 * Return on the stack number-of-steps, last-number-m-with-at-most-2-digits
 * <p>
 * Examples:
 * seven(371) should return [35, 1]
 * seven(1603) should return [7, 2]
 * seven(477557101) should return [28, 7]
 */
public class DivSeven {
    public static long[] seven(long m) {
        // your code
        long count = 0;
//        for (int i = 0; i < countDigits(m) - 2 ; i++){
//        long temp = m;
        while (countDigits(m) > 2) {
            m = (m / 10) - 2 * (m % 10);
            count++;
        }
//        if (temp % 7 == 0)
//            System.out.println("Good");
//        else
//            System.out.println("NG");
//        }
        return new long[]{m, count};
    }

//    public static void main(String[] args) {
//        System.out.println(Arrays.toString(seven(371)));
////        System.out.println(Arrays.toString(seven(373)));
//        System.out.println(Arrays.toString(seven(1603)));
//        System.out.println(Arrays.toString(seven(477557101)));
//        System.out.println(countDigits(5));
//        System.out.println(countDigits(51413));
//        long n = 309888809767L;
//        int m = 309458209;
//        System.out.println(countDigits());
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Long.MAX_VALUE);
//        System.out.println(Integer.MIN_VALUE);
//        System.out.println(Long.MIN_VALUE);
//    }

    public static int countDigits(long num) {
        int count = 0;
        while (num != 0) {
            num /= 10;
            ++count;
        }
        return count;
    }

    public static int count(int[] arr) {
        int count = 0;
        for(int a: arr) {
            if (countDigits(a) % 2 != 0)
                count ++;
        }
        return count;
    }

    public static void main(String[] args) {
        int ARRAYLENGTH = 5;  //指定数组长度
        int[] a = new int[ARRAYLENGTH];
        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入数组，并以回车结束：");
        for(int i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
        }
        System.out.println(count(a));
    }
}
