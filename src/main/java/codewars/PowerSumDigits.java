package codewars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by InvincibleDudu on 09/24/2020 at 14:15
 * <p>
 * 5kyu
 * <p>
 * The number 81 has a special property, a certain power of the sum of its digits is equal to 81 (nine squared). Eighty one (81), is the first number in having this property (not considering numbers of one digit). The next one, is 512. Let's see both cases with the details
 * <p>
 * 8 + 1 = 9 and 9^2 = 81
 * <p>
 * 512 = 5 + 1 + 2 = 8 and 8^3 = 512
 * <p>
 * We need to make a function, power_sumDigTerm(), that receives a number n and may output the n-th term of this sequence of numbers. The cases we presented above means that
 * <p>
 * <code>
 * power_sumDigTerm(1) == 81
 * <p>
 * power_sumDigTerm(2) == 512
 * </code>
 * <p>
 * Cheated 09-24 16:14:56
 * <p>
 * Still kinda confused.
 */
public class PowerSumDigits {
    public static long powerSumDigTerm(int n) {
        // your code
//        List<Long> list = new ArrayList<>();
//        for (long j = 80; j < 100000000L; j++) {
//            for (int i = 2; i < 8; i++) {
////                System.out.println(j);
//                if (Math.pow(sumAllDigits(j), i) == j) {
//                    System.out.println(j);
//                    list.add(j);
//                    break;
//                }
//            }
//        }
        List<Long> a = new ArrayList<>();
        for (int b = 2; b < 4000; b++) {
            long value = b;
            for (int e = 2; e < 300; e++) {
                value *= b;
                if (sumAllDigits(value) == b) {
                    a.add(value);
                }
            }
        }
//        var arr = a.toArray();
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
        Collections.sort(a);
        System.out.println(a.size());
        System.out.println(a);
        return a.get(n - 1);

    }

    public static int sumAllDigits(long temp) {
        var result = 0;
        do {
            result += temp % 10;
            temp /= 10;
        } while (temp > 0);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(powerSumDigTerm(1));
//        System.out.println(powerSumDigTerm(2));
//        System.out.println(powerSumDigTerm(3));
//        System.out.println(powerSumDigTerm(4));
//        System.out.println(powerSumDigTerm(5));
//        System.out.println(powerSumDigTerm(10));
//        System.out.println(powerSumDigTerm(30));
//        powerSumDigTerm(512);
//        powerSumDigTerm(2401);
//        powerSumDigTerm(4913);
//        for (long i = 0; i < 1000000000L && !BigInteger.valueOf(i).isProbablePrime(20); i++) {
//            System.out.println(i);
//        }
    }
}
