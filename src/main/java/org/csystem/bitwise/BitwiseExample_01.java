package org.csystem.bitwise;

import java.util.Arrays;
import java.util.Scanner;

public class BitwiseExample_01 {
    public static void main(String[] args) {
        WritesBitsIntsTest.run();
    }
}


class WritesBitsIntsTest {

    public static void run ()
    {
        for (;;){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Bir sayi giriniz.");
            var val = scanner.nextInt();
            Util.writeBits(val);
        }
    }
}

class Util {
    public static void writeBits (int val)
    {
        var valBinInts = Integer.toBinaryString(val);

        char[] c = new char[32 - valBinInts.length()];
        Arrays.fill(c, '0');

        System.out.println(String.valueOf(c) + valBinInts);
    }
}
