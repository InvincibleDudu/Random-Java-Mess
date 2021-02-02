package codewars.six;

/**
 * Created by InvincibleDudu on 10/10/2020 at 10:22
 * <p>
 * Completed at 10-10 11:28:19
 * <p>
 * Was trying to be fancy and use xor n turned out to be not working...
 * Cuz I need to use 'n' to cancel out 's' and so forth..
 * <p>
 * So had to use brute force I guess.
 */
public class TenMinuteWalk {

    public static boolean isValid(char[] walk) {
        // Insert brilliant code here
        if (walk.length != 10)
            return false;
//        char c = 'w';
//        char d = 'e';
//        var res = (char) (c ^ d ^ 'w');
//        char xor = 0;
//        System.out.println("xor = " + (int) xor);
//        System.out.println(" = " + (int) ' ');
//        return xor != 'w' && xor != 's' && xor != 'n' && xor != 'e';
        int w = 0, e = 0, n = 0, s = 0;
        for (char aChar : walk) {
            switch (aChar) {
                case 'w' -> w++;
                case 's' -> s++;
                case 'n' -> n++;
                case 'e' -> e++;
            }
        }
//        System.out.println(w);
//        System.out.println(e);
//        System.out.println(n);
//        System.out.println(s);
        return n == s && w == e;
//        return true;
    }

    public static void main(String[] args) {
        System.out.println(isValid(new char[]{'n', 's', 'n', 's', 'n', 's', 'n', 's', 'n', 's'}));
        System.out.println(isValid(new char[]{'n', 'n', 'n', 's', 'n', 's', 'n', 's', 'n', 's'}));
//        char[] chars = new char[]{'n', 's', 'n', 's', 'n', 's', 'n', 's', 'n', 's'};
//        char[] chars = new char[]{'n', 's', 'n', 's', 'n', 's', 'n', 's'};
//        char xor = 0;
//        for (char c : chars)
//            xor ^= c;
//        xor = 'n' ^ 's' ^ 'n' ^ 's' ^ 'n' ^ 's' ^ 'n';
//        xor = 'n' ^ 'n' ^ 'n' ^ 's' ^ 'n' ^ 's' ^ 'n' ^ 's' ^ 'n' ^ 's';
//        xor = 'n' ^ 's' ^ 'n' ^ 's' ^ 'n' ^ 's' ^ 'n' ^ 's';
//        xor = 'n' ^ 's' ^ 'n' ^ 's' ^ 'n' ^ 's' ^ 'n' ^ 's' ^ 'n' ^ 's' ^ 'n';
//        System.out.println("length: " + chars.length + " char: " + xor + " int: " + (int) xor);
    }
}
