package codewars;

import java.util.Arrays;

/**
 * Created by InvincibleDudu on 09/11/2020 at 13:10
 * <p>
 * 1^3 + 5^3 + 3^3 = 153
 * <p>
 * 370 / 371 / 407
 * 1634
 * 9^4 + 4^4 + 7^4 + 4^4 = 9474
 */
public class Narcissistic {

    public static void main(String[] args) {
//        narciss();
        for (int i = 2; i < 6 ; i++) {
            System.out.println(narcissistic(i));
        }
//        System.out.println(narcissistic(3));
//        System.out.println(narcissistic(4));
//        int i = Math.pow()
//        int i = (int) (1359 % Math.pow(10, 4 - 1) / Math.pow(10, 4 - 2));
//        System.out.println(i);
    }

    static void narciss() {
        //count = 3
        for (int i = 100; i < 1000; i++) {
            var f = i / 100;
            var s = i % 100 / 10;
            var t = i % 10;
            if (f * f * f + s * s * s + t * t * t == i)
                System.out.print(i + " ");
        }
        System.out.println("");
        //count = 4
        for (int i = 1000; i < 10000; i++) {
            var f = i / 1000;
            var s = i % 1000 / 100;
            var t = i % 100 / 10;
            //noinspection PointlessArithmeticExpression
            var fo = i % 10 / 1;
            if (Math.pow(f, 4) + Math.pow(s, 4) + Math.pow(t, 4) + Math.pow(fo, 4) == i)
                System.out.print(i + " ");
        }
    }

    static int narcissistic(int count) {
        int[] array = new int[count];
        int answer = 0;
        for (double i = Math.pow(10, count - 1); i < Math.pow(10, count); i++) {
            array[0] = (int) (i / Math.pow(10, count - 1));
            for (int j = 1; j < count; j++) {
                array[j] = (int) (i % Math.pow(10, count - j) / Math.pow(10, count - j - 1));
            }
            var result = 0;
            for (var j : array) {
                result += Math.pow(j, count);
                if (result == i) {
                    answer++;
                    System.out.println(Arrays.toString(array));
                }
            }
        }
        return answer;
    }
}
