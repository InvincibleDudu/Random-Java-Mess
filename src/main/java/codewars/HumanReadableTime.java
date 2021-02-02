package codewars;

/**
 * Created by InvincibleDudu on 09/10/2020 at 15:41
 *
 * 5kyu
 * Write a function, which takes a non-negative integer (seconds) as input and
 * returns the time in a human-readable format (HH:MM:SS)
 *
 * HH = hours, padded to 2 digits, range: 00 - 99
 * MM = minutes, padded to 2 digits, range: 00 - 59
 * SS = seconds, padded to 2 digits, range: 00 - 59
 * The maximum time never exceeds 359999 (99:59:59)
 *
 * Well this was ez as well. 2020-09-10 16:01:20
 * Turned out I dont even have to write those if's,
 * And those 3 String.format could be combined like <code>%02d:%02d:%02d, h, m, s</code>
 */
public class HumanReadableTime {
    public static String makeReadable(int seconds) {
        // Do something
//        if (seconds < 10)
//            return "00:00:0" + seconds;
//        if (seconds < 60)
//            return "00:00:" + String.format("%02d", seconds);
//        else if (seconds < 3599)
//            return "00:" + String.format("%02d", seconds / 60) + ":" + String.format("%02d", seconds % 60);
//        else {
//            int hours = seconds / 3600;
//            int minutes = seconds % 3600 / 60;
//            int secs = seconds % 3600 % 60;
            return String.format("%02d", seconds / 3600) + ":" + String.format("%02d", seconds % 3600 / 60) + ":" + String.format("%02d", seconds % 3600 % 60);
        }
    }
//}
