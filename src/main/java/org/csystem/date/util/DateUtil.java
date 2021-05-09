package org.csystem.date.util;

/*
    Java 1.0 ile eklenmis ama cok sorunlu oldugu icin Java'da kullanilmamasi gereken
    bir API'dir.
*/

import java.util.Date;

public class DateUtil {
    public static void main(String[] args) {

        Date now = new Date();
        System.out.println(now);
        System.out.println(now.getHours());

        long ms = now.getTime();

        System.out.println(ms);

        Date date = new Date(ms);
        System.out.println(date);
    }
}
