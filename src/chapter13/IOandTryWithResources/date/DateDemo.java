package chapter13.IOandTryWithResources.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateDemo {

    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm");
        String format = simpleDateFormat.format(date);
        System.out.println(format);

        String stringDate = "01-01-2030 13:30";
        Date parse = null;
        try {
            parse = simpleDateFormat.parse(stringDate);
            System.out.println(parse);
        } catch (ParseException e) {
            System.out.println("wrong input");
        }

        assert parse != null;
        boolean after = parse.after(new Date());
        System.out.println(after);

    }
}
