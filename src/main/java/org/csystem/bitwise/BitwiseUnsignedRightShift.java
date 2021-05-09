package org.csystem.bitwise;

import java.util.Scanner;

/*
    Bu operator isaretsiz kaydirma yapiyor

*/

public class BitwiseUnsignedRightShift {
    public static void main(String[] args) {
        BitwiseUnsignedRightShiftTest.run();
    }
}

class BitwiseUnsignedRightShiftTest {

    static Scanner scanner = new Scanner(System.in);

    public static void run () {
        for (; ; ) {
            System.out.println("Bir sayi giriniz.../ : ");
            var val = scanner.nextInt();

            if (val == 0)
                return;

            var result = val >>> 1;

            BitwiseUtil.writeBits(val);
            System.out.println("val -> " + val);

            System.out.println("result -> " + result);
            BitwiseUtil.writeBits(result);

        }
    }
}
