package org.csystem.recursion;

public class RecursionExample_2 {

    public static void main(String[] args) {
        Sample_2.foo(4);
    }
}


class Sample_2 {

    public static void foo (int n)
    {
        if (n == 0)
            return;

        System.out.println("Giris");

        foo(n - 1);

        System.out.println("Cikis");
    }
}
