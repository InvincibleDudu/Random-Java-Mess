package codewars.six;

/**
 * Created by InvincibleDudu on 10/09/2020 at 17:16
 * <p>
 * Completed at 10-09 17:28:23
 */
public class SpinWords {
    public static String spinWords(String sentence) {
        //TODO: Code stuff here
        var words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            String s = words[i];
            if (s.length() >= 5) {
                StringBuilder sb = new StringBuilder(s);
                words[i] = sb.reverse().toString();
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String s : words)
            sb.append(s).append(" ");
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(spinWords("Hey fellow warriors"));
    }
}
