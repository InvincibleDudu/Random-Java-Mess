package codewars;


/**
 * Created by InvincibleDudu on 09/09/2020 at 15:58
 *
 *
 * 6038ms
 */
public class Scramblies {

    public static boolean scramble(String str1, String str2) {
        // your code
//        Stack<Character> s1 = new Stack<>();
//        Stack<Character> s2 = new Stack<>();
//        var arr1 = str1.toCharArray();
//        var arr2 = str2.toCharArray();
        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    str2 = str2.replaceFirst(String.valueOf(str2.charAt(j)), "");
                    break;
                }
            }
        }

//        if (str2.length() > str1.length()) return false;
//        for (String s: str2.split("")) {
//            if (!str1.contains(s))  return false;
//            str1 = str1.replaceFirst(s,"");
//        }
//
//        return true;
        return str2.equals("");
//        for (char c : arr1) {
//            s1.push(c);
//
//        }
//        for (char c : arr2) {
//            s2.push(c);
//        }
    }

    public static void main(String[] args) {
        System.out.println(scramble("rkqodlw", "world"));
        System.out.println(scramble("cedewaraaossoqqyt", "codewars"));
        System.out.println(scramble("katas", "steak"));
        System.out.println(scramble("scriptjavx","javascript"));
        System.out.println(scramble("javscripts","javascript"));
        System.out.println(scramble("commas","commas"));
    }
}
