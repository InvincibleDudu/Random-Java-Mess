package test;

import java.util.Arrays;

/**
 * Created by InvincibleDudu on 01/12/2021 at 14:55
 */

public class TestSubstring {
    public static void main(String[] args) {
        var s = "asdfasf.mp3";
        System.out.println(s.substring(0, s.length() - 4));
        System.out.println(s.substring(4));
//        var strs = new String["a", "a"];
        var words = Arrays.asList("asdf", "qwer", "zxcv");
        var ss = words.toArray(new String[0]);
        System.out.println(stringArrayToSlashString(ss));

    }


    public static String stringArrayToSlashString(String[] strings) {
        var str = "";
        for (var s : strings) {
            str = str.concat(s + "/");
        }
        return str;
    }
}