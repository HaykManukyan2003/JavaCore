package books.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    private static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public static Date stringToDate(String stringDate) {
        try {
            return simpleDateFormat.parse(stringDate);
        } catch (ParseException e) {
            System.err.println(e.getMessage());
        }
        return null;
    }

    public static String dateToString(Date date) {
        return simpleDateFormat.format(date);
    }

}
