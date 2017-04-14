package Utils;

import java.util.Date;

public class DateUtil {
    public static Date getDateFromString(String date) throws IndexOutOfBoundsException {
        int year = Integer.parseInt(date.substring(0, 4)) - 1900;
        int month = Integer.parseInt(date.substring(5, 7)) - 1;
        int day = Integer.parseInt(date.substring(8, 10));
        int hour = Integer.parseInt(date.substring(11, 13));
        return new Date(year, month, day, hour, 0);
    }
}
