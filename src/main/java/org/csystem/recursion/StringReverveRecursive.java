package org.csystem.recursion;

public class StringReverveRecursive {

    public static void main(String[] args) {
        ReverseRecursive.reverse("Ankara");

    }
}

class ReverseRecursive {

    public static void reverse(String s)
    {
        reverse(s, -1);

    }

    public static void reverse(String s, int i)
    {
        i++;
        if (i == s.length())
            return;

        reverse(s , i);
        System.out.print(s.charAt(i));
    }
}
