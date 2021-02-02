package codewars.six;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Arrays;

/**
 * Created by InvincibleDudu on 09/25/2020 at 16:18
 * <p>
 * For a given string s find the character c (or C) with longest consecutive repetition and return:
 * <p>
 * Object[]{c, l};
 * where l (or L) is the length of the repetition.
 * <p>
 * If there are two or more characters with the same l return the first in order of appearance.
 * <p>
 * For empty string return:
 * <p>
 * Object[]{"", 0}
 * <p>
 * <p>
 * Completed 09-27 15:14:55
 * <p>
 * This took way longer than it should've. Almost gave up and then I realized I can
 * <p>
 * still use the code from LongestPalindrome...
 */
public class LongestRepetition {

    public static Object[] longestRepetition(String s) {
        int res = 0;
        String result = "";
//        for (int i = 1; i < s.length(); i++) {
//            if (s.charAt(i) == s.charAt(i - 1)) {
//                count++;
//                if (count == s.length())
//                    return new Object[]{Character.toString(s.charAt(i - 1)), count};
//                if (((i + 1 == s.length()) && count > res))
//                    return new Object[]{Character.toString(s.charAt(i - 1)), count - 1};
//            } else {
//                if (count > res) {
//                    res = count;
//                    result = Character.toString(s.charAt(i - 1));
//                }
//                if (count != 1)
//                    count = 2;
//            }
//        }
//        Stack<Character> stack = new Stack<>();
//        for (int i = 0; i < s.length() ; i++) {
//            stack.push(s.charAt(i));
//        }
//        for (char c: stack) {
//            if (stack.pop() == stack.pop())
//                count++;
//        }
//        if (count > res)
//            res = count;
        for (int i = 0; i < s.length(); i++) {
            for (int j = s.length(); j > i; j--) {
                StringBuilder sb = new StringBuilder(s.subSequence(i, j));
                if (sb.length() <= res) break; //KEY PART
                if (containsSameChar(sb.toString()).getB()) {
                    result = containsSameChar(sb.toString()).getS();
                    res = sb.length();
                    break;
                }
            }
        }
        return new Object[]{result, res};
    }

    public static Pair containsSameChar(String s) {
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1))
                count++;
        }
        if (count == s.length())
            return new Pair(s.substring(0, 1), true);
        else
            return new Pair("", false);

    }

    public static void main(String[] args) {
//        static int a = 3;
        System.out.println(Arrays.toString(longestRepetition("")));
        System.out.println(Arrays.toString(longestRepetition("aaaaa")));
        System.out.println(Arrays.toString(longestRepetition("啊啊啊啊啊啊")));
        System.out.println(Arrays.toString(longestRepetition("aaaaabb")));
        System.out.println(Arrays.toString(longestRepetition("bbbaaabaaaa")));
        System.out.println(Arrays.toString(longestRepetition("cbdeuuu900")));
        System.out.println(Arrays.toString(longestRepetition("abbbbb")));
        System.out.println(Arrays.toString(longestRepetition("aabb")));
//        System.out.println(containsSameChar("aaaaa"));
//        System.out.println(containsSameChar("gafsgsa"));
//        System.out.println(containsSameChar("啊啊啊啊啊"));
//        System.out.println(containsSameChar("joaf8a8"));
    }

}

@Data
@AllArgsConstructor
class Pair {
    String s;
    Boolean b;
}


