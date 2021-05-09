package org.csystem.binarynumbersystem;

public class DecimalConvert {
    public static void main(String[] args) {
        int a = 15;

        String hexStr = String.format("%X", a);
        String octStr = String.format("%o", a);

        System.out.println("hexDecimal : " + hexStr);
        System.out.println("OctDecimal : " + octStr);

    }
}
