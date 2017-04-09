package com.company;

import java.io.Console;
import java.time.DayOfWeek;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            SimpleDateFormat ft = new SimpleDateFormat ("dd-MM-yyyy", Locale.ENGLISH);

            Calendar c = Calendar.getInstance();
            List<String> holidaysList = Arrays
                    .asList("01-01", "03-03", "05-01", "05-06", "05-24", "09-06", "09-22","11-01","12-24", "12-25", "12-26");

            Date startDate =  ft.parse(scan.nextLine());
            Date endDate =  ft.parse(scan.nextLine());

            int holidaysCount = 0;

            Calendar start = Calendar.getInstance();
            start.setTime(startDate);

            while (!start.getTime().after(endDate)) {
                if (isBusinessDay(start.getTime(), holidaysList))
                    holidaysCount++;
                start.add(Calendar.DAY_OF_MONTH, 1);
            }

            System.out.println(holidaysCount);

        }
        catch (ParseException pe) {
            pe.printStackTrace();
        }
    }

    private static boolean isBusinessDay(Date date, List<String> holidays) {
        Calendar calender = Calendar.getInstance();
        calender.setTime(date);
        SimpleDateFormat ft2 = new SimpleDateFormat ("MM-dd");
        String parsedDate = ft2.format(date);
        int dayOfWeek = calender.get(Calendar.DAY_OF_WEEK);

        if (holidays.contains(parsedDate))
            return false;
        if (dayOfWeek == Calendar.SATURDAY || dayOfWeek == Calendar.SUNDAY)
            return false;
        return true;
    }
}
