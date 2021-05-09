package org.csystem.recursion;

public class RecursionFactoriel {
    public static void main(String[] args) {

        long result = Sample_3.factorial(5);
        System.out.println(result);
    }
}


class Sample_3 {
    public static long factorial (int n)
    {
        long result = 1;
        if (n == 0)
            return result;

         result = factorial(n - 1) * n;

        return result;
    }
}
