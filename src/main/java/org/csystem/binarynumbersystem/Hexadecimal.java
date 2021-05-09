package org.csystem.binarynumbersystem;

public class Hexadecimal {

    public static void main(String[] args) {

        int x = 0x80000B00;
        int y = 0x00000B00;

        System.out.println("x : " + x);
        System.out.println("y : " + y);

        System.out.println(Integer.compare(x, y));
        System.out.println(Integer.compareUnsigned(x, y));
    }
}
