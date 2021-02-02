package codewars.six;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Arrays;

import static java.time.DayOfWeek.SUNDAY;
import static java.time.format.TextStyle.FULL;
import static java.util.Locale.US;
import static java.util.Locale.CHINA;

/**
 * Created by InvincibleDudu on 09/29/2020 at 14:14
 */
public class MostFrequentDays {

    public static String[] mostFrequentDays(int year) {
        LocalDate jan1 = LocalDate.of(year, 1, 1);
        System.out.println(jan1);
        DayOfWeek d1 = jan1.getDayOfWeek();
        DayOfWeek d2 = d1.plus(1);
        String d1s = d1.getDisplayName(FULL, US);
        System.out.println(d1s);
        String d2s = d2.getDisplayName(FULL, US);
        System.out.println(d2s);
        return jan1.isLeapYear() ? d1 == SUNDAY ? new String[]{d2s, d1s} : new String[]{d1s, d2s} : new String[]{d1s};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(mostFrequentDays(2020)));
    }
}
