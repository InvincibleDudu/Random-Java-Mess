package codewars.six;

/**
 * Created by InvincibleDudu on 09/28/2020 at 17:13
 */
public class Backspaces {

    public static String cleanString(String s) {
        // your code here
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#') {
                if (i == 0) {
                    if (s.length() == 1)
                        return "";
                    s = s.substring(1);
                } else
                    s = s.substring(0, i - 1) + s.substring(i + 1);
                i = -1;
            }
        }
        return s;
    }

    public static void main(String[] args) {
//        System.out.println(cleanString("abc#d##c"));// -> abd##c -> ab#c -> ac
//        System.out.println(cleanString("abc####d##c#"));
//        System.out.println(cleanString("#########"));
//        System.out.println(cleanString("#AAA"));
//        System.out.println(cleanString("##AAA"));
//        System.out.println(cleanString("######AAA"));
//        System.out.println(cleanString("######AAA###"));
//        System.out.println(cleanString("AAA###"));
        System.out.println(cleanString("AAA####"));
//        System.out.println(cleanString("AAA#####"));
//        System.out.println(cleanString("AAA#######"));
//        System.out.println(cleanString("###AAA#######"));
//        System.out.println(cleanString("###A245245AA#######"));
    }

}
