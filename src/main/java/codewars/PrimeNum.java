package codewars;

import java.math.BigInteger;

/**
 * Created by InvincibleDudu on 09/10/2020 at 11:11
 *
 * You can assume you will be given an integer input.
 * You can not assume that the integer will be only positive. You may be given negative numbers as well (or 0).
 *
 * NOTE on performance: There are no fancy optimizations required, but still the most trivial solutions might time out.
 * Numbers go up to 2^31 (or similar, depends on language version).
 * Looping all the way up to n, or n/2, will be too slow.
 *
 */
public class PrimeNum {

    public static void main(String[] args) {
//        System.out.println(isPrime(0));
//        System.out.println(isPrime(1));
//        System.out.println(isPrime(2));
//        System.out.println("4: " + isPrime(4));
//        System.out.println(isPrime(8));
//        System.out.println(isPrime(123));
//        System.out.println(isPrime(73));
//        System.out.println(isPrime(75));
//        System.out.println(isPrime(41));
//        System.out.println(isPrime(5099));
//        System.out.println(isPrime(-5));
        System.out.println(isPrime(235892759));

//        java.math.BigInteger b = new BigInteger("390482034820948209");
//        BigInteger.probablePrime(3);
        System.out.println(BigInteger.valueOf(235892759L).isProbablePrime(0));
    }

    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        //Brute Force O(n^2)
        //Or do it like i * i <= num so that TC becomes O(n)
//        for (int i = 2; i <= num / 2; i++) {
//            if (num % i == 0) {
//                System.out.println("Can be divided by: " + i);
//                return false;
//            }
//        }

        //A bit faster, but TC is still O(n)
        //https://www.geeksforgeeks.org/primality-test-set-1-introduction-and-school-method/
        if(num % 2 == 0 | num % 3 == 0)
            return true;

        for (int i = 5; i * i < num; i+=6) {
            if (num % i == 0 || num % (i + 2) == 0) {
//                System.out.print("Can be divided by: " + i + " ");
                return false;
            }
        }
        return true;
    }
}
