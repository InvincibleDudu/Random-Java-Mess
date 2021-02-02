package codewars;

/**
 * Created by InvincibleDudu on 09/11/2020 at 16:23
 * <p>
 * 4kyu
 * <p>
 * Your task in order to complete this Kata is to write a function which formats a duration, given as a number of seconds, in a human-friendly way.
 * <p>
 * The function must accept a non-negative integer. If it is zero, it just returns "now". Otherwise, the duration is expressed as a combination of years, days, hours, minutes and seconds.
 * <p>
 * It is much easier to understand with an example:
 * <p>
 * TimeFormatter.formatDuration(62)   &nbsp  //returns "<code>1 minute and 2 seconds</code>"
 * <p>
 * TimeFormatter.formatDuration(3662) &nbsp//returns "<code>1 hour, 1 minute and 2 seconds</code>"
 * <p>
 * Completed at 09-14 15:35:53
 * My god this took me ages.
 */
public class HumanReadableTime2 {

    public static void main(String[] args) {
        System.out.println(formatDuration(41557600));
        System.out.println(formatDuration(31557600));
        System.out.println(formatDuration(15737833));
        System.out.println(formatDuration(15724833));
        System.out.println(formatDuration(3962));
        System.out.println(formatDuration(3960));
        System.out.println(formatDuration(3662));
        System.out.println(formatDuration(3660));
        System.out.println(formatDuration(3611));
        System.out.println(formatDuration(3600));
        System.out.println(formatDuration(120));
        System.out.println(formatDuration(62));
        System.out.println(formatDuration(61));
        System.out.println(formatDuration(3));
        System.out.println(formatDuration(1));
//        test(3999);
//        test(924825);
//        test(824859824);
//        String a = "a, b, c, d";
//        String b = ", a, b, c, d";
//        String c = "a, b, c, d, e, f";
//        String d = ", a, b, c, d, e, f, g, h";
//        replaceComma(a);
//        replaceComma(b);
//        replaceComma(c);
//        replaceComma(d);
//        System.out.println(checkPlural(1, "minute"));
//        System.out.println(checkPlural(3, "minute"));
//        System.out.println(checkPlural(5, "hour"));
//        a.indexOf(", ", 0);
//        while(a.indexof(a,index)!=-1){
//        }
//        String myStr = "Hello planet earth, you are a great planet.";
//        System.out.println(myStr.indexOf("planet"));
    }

    static String replaceComma(String a) {
        if (a.length() <= 10)
            return a;
        while (a.charAt(0) == ',')
            a = a.substring(2);
        for (int i = 0; i < a.length(); i++) {
            if (a.indexOf(", ", i) == -1) {
//                System.out.println("i: " + i);
                a = a.substring(0, i - 1) + " and " + a.substring(i + 1);
                return a;
            }
        }
        return a;
    }

    public static String checkPlural(int a, String s) {
        String comma = ", ";
        if (s.equals("second"))
            comma = "";
        if (a == 0)
            return "";
        else if (a == 1)
            return "1 " + s + comma;
        else
            return a + " " + s + "s" + comma;
    }
//    public static String checkEnding(String s) {
//        return s;
//    }

    public static String formatDuration(int seconds) {
        // your code goes here
//        if (seconds == 1)
//            return "1 second";
//        if (seconds < 60)
//            return seconds + " seconds";
//        if (seconds < 120)
//            return "1 minute and " + seconds + " seconds";
//        if (seconds < 3599)
//            return "00:" + String.format("%02d", seconds / 60) + ":" + String.format("%02d", seconds % 60);
//        else {
//        String result = "";
        if (seconds == 0)
            return "now";
        int years = seconds / 31557600;
        int days = seconds % 31557600 / 86400;
        int hours = seconds % 86400 / 3600;
        int minutes = seconds % 3600 / 60;
        int secs = seconds % 60;
        if ((years + 1) / 4 > 0)  //idky I need to plus one?
            days += (years + 1) / 4;
        String y = checkPlural(years, "year");
        String d = checkPlural(days, "day");
        String h = checkPlural(hours, "hour");
        String m = checkPlural(minutes, "minute");
        String s = checkPlural(secs, "second");
//        //seconds
//        if (secs == 0)
//            s = "";
//        else if (secs == 1 && (hours != 0 || minutes != 0 || days != 0))
//            s = " and 1 second";
//        else if (secs != 1 && (hours != 0 || minutes != 0 || days != 0))
//            s = " and " + secs + " seconds";
//        else if (secs == 1)
//            s = secs + " second";
//        else
//            s = secs + " seconds";
//        //minutes
//        if (minutes == 0)
//            m = "";
//        else if (minutes == 1 && hours != 0)
//            m = ", 1 minute";
//        else if (minutes == 1)
//            m = "1 minute";
//        else if (hours != 0)
//            m = ", " + minutes + " minutes";
//        else m = minutes + " minutes";
//        //hours
//        if (hours == 0)
//            h = "";
//        else if (hours == 1)
//            h = "1 hour";
//        else h = hours + " hours";
//        //days
//        if (days == 0)
//            d = "";
//        else if (days == 1)
//            d = "1 day,";
//        else
//            d = days + " days, ";
        //years
//        if
        return replaceComma((y + d + h + m + s).replaceFirst("and $|, $", "").trim());
    }

    public static void test(int a) {
        System.out.println("%2: " + a % 3600 % 60);
        System.out.println("%2: " + a % 60);
    }
}
