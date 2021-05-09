package org.csystem.date.LocalAfterJavaEndModul;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class DateTimeLocalDate {
    public static void main(String[] args) {

        var birthDay = LocalDate.of(1992, Month.APRIL, 15);
        System.out.println(birthDay);

        // Sistemin tarih bilgisi elde edilir...
        var now  = LocalDate.now();
        System.out.println(now);


        System.out.println(now.isAfter(birthDay));


        // ChromeUnit Enum metodu.../

        var nows = LocalDate.now();
        var bigEarthquake = LocalDate.of(1999, Month.AUGUST, 17);

        System.out.println(ChronoUnit.DAYS.between(bigEarthquake, nows));


        var date = now.plusYears(9).plusMonths(2).plusDays(25);
        System.out.println(date);


    }
}
