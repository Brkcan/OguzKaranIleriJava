package org.csystem.recursion.nonrecursion;

public class Factorial {

    public static void main(String[] args) {
        long result = factorial(5);
        System.out.println(result);
    }

    public static long factorial (int n)
    {
        long result = 1;

        for(; n > 1; n--)
            result *= n;

        return result;
    }


}
