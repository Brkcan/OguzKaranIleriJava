package org.csystem.date.calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarDateApp {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.MONTH) + 1);
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println(calendar.get(Calendar.MINUTE));
        System.out.println(calendar.get(Calendar.SECOND));


        System.out.println("------------------------------------------");

        Calendar gr = new GregorianCalendar();

        System.out.println(gr.get(Calendar.DAY_OF_MONTH));
        System.out.println(gr.get(Calendar.MONTH) + 1);
        System.out.println(gr.get(Calendar.YEAR));
        System.out.println(gr.get(Calendar.HOUR_OF_DAY));
        System.out.println(gr.get(Calendar.MINUTE));
        System.out.println(gr.get(Calendar.SECOND));
    }
}
