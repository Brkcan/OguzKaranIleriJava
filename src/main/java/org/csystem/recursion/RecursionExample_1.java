package org.csystem.recursion;

/*
    StackOverflowError hatasi verir.

 */

public class RecursionExample_1 {

    public static void main(String[] args) {
        Sample.foo(10, 20);
    }
}


class Sample {

    public static void foo (int a, int b)
    {
        Sample.foo(a, b);
    }
}
