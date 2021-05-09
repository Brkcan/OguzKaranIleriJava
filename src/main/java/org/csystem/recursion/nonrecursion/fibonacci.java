package org.csystem.recursion.nonrecursion;

public class fibonacci {

    public static void main(String[] args) {
        RunFibonacci.run(10);
    }
}

class RunFibonacci {

    public static void run (int j)
    {
        int[] list = new int[j];
        int sum = 0;
        list[0] = 0;
        list[1] = 1;

        for (int i = 2; i < list.length; i++)
        {
            sum = list[i - 1] + list[i - 2];
            list[i] = sum;
            list[i - 1] = list[i - 1];
            System.out.println(sum);
        }
    }
}
