package util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by InvincibleDudu on 09/28/2020 at 15:16
 */
public class DateUtil {
    public static String getCurrentTimeMill() {
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss.SSS");
        Date date = new Date(System.currentTimeMillis());
        return formatter.format(date);
    }
}
