package org.csystem.binarynumbersystem;

public class DecimalConvert_02 {

    public static void main(String[] args) {
        int a = 10;

        String hexStr = Integer.toHexString(a);
        String octStr = Integer.toOctalString(a);
        String binStr = Integer.toBinaryString(a);

        System.out.println("hexStr : " + hexStr);
        System.out.println("octStr : " + octStr);
        System.out.println("binStr : " + binStr);


    }
}
