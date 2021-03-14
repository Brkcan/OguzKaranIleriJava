package org.csystem.StringBuilderReverse;

public class Util {
    public static StringBuilder reverse (String s1)
    {
        StringBuilder builder = new StringBuilder();
        for(int i = s1.length() - 1; i >= 0; i--){
            builder.append(s1.charAt(i));
        }
        return builder;
    }

    public static String reverseString (String s1)
    {
        String s2 = "";

        for (int i = s1.length() - 1; i >= 0; i--){
            s2 += s1.charAt(i);
        }
        return s2;
    }

    public static StringBuilder reverseStringBuilder (String s1)
    {
        StringBuilder builder = new StringBuilder(s1);
        builder.reverse();

        return builder;
    }


    public static void main(String[] args) {
        String s1 = "ankara";
        System.out.println(Util.reverse(s1));
        System.out.println(Util.reverseString(s1));
        System.out.println(Util.reverseStringBuilder(s1));
    }
}
