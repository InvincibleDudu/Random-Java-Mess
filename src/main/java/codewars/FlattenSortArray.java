package codewars;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by InvincibleDudu on 09/08/2020 at 14:28
 * <p>
 * Given a two-dimensional array of integers,
 * return the flattened version of the array with all the integers in the sorted (ascending) order.
 * <p>
 * Example:
 * Given [[3, 2, 1], [4, 6, 5], [], [9, 7, 8]], your function should return [1, 2, 3, 4, 5, 6, 7, 8, 9].
 */
public class FlattenSortArray {

    public static int[] flattenAndSort(int[][] array) {
//        System.out.println(array.length);
        ArrayList<Integer> list = new ArrayList<>();
        for (int[] ints : array) {
            for (int anInt : ints) {
                list.add(anInt);
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
//        ResolverUtil.Test test = new Test();
//        result = bubbleSort(result);
//        return bubbleSort(result);
        Arrays.sort(result);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(flattenAndSort(new int[][]{{3, 2, 1}, {4, 6, 5}, {}, {9, 7, 8}})));
    }

}
