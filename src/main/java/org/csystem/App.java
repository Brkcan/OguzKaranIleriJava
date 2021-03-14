package org.csystem;

import org.csystem.util.NumberUtil;

public class App {

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            if (NumberUtil.isPrime(i))
                System.out.println(i);
        }
    }
}


