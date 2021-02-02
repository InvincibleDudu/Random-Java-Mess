package codewars;

/**
 * Created by InvincibleDudu on 09/23/2020 at 11:29
 * <p>
 * 5kyu
 * <p>
 * You know what divisors of a number are. The divisors of a positive integer n are said to be proper when you consider only the divisors other than n itself. In the following description, divisors will mean proper divisors. For example for 100 they are 1, 2, 4, 5, 10, 20, 25, and 50.
 * <p>
 * Let s(n) be the sum of these proper divisors of n. Call buddy two positive integers such that the sum of the proper divisors of each number is one more than the other number:
 * <p>
 * (n, m) are a pair of buddy if s(m) = n + 1 and s(n) = m + 1
 * <p>
 * For example 48 & 75 is such a pair:
 * <p>
 * Divisors of 48 are: 1, 2, 3, 4, 6, 8, 12, 16, 24 --> sum: 76 = 75 + 1
 * Divisors of 75 are: 1, 3, 5, 15, 25 --> sum: 49 = 48 + 1
 * <p>
 * Task
 * <p>
 * Given two positive integers start and limit, the function buddy(start, limit) should return the first pair (n m) of buddy pairs such that n (positive integer) is between start (inclusive) and limit (inclusive); m can be greater than limit and has to be greater than n
 * <p>
 * If there is no buddy pair satisfying the conditions, then return "Nothing" or (for Go lang) nil
 * <p>
 * Examples
 * (depending on the languages)
 * <p>
 * buddy(10, 50) returns [48, 75]
 * buddy(48, 50) returns [48, 75]
 * or
 * buddy(10, 50) returns "(48 75)"
 * buddy(48, 50) returns "(48 75)"
 * <p>
 * <p>
 * Finished at 09-23 14:40:25
 * Main takeaway: divisor sum performance hack
 */
public class BodyPairs {
    public static String buddy(long start, long limit) {
        // your code
        for (var i = start; i < limit; i++) {
            if (hasPair(i))
                return "(" + i + " " + (sum(i) - 1) + ")";
        }
        return "Nothing";
    }

    /**
     * @param n Source
     * @return The sum of all of its proper divisors
     */
    public static long sum(long n) {
        long count = 0;
        for (long i = 1; i * i < n; i++) {
            if (n % i == 0) {
                if (n / i == i || i == 1)
                    count += i;
                else
                    count += i + n / i;
            }
        }
        return count;
    }

    public static boolean hasPair(long m) {
        var n = sum(m) - 1;
        if (n < m)
            return false;
        return sum(n) == m + 1;
    }

    public static void main(String[] args) {
        System.out.println(hasPair(2295));
//        System.out.println(sum(15));
//        System.out.println(sum(300));
//        System.out.println(sum(24723));
//        System.out.println(sum(10712233625L));
//        System.out.println(buddy(381, 4318));
//        System.out.println(buddy(2177, 4357));
//        System.out.println(buddy(2382, 3679));
//        System.out.println(buddy(23842, 36795));
//        System.out.println(buddy(1071625, 1103735));
    }
}
