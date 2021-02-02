import java.util.Arrays;

import static java.lang.Math.pow;

/**
 * Created by InvincibleDudu on 07/10/2020 at 01:50
 */
public class Narcissistic {
    static int number(int n) {
        int count = 0;
        int[] arr = new int[n];
        for (int j = (int) (pow(10, n - 1)); j < (int) (pow(10, n) - 1) - 1; j++) {
//        int j = 153;
            for (int i = 0; i < n; i++) {
                if (i != n - 1) {
                    arr[i] = (j % ((int) (pow(10, i + 1)))) / ((int) (pow(10, i)));
                } else {
                    arr[i] = j / (int) (pow(10, i));
                }
            }
            int result = 0;
            for (int i = 0; i < n; i++) {
//                System.out.print(arr[i] + ", ");
                result += pow(arr[i], 3);
                if (result == j) {
                    count++;
                    System.out.println("result: " + j);
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
//        int[] arr = new int[3];
//        for (int i = 2; i < 20; i++)
//            System.out.println(i + " " + number(i));
//        arr[0] = 153 % (int) (pow(10, 1));
//        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(args));
    }
}
