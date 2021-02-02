package codewars;

import java.util.Arrays;

/**
 * Created by InvincibleDudu on 09/16/2020 at 14:40
 * <p>
 * 6kyu
 * As the name may already reveal, it works basically like a Fibonacci,
 * but summing the last 3 (instead of 2) numbers of the sequence to generate the next.
 * <p>
 * So, if we are to start our Tribonacci sequence with [1, 1, 1] as a starting input (AKA signature),
 * we have this sequence:
 * [1, 1 ,1, 3, 5, 9, 17, 31, ...]
 * <p>
 * But what if we started with [0, 0, 1] as a signature? As starting with [0, 1] instead of [1, 1]
 * basically shifts the common Fibonacci sequence by once place, you may be tempted to think that we would get the same sequence shifted by 2 places, but that is not the case and we would get:
 * [0, 0, 1, 1, 2, 4, 7, 13, 24, ...]
 * <p>
 * Well, you may have guessed it by now, but to be clear:
 * you need to create a fibonacci function that given a signature array/list,
 * returns the first n elements - signature included of the so seeded sequence.
 * <p>
 * Well this was easier than I thought, especially the x one.
 */
public class Tribonacci {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(tribonacci(new double[]{1, 1, 1}, 10)));
        System.out.println(Arrays.toString(tribonacci(new double[]{0, 0, 1}, 10)));
        System.out.println(Arrays.toString(xbonacci(new double[]{1, 1, 1, 1}, 10)));
        System.out.println(Arrays.toString(xbonacci(new double[]{0, 0, 0, 0, 1}, 10)));
        System.out.println(Arrays.toString(xbonacci(new double[]{1, 0, 0, 0, 0, 0, 1}, 10)));
        System.out.println(Arrays.toString(xbonacci(new double[]{8.0, 4.0, 20.0, 4.0, 0.0, 5.0, 7.0, 2.0, 5.0, 10.0, 14.0, 4.0, 3.0, 2.0, 9.0, 4.0, 8.0, 14.0, 15.0}, 45)));

    }

    public static double[] tribonacci(double[] s, int n) {
        // hackonacci me
        if (n == 0)
            return new double[0];
        double[] a = new double[n];
        //            return
        System.arraycopy(s, 0, a, 0, Math.min(n, 3));
//        Arrays.copyOf()
        for (int i = 3; i < n; i++) {
            a[i] = a[i - 3] + a[i - 2] + a[i - 1];
        }
        return a;
    }

    public static double[] xbonacci(double[] signature, int n) {
        // hackonacci me
        System.out.println(signature.length);
        if (n == 0)
            return new double[0];
        var a = Arrays.copyOf(signature, n);
        for (int i = signature.length; i < n; i++) {
            for (int j = signature.length; j > 0; j--) {
                a[i] += a[i - j];
            }
        }
        return a;
    }
}
