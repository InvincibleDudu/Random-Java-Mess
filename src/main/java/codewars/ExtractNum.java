package codewars;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.*;

/**
 * Created by InvincibleDudu on 01/26/2021 at 10:54
 */

public class ExtractNum {

    public static void main(String[] args) {
        System.out.println(extract(1));
        System.out.println(extract(12345));
        System.out.println(extract(1234567));
        System.out.println(extract(700000));
        System.out.println(extract(7));
    }

    public static List<?> extract(int n) {
        var digit = 1;
        var num = n;
        while (n / 10 > 0) {
            digit++;
            n = n / 10;
        }
//        System.out.println(digit);
        var list = new ArrayList<Integer>();
        for (var i = digit; i > 0; i--) {
            if (i != digit)
                list.add((int) (num % pow(10, i) / pow(10, i - 1)));
            else
                list.add((int) (num / pow(10, digit - 1)));
        }
        return list;
    }
}
