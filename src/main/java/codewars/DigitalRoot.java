package codewars;

import java.util.ArrayList;

/**
 * Created by InvincibleDudu on 09/24/2020 at 10:42
 * <p>
 * 6kyu
 * <p>
 * Digital root is the recursive sum of all the digits in a number.
 * <p>
 * Given n, take the sum of the digits of n. If that value has more than one digit, continue reducing in this way until a single-digit number is produced. This is only applicable to the natural numbers.
 * <p>
 * Examples
 * <p>
 * <code>
 * 16  -->  1 + 6 =  7
 * <p>
 * 942  -->  9 + 4 + 2 = 15  -->  1 + 5 = 6
 * <p>
 * 132189  -->  1 + 3 + 2 + 1 + 8 + 9 = 24  -->  2 + 4 = 6
 * <p>
 * 493193  -->  4 + 9 + 3 + 1 + 9 + 3 = 29  -->  2 + 9 = 11  -->  1 + 1 = 2
 * </code>
 * <p>
 * completed at 09-24 11:20:30
 */
public class DigitalRoot {
    public static int digital_root(int n) {
        // ...
        var list = intToDigits(n);
        var sum = 0;
        while (list.size() > 1) {
            for (int a : list) {
                sum += a;
            }
            list = intToDigits(sum);
            sum = 0;
        }
        return list.get(0);
    }

    public static ArrayList<Integer> intToDigits(int temp) {
        var array = new ArrayList<Integer>();
        do {
            array.add(temp % 10);
            temp /= 10;
        } while (temp > 0);
        return array;
    }

    public static void main(String[] a) {
        System.out.println(digital_root(16));
        System.out.println(digital_root(942));
        System.out.println(digital_root(132189));
        System.out.println(digital_root(493193));
//        System.out.println(intToDigits(942));
//        System.out.println(intToDigits(132189));
//        System.out.println(intToDigits(493193));
    }
}
