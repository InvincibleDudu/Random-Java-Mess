package codewars.six;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by InvincibleDudu on 09/28/2020 at 10:23
 * <p>
 * In this simple Kata your task is to create a function that turns a string
 * <p>
 * into a Mexican Wave. You will be passed a string and you must return
 * <p>
 * that string in an array where an uppercase letter is a person standing up.
 * <p>
 * 1.  The input string will always be lower case but maybe empty.
 * <p>
 * 2.  If the character in the string is whitespace then pass over it as if it was an empty seat
 * <p>
 * Example
 * <p>
 * wave("hello") => []string{"Hello", "hEllo", "heLlo", "helLo", "hellO"}
 * <p>
 * Completed at 09-28 11:02:17 Easier than I thought.
 */
public class MexicanWave {

    public static String[] wave(String str) {
//        String[] strings = new String[str.trim().length()];
        List<String> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ')
                continue;
            list.add(str.substring(0, i) + Character.toUpperCase(str.charAt(i)) + str.substring(i + 1, str.length()));
        }
        return list.toArray(new String[0]);
    }

    public static void main(String[] args) {
//        System.out.println(Arrays.toString(wave("")));
//        System.out.println(Arrays.toString(wave("hello")));
        wave("hello");
    }
}
