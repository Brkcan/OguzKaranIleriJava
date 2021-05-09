package org.csystem.bitwise;

import java.util.Arrays;

public class BitwiseUtil {

    private BitwiseUtil () {}

    public static void writeBits (int val)
    {
        var valBinInts = Integer.toBinaryString(val);

        char[] c = new char[32 - valBinInts.length()];

        Arrays.fill(c, '0');
        System.out.println(String.valueOf(c) + valBinInts);
    }

    public static void writeBits (long val)
    {
        var valBinInts = Long.toBinaryString(val);

        char[] c = new char[64 - valBinInts.length()];

        Arrays.fill(c, '0');
        System.out.println(String.valueOf(c) + valBinInts);
    }
}
