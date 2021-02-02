package codewars.six;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static util.ArrayUtil.toIntArray;

/**
 * Created by InvincibleDudu on 09/30/2020 at 10:47
 * <p>
 * <p>
 * In this Kata, you will sort elements in an array by decreasing frequency of elements.
 * <p>
 * If two elements have the same frequency, sort them by increasing value.
 * <p>
 * Forfeited at 09-30 13:47:55
 * <p>
 * Gawd y is this so hard?
 */
public class SortByFrequency {

    public static int[] sortByFrequency(int[] array) {
        int count = 1;
//        int[] result = new int[array.length];
//        var map = new HashMap<Integer, Integer>();
        List<PairOfInt> list = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
//        var pair = new PairOfInt();
        Arrays.sort(array);
//        System.out.println("OG" + Arrays.toString(array));
        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                count++;
            } else {
//                map.put(array[i - 1], count);
                list.add(new PairOfInt(array[i - 1], count));
                count = 1;
            }
            if (i + 1 == array.length)
                list.add(new PairOfInt(array[i], count));
        }
        for (int j = 0; j < list.size(); j++) {
            PairOfInt pair = list.get(j);
//            times.add(pair.getTimes());
//            System.out.println(pair.toString());
//        }
//        Collections.sort(times);
//        for (PairOfInt pairs : list)
//            if (pairs.getTimes() == t)
//            int time = pair.getTimes();
            if (j > 0 && list.get(j - 1).getTimes() < pair.getTimes()) {
                for (int i = 0; i < pair.getTimes(); i++) {
                    result.add(0, pair.getValue());
                }
                continue;
            }
            for (int i = 0; i < pair.getTimes(); i++) {
                result.add(pair.getValue());
            }
        }
//        System.out.println(map);
        return toIntArray(result);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortByFrequency(new int[]{2, 3, 5, 3, 7, 9, 5, 3, 7})));
        System.out.println(Arrays.toString(sortByFrequency(new int[]{2, 3, 5, 3, 7, 9, 5, 3, 7})));
        System.out.println(Arrays.toString(sortByFrequency(new int[]{2, 3, 5, 3, 7, 9, 5, 3, 7, 9})));
    }
}

@Data
@AllArgsConstructor
class PairOfInt {
    int value;
    int times;
}