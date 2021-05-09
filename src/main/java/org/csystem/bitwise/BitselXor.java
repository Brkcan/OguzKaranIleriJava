package org.csystem.bitwise;

/*
    x           y           x ^ y
    1           1             0
    1           0             1
    0           1             1
    0           0             0
*/

public class BitselXor {
    public static void main(String[] args) {
        var a = 10;
        var b = 11;

        System.out.print("b : ");
        BitwiseUtil.writeBits(b);

        BitwiseUtil.writeBits(a ^ b);

        System.out.print("a : ");
        BitwiseUtil.writeBits(a);

        String s = "Ankara";

        for (int i = 0; i < s.length(); i++)
            System.out.println(s.charAt(i) ^ 4);
    }
}

