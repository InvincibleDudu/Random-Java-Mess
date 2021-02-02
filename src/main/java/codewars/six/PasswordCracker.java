package codewars.six;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by InvincibleDudu on 09/29/2020 at 14:54
 */
public class PasswordCracker {
    static List<String> list = new ArrayList<>();

    public static String passwordCracker(String hash) {
        char[] charset = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        String result = "error";
//        System.out.println(list.size());
//        System.out.println(list);
        for (String s : list) {
        if (encryptThisString(s).equals(hash))
            return s;
        }
        return result;
    }

    public static void main(String[] args) {
        generate("", 0, 1);
        generate("", 0, 2);
        generate("", 0, 3);
        generate("", 0, 4);
        System.out.println(passwordCracker("e6fb06210fafc02fd7479ddbed2d042cc3a5155e"));
        System.out.println(passwordCracker("a94a8fe5ccb19ba61c4c0873d391e987982fbbd3"));
        System.out.println(passwordCracker(encryptThisString("aa")));
//        System.out.println(encryptThisString("code"));
//        System.out.println(encryptThisString("c"));
//        StringBuilder s = new StringBuilder();
//        for (char c = 'a'; c <= 'z'; c++) {
//            s.append(c);
//        }
//        System.out.println(s);
//        for (int length = 1; length < 6; length++) // Change 5 with the length of charset
//            generate("", 0, length);
//        System.out.println(list);
//        System.out.println(list.size());
    }

    public static String encryptThisString(String input) {
        try {
            // getInstance() method is called with algorithm SHA-1
            MessageDigest md = MessageDigest.getInstance("SHA-1");
            // digest() method is called
            // to calculate message digest of the input string
            // returned as array of byte
            byte[] messageDigest = md.digest(input.getBytes());
            // Convert byte array into signum representation
            BigInteger no = new BigInteger(1, messageDigest);
            // Convert message digest into hex value
            StringBuilder hashtext = new StringBuilder(no.toString(16));
            // Add preceding 0s to make it 32 bit
            while (hashtext.length() < 32) {
                hashtext.insert(0, "0");
            }
            // return the HashText
            return hashtext.toString();
        }
        // For specifying wrong message digest algorithms
        catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    static String passwordGenerator() {
        char[] chars = new char[]{'a', 'a'};
        for (char c = 'a'; c <= 'z'; c++) {
            chars[1] = c;
        }
        return new String(chars);
    }

    public static void generate(String str, int pos, int length) {
        char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        if (length == 0) {
//            System.out.println(str);
            list.add(str);
        } else {
            for (int i = pos; i < chars.length; i++) {
                generate(str + chars[i], i, length - 1);
            }
        }
//        System.out.println(list.size());
    }
}
