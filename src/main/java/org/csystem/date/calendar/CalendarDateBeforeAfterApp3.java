package org.csystem.date.calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarDateBeforeAfterApp3 {

    public static void main(String[] args) {
        var birthDay = new GregorianCalendar(1992, Calendar.APRIL, 15);
        var now  = new GregorianCalendar();

        var birthDate = new GregorianCalendar(now.get(Calendar.YEAR), birthDay.get(Calendar.MONTH), birthDay.get(Calendar.DAY_OF_MONTH));

        System.out.println(now.after(birthDate));
    }
}

