package codewars.six;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by InvincibleDudu on 10/09/2020 at 16:04
 * <p>
 * Completed at 10-09 16:12:36
 * <p>
 * This was ez..
 */
public class MultipleOf3Or5 {
    public static int solution(int number) {
        if (number <= 0)
            return 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                list.add(i);
            }
        }
        System.out.println(list);
        int result = 0;
        for (int a : list) {
            result += a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(solution(10));
    }
}
