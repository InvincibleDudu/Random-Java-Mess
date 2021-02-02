package codewars.six;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * Created by InvincibleDudu on 10/09/2020 at 14:46
 * <p>
 * Forfeited at 10-09 15:05:34
 * <p>
 * Good thing I forfeited, or I'll be on this doomed path forever...
 * <p>
 * use ^= to cancel out any pairs.
 * <p>
 * <p>
 * Actually this is solvable myself, I just forgot there is a Hashmap method called containsKey...
 */
public class FindOdd {

    public static int findIt(int[] a) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int s : a) {
            if (!hm.containsKey(s)) {
                hm.put(s, 1);
            } else
                hm.put(s, hm.get(s) + 1);
        }
        System.out.println(hm);
        for (Map.Entry<Integer, Integer> integerIntegerEntry : hm.entrySet()) {
            if (integerIntegerEntry.getValue() % 2 == 1)
                return integerIntegerEntry.getKey();
        }
        return 0;
    }
//    }
//    public static int findIt(int[] a) {
//        int xor = 0;
//        for (int j : a)
//            xor ^= j;
//        return xor;
//    }

    public static void main(String[] args) {
        System.out.println(findIt(new int[]{3, 3, 5, 7, 5}));
        System.out.println(findIt(new int[]{20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5}));
    }
}


