package org.csystem.bitwise.operatorler;

/*
    Java'da bir tamsayinin bitleri uzerinde islem yapan bir grup operator vardir.

    ~  -----> bitwise not

    Bu operator operandına iliskin ifadenin degeri olan tam sayinin bitleri uzerinde
    1'e tumleme yaparak bir deger elde eder.
 */

import org.csystem.bitwise.BitwiseUtil;

import java.util.Scanner;

public class BitwiseNot {
    public static void main(String[] args) {
        BitwiseNotTest.run();
    }
}


class BitwiseNotTest {
    static Scanner scanner = new Scanner(System.in);
    public static void run ()
    {
        for (;;) {
            System.out.println("Bir sayi giriniz.../ : ");
            var val = scanner.nextInt();

            if(val == 0)
                return;

            var result = ~val;
            BitwiseUtil.writeBits(val);
            System.out.println("val -> " + val);
            System.out.println("result -> " + result);
            BitwiseUtil.writeBits(result);

        }
    }
}
