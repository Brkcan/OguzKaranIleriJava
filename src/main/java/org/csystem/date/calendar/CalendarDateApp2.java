package org.csystem.date.calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarDateApp2 {

    public static void main(String[] args) {
        var birthDay = new GregorianCalendar(1992, Calendar.APRIL, 15);
        var now = new GregorianCalendar();
        var sn = 1000.0 * 60 * 60 * 24 * 365;
        var date = Math.abs(now.getTimeInMillis() - birthDay.getTimeInMillis()) / (sn);

        System.out.println(date);
    }
}
