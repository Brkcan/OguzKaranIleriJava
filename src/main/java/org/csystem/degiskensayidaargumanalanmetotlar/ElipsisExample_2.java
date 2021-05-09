package org.csystem.degiskensayidaargumanalanmetotlar;

/*
    Hangisi cagrilir.
    Guzel bir ornek onemli.../
    elipsis olmayan cagriliyor
 */

public class ElipsisExample_2 {
    public static void main(String[] args) {
        Sample.foo(10);
    }
}


class Sample {

    public static void foo (int x)
    {
        System.out.println("foo int x");
    }

    public static void foo (int... x)
    {
        System.out.println("foo int... x");
    }
}
