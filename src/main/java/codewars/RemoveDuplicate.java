package codewars;

import java.util.Arrays;

/**
 * Created by InvincibleDudu on 09/24/2020 at 16:22
 * <p>
 * <p>
 * Description:
 * In this Kata, you will be given an array of strings and your task is to remove all consecutive duplicate letters from each string in the array.
 * <p>
 * For example:
 * <p>
 * dup(["abracadabra","allottee","assessee"]) = ["abracadabra","alote","asese"].
 * <p>
 * dup(["kelless","keenness"]) = ["keles","kenes"].
 * <p>
 * Completed at 09-24 16:48:43
 */
public class RemoveDuplicate {
    public static String[] dup(String[] arr) {
        //..
        for (int j = 0, arrLength = arr.length; j < arrLength; j++) {
            String str = arr[j];
            for (int i = 1; i < str.length(); i++) {
                if (str.charAt(i) == str.charAt(i - 1)) {
                    str = str.substring(0, i - 1) + str.substring(i);
                    i = 0;
                }
            }
            arr[j] = str;
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(dup(new String[]{"ccccccccoodddddddddewwwaaaaaaaaarrrrsssss", "piccaninny", "hubbubbubboo"})));
//        String str = "1234567890";
//        str = str.substring(0, 4-1) + str.substring(4);
//        System.out.println(str);
    }
}
