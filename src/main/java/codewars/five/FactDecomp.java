package codewars.five;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by InvincibleDudu on 09/27/2020 at 16:11
 * <p>
 * <p>
 * The aim of the kata is to decompose n! (factorial n) into its prime factors.
 * <p>
 * Examples:
 * <p>
 * n = 12; decomp(12) -> "2^10 * 3^5 * 5^2 * 7 * 11"
 * since 12! is divisible by 2 ten times, by 3 five times, by 5 two times and by 7 and 11 only once.
 * <p>
 * n = 22; decomp(22) -> "2^19 * 3^9 * 5^4 * 7^3 * 11^2 * 13 * 17 * 19"
 * <p>
 * n = 25; decomp(25) -> 2^22 * 3^10 * 5^6 * 7^3 * 11^2 * 13 * 17 * 19 * 23
 * Prime numbers should be in increasing order. When the exponent of a prime is 1 don't put the exponent.
 * <p>
 * Notes
 * <p>
 * the function is decomp(n) and should return the decomposition of n! into its prime factors in increasing order of the primes, as a string.
 * factorial can be a very big number (4000! has 12674 digits, n will go from 300 to 4000).
 */
public class FactDecomp {

    public static String decomp(int n) {
        // your code
        return "";
    }

    static List<Integer> getDivisor(int n) {
        List<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
//        var sf = new StringBuffer();
        for (int i = 1; i * i < n; i++) {
            if (n % i == 0) {
                list.add(i);
                list.add(n / i);
            }
        }
        Collections.sort(list);
        return list;
    }

    public static void main(String[] args) {
        System.out.println(factorial(6));
        System.out.println(factorial(8));
        System.out.println(factorial(12));
        System.out.println(getDivisor(66688765));
    }

    public static int factorial(int n) {
        if (n == 0)
            return 1;
        return n * factorial(n - 1);
    }


}




