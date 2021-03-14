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
    public static void main(String[] args) {
        String s1 = "ankara";
        //Util.reverse(s1);
        System.out.println(Util.reverse(s1));
    }
}
