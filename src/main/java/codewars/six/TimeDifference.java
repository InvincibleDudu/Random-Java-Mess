package codewars.six;

import java.util.Arrays;

/**
 * Created by InvincibleDudu on 10/09/2020 at 10:33
 * <p>
 * <p>
 * Completed at 10-09 11:38:10
 */
public class TimeDifference {

    public static String solve(String[] arr) {
        int[] minutesArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            minutesArray[i] = timeToMinutes(arr[i]);
        }
        Arrays.sort(minutesArray);
        System.out.println(Arrays.toString(minutesArray));
        for (int i = 0; i < arr.length; i++) {
            arr[i] = minutesToTime(minutesArray[i]);
        }
        System.out.println(Arrays.toString(arr));
        if (arr.length == 1)
            return "23:59";
        var maxDiff = 0;
        for (int i = 1; i < arr.length; i++) {
            if (calcTimeDifference(arr[i], arr[i - 1]) > maxDiff)
                maxDiff = calcTimeDifference(arr[i], arr[i - 1]);
        }
        if (calcTimeDifference(arr[0], arr[arr.length - 1]) > maxDiff)
            maxDiff = calcTimeDifference(arr[0], arr[arr.length - 1]);
        return minutesToTime(maxDiff);
    }

    public static int calcTimeDifference(String s1, String s2) {
        var ss1 = timeToMinutes(s1);
        var ss2 = timeToMinutes(s2);
        if (ss1 > ss2) {
            String temp = s1;
            s1 = s2;
            s2 = temp;
        }
        System.out.println(s1 + " with " + s2);
        if (Math.abs(timeToMinutes(s1) - timeToMinutes(s2)) - 1 < 720)
            return Math.abs(timeToMinutes(s1) - timeToMinutes(s2)) - 1;
        return timeToMinutes(s1) + (1440 - timeToMinutes(s2)) - 1;
    }

    public static int timeToMinutes(String s) {
        var ss = s.split(":");
        int hours = Integer.parseInt(ss[0]);
        int minutes = Integer.parseInt(ss[1]);
        return hours * 60 + minutes;
    }

    public static String minutesToTime(int s) {
        int hours = s / 60;
        int minutes = s % 60;
//        if (hours > 9 && minutes > 9)
//            return hours + ":" + minutes;
//        if (hours <= 9 && minutes > 9)
//            return "0" + hours + ":" + minutes;
//        if (hours > 9)
//            return hours + ":0" + minutes;
//        return "0" + hours + ":0" + minutes;
        return String.format("%02d:%02d", hours, minutes);
    }

    public static void main(String[] args) {
//        System.out.println(timeToMinutes("23:59"));
        System.out.println(minutesToTime(calcTimeDifference("21:14", "06:25")));
//        System.out.println();
        System.out.println(solve(new String[]{"21:14", "15:34", "14:51", "06:25", "15:30"}));
        System.out.println(solve(new String[]{"23:00", "04:22", "18:05", "06:24"}));
    }
}
