package org.csystem.bitwise;

/*
 Bitsel saga kaydirma islemi icin iki tane operator vardir: >> ve >>>
 Saga kaydirma bolme anlamina geliyor.

 Bu operator tasan bitler icin solda sayi negatifse 1(bir), pozitifse sifir(0)
 ile beslemeye devam eder.
*/

import java.util.Scanner;

public class BitwiseRightShift {
    public static void main(String[] args) {
        BitwiseRightShiftTest.run();
    }
}

class BitwiseRightShiftTest {
    static Scanner scanner = new Scanner(System.in);

    public static void run () {
        for (; ; ) {
            System.out.println("Bir sayi giriniz.../ : ");
            var val = scanner.nextInt();

            if (val == 0)
                return;

            var result = val >> 1;

            BitwiseUtil.writeBits(val);
            System.out.println("val -> " + val);

            System.out.println("result -> " + result);
            BitwiseUtil.writeBits(result);

        }
    }
}
