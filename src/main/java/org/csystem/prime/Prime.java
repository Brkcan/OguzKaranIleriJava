package org.csystem.prime;

import org.csystem.util.NumberUtil;

public class Prime {
    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            if (NumberUtil.isPrime(i))
                System.out.println(i);
        }
    }
}
