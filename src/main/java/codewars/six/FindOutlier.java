package codewars.six;

/**
 * Created by InvincibleDudu on 10/09/2020 at 16:40
 * <p>
 * You are given an array (which will have a length of at least 3, but could be very large) containing integers. The array is either entirely comprised of odd integers or entirely comprised of even integers except for a single integer N. Write a method that takes the array as an argument and returns this "outlier" N.
 * <p>
 * Examples
 * [2, 4, 0, 100, 4, 11, 2602, 36]
 * Should return: 11 (the only odd number)
 * <p>
 * [160, 3, 1719, 19, 11, 13, -21]
 * Should return: 160 (the only even number)
 */
public class FindOutlier {
    static int find(int[] integers) {
        int a = Math.abs(integers[0]);
        int b = Math.abs(integers[1]);
        int c = Math.abs(integers[2]);
        if (a % 2 == 0 && b % 2 == 0 && c % 2 == 0) {
            for (int i : integers) {
                if (i % 2 != 0)
                    return i;
            }
        } else if (a % 2 == 1 && b % 2 == 1 && c % 2 == 1) {
            for (int i : integers) {
                if (i % 2 == 0)
                    return i;
            }
        } else if (a % 2 == 0 && b % 2 == 1 && c % 2 == 0)
            return integers[1];
        else if (a % 2 == 0 && b % 2 == 0)
            return integers[2];
        else if (a % 2 == 1 && b % 2 == 0 && c % 2 == 0)
            return integers[0];
        else if (a % 2 == 1 && b % 2 == 1 && c % 2 == 0)
            return integers[2];
        else if (a % 2 == 0)
            return integers[0];
        else if (b % 2 == 0)
            return integers[1];
        return 0;
    }

    public static void main(String[] args) {
        int[] exampleTest1 = {2, 6, 8, -10, 3};
        int[] exampleTest2 = {206847684, 1056521, 7, 17, 1901, 21104421, 7, 1, 35521, 1, 7781};
        int[] exampleTest3 = {Integer.MAX_VALUE, 0, 1};
//        System.out.println(find(exampleTest1));
//        System.out.println(find(exampleTest2));
//        System.out.println(find(exampleTest3));
        System.out.println(find(new int[]{-2147483647, -18, 6, -8, -10, 6, 12, -24, 36}));
        int min = Integer.MIN_VALUE;
        int i = -2147483647;
        System.out.println(i % 2);
    }
}
