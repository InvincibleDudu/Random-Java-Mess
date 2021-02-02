package codewars;

/**
 * Created by InvincibleDudu on 09/11/2020 at 14:35
 * <p>
 * Find the length of the longest substring in the given string s that is the same in reverse.
 * <p>
 * As an example, if the input was “I like racecars that go fast”, the substring (racecar) length would be 7.
 * <p>
 * If the length of the input string is 0, the return value must be 0.
 * <p>
 * Example:
 * "a" -> 1
 * "aab" -> 2
 * "abcde" -> 1
 * "zzbaabcd" -> 4
 * "" -> 0
 * <p>
 * <p>
 * forfeited
 * 2020-09-11 15:44:09
 * Turned out its easier than I thought, I just need to check if the reverse String equals to the og String, no
 * fancy conversion needed.
 * The main point is I need to use 2 loops to shrink the substring step by step.
 */
public class LongestPalindrome {
    public static void main(String[] args) {
//        System.out.println(longestPalindrome("aa"));
//        System.out.println(longestPalindrome("aba"));
//        System.out.println(longestPalindrome("abba"));
//        System.out.println(longestPalindrome("racecar"));
        System.out.println(longestPalindrome("baablkj12345432133d"));
//        StringBuilder sb = new StringBuilder("abcdf");
//        System.out.println(sb.reverse());
//        int i = (int) Math.ceil(7.0 / 2.0);
//        System.out.println(i);
//        String sub = "12345678";
//        System.out.println(sub.subSequence(3, 5));
//        System.out.println(sub.substring(3, 5));
//        System.out.println(sub.substring(0, (int) Math.ceil(sub.length() / 2.0)));
//        sub = "1234567";
//        System.out.println(sub.substring(0, (int) Math.ceil(sub.length() / 2.0)));
    }

    public static int longestPalindrome(final String s) {
//        if (s.length() <= 1)
//            return s.length();
//        var result = 1;
//        for (int i = 0; i < s.length(); i++) {
////            String rev = String.valueOf(new StringBuilder(s.substring(i)).reverse());
////            for (int j = 0; j < s.length(); j++) {
////                if (rev.equals(s.substring(j)))
////                    return rev.length();
////            }
//            for (int j = s.length(); j > i; j--) {
//                StringBuilder sb = new StringBuilder(s.substring(i, j));
//                if (sb.toString().equals(sb.reverse().toString())) {
//                    System.out.println(sb.toString());
//                    result = sb.length();
//
//                }
//            }
//
//        }
//        return result; //your code here


        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = s.length(); j > i; j--) {
                StringBuilder sb = new StringBuilder(s.subSequence(i, j));
                if (sb.length() <= res) break; //KEY PART
                if (sb.toString().equals(sb.reverse().toString())) {
                    res = sb.length();
                    break;
                }
            }
        }
        return res;
    }
}
