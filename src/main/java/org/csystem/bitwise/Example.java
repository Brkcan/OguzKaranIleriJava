package org.csystem.bitwise;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        ExampleTest.run();
    }
}

class ExampleTest {

    static Scanner scanner = new Scanner(System.in);
    public static void run ()
    {
        for (;;) {
            System.out.println("Bir sayi giriniz. : ");
            var val = scanner.nextInt();
            val = ~val;
            var result = val >>> 1;

            System.out.println(val);
            BitwiseUtil.writeBits(val);

            System.out.println("Degerin isaretsiz olan biti" + result);
            BitwiseUtil.writeBits(result);
        }
    }
}
