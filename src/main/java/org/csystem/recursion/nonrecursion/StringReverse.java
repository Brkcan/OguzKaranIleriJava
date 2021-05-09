package org.csystem.recursion.nonrecursion;

public class StringReverse {

    public static void main(String[] args) {
        System.out.println(Reverse.reverse("Ankara"));
    }
}


class Reverse {

    public static String reverse(String s)
    {
        String a = "";

        for (int i = s.length() - 1; i >= 0; --i)
            a += String.valueOf(s.charAt(i));

        return a;
    }
}
