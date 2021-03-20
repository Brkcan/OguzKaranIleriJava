package org.csystem.stringbuildergetchars;

import org.csystem.util.StringUtil;
import java.util.Random;

public class StringBuilderGetChars {

    public static void main(String[] args) {
        Random random = new Random();
        StringBuilder text = new StringBuilder(GetChars.getChars(random, 10, 10, 15));

        System.out.println(text);

        char[] c = new char[text.length()];
        text.getChars(2, 7, c, 0);

        for (char ch : c)
            System.out.print(ch);

        System.out.println();

        System.out.println(SinifCalismasi.squeeze());
        System.out.println(SinifCalismasi.squeeze_2());
    }
}

class GetChars {

    public static String getChars (Random r, int n, int minLength, int maxLength)
    {
        StringBuilder builder = new StringBuilder();

        while (n-- > 0){
            builder.append(StringUtil.getRandomTextTR(r, r.nextInt(maxLength - minLength) + minLength));
        }

        return builder.toString();
    }

}

class SinifCalismasi {

    public static String squeeze ()
    {
        StringBuilder stringBuilder = new StringBuilder();
        String s1 = "Ankara";
        String s2 = "Ardahan";

        for (int i=0; i < s1.length(); i++){
            char c = s1.charAt(i);

            if (s2.indexOf(c) == -1)
                stringBuilder.append(c);
        }

        return stringBuilder.toString();
    }

    public static String squeeze_2 ()
    {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder.append("Ankara");
        stringBuilder1.append("Ardahan");

        for (int i=0; i <= stringBuilder.length() - 1; i++) {
            for (int j=0; j <= stringBuilder1.length() - 1; j++){
                if (stringBuilder.charAt(i) == stringBuilder1.charAt(j)){
                    stringBuilder.deleteCharAt(i);
                    i = 0;
                }
            }

        }
        return stringBuilder.toString();
    }

}
