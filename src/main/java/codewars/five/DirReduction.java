package codewars.five;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by InvincibleDudu on 10/10/2020 at 11:43
 * <p>
 * Completed at 10-10 13:50:07
 */
public class DirReduction {
    static final String s = "SOUTH", n = "NORTH", e = "EAST", w = "WEST";

    public static String[] dirReduc(String[] arr) {
        // Your code here.
        //        list = Arrays.asList(arr);
        List<String> list = new ArrayList<>(Arrays.asList(arr));
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).equals(oppositeDir(list.get(i - 1)))) {
                list.remove(i - 1);
                list.remove(i - 1);
                i = 0;
            }
        }
        return list.toArray(new String[0]);
    }

    public static String oppositeDir(String dir) {
        return switch (dir) {
            case s -> n;
            case n -> s;
            case e -> w;
            case w -> e;
            default -> null;
        };
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(dirReduc(new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"})));
        System.out.println(Arrays.toString(dirReduc(new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH"})));

    }
}
