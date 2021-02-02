package codewars.six;

/**
 * Created by InvincibleDudu on 09/29/2020 at 13:22
 * <p>
 * In this Kata, you will be given a number n (n > 0) and your task will be
 * <p>
 * to return the smallest square number N (N > 0)
 * <p>
 * such that n + N is also a perfect square. If there is no answer, return -1
 * <p>
 * Completed at 09-29 13:38:03
 */
public class SquareNum {

    public static long solve(int n) {
        //...
        for (long i = 1; i < n; i++) {
            if (checkPerfectSquare(i * i + n)) {
                System.out.println(i * i);
                return i * i;
            }
        }
        return -1;
    }

    static boolean checkPerfectSquare(double x) {
        // finding the square root of given number
        double sq = Math.sqrt(x);

        /* Math.floor() returns closest integer value, for
         * example Math.floor of 984.1 is 984, so if the value
         * of sq is non integer than the below expression would
         * be non-zero.
         */
        return ((sq - Math.floor(sq)) == 0);
    }

    public static void main(String[] args) {
        System.out.println(checkPerfectSquare(1));
        System.out.println(checkPerfectSquare(2));
        System.out.println(checkPerfectSquare(3));
        System.out.println(solve(1));
    }

}
