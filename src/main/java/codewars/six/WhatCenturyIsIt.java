package codewars.six;

/**
 * Created by InvincibleDudu on 10/09/2020 at 14:15
 * <p>
 * Return the century of the input year. The input will always be a 4 digit string, so there is no need for validation.
 * <p>
 * Examples
 * "1999" --> "20th"
 * "2011" --> "21st"
 * "2154" --> "22nd"
 * "2259" --> "23rd"
 * "1124" --> "12th"
 * "2000" --> "20th"
 * <p>
 * Completed at 10-09 14:31:25
 * <p>
 * Somehow 2000 is 20th century n wikipedia says its the strict usage?
 */
public class WhatCenturyIsIt {
    public static String whatCentury(int year) {
        // coding here
        if (year % 100 == 0)
            year--;
        return toOrdinal(year / 100 + 1);
    }

    public static String toOrdinal(int n) {
        if (n % 10 == 1 && n != 11)
            return n + "st";
        if (n % 10 == 2 && n != 12)
            return n + "nd";
        if (n % 10 == 3 && n != 13)
            return n + "rd";
        return n + "th";
    }

    public static void main(String[] args) {
//        System.out.println(toOrdinal(11));
//        System.out.println(toOrdinal(21));
//        System.out.println(toOrdinal(1));
//        System.out.println(toOrdinal(111));
//        System.out.println(toOrdinal(1112));
//        System.out.println(toOrdinal(1113));
        System.out.println(whatCentury(1999));
        System.out.println(whatCentury(1124));
        System.out.println(whatCentury(2000));

    }

}

/*
1st
2nd
3rd
4th
5th
...
11th
12th
13th
...
21st
22nd
22rd
...
 */