package util;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by InvincibleDudu on 09/30/2020 at 11:21
 */
public class ArrayUtil {

    public static int[] toIntArray(List<Integer> list) {
        int[] result = new int[list.size()];
        for (int i = 0; i < result.length; i++)
            result[i] = list.get(i);
        return result;
    }


    public static ArrayList<Integer> intToDigits(int temp) {
        var array = new ArrayList<Integer>();
        do {
            array.add(temp % 10);
            temp /= 10;
        } while (temp > 0);
        return array;
    }
}
