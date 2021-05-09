package org.csystem.bitwise;

import java.util.Scanner;

public class BitwiseLeftShift {
    public static void main(String[] args) {
        BitwiseLeftShiftTest.run();
    }
}


class BitwiseLeftShiftTest {
    static Scanner scanner = new Scanner(System.in);

    public static void run ()
    {
        for (;;) {
            System.out.println("Bir sayi giriniz.../ : ");
            var val = scanner.nextInt();

            if(val == 0)
                return;

            var result = val << 1;

            BitwiseUtil.writeBits(val);
            System.out.println("val -> " + val);

            System.out.println("result -> " + result);
            BitwiseUtil.writeBits(result);

        }
    }
}
