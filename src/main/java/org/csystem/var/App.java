package org.csystem.var;

import java.util.Scanner;

/*
*    var anahtar sozcugu java'ya 10 sonrasi geldi
*    Sadece fonksiyonlarin icinde kullanabiliriz.
*
* */

public class App {

    public static void main(String[] args)
    {
        varEx_1();
        varEx_2();
        varEx_3();
        varEx_4();
        varEx_5();
        varEx_6();
        varEx_7();
    }

    public static void varEx_1 ()
    {
        int var;

        var a = 10;
        System.out.println(a);
    }

    public static void varEx_2 ()
    {
        var a = "Burak";
        System.out.println(a);
    }

    public static void varEx_3 ()
    {
        /*
        *  Ilk deger verilmesi lazim, error olusmamasi icin.../
         * */

        // var s;
    }

    public static void varEx_4 ()
    {
        // Dinamik tur degisken atamasi yapilamaz, static tur degisken atamasi ile calisir (var)

        var a  = 10;

       //  a = 5.6; // error
    }

    public static void varEx_5 ()
    {
        var sb = new StringBuilder();
        sb.append("Ankara");
        sb.append("-");
        sb.append(1);
        System.out.println(sb);
    }

    public static void varEx_6 ()
    {

        // dongu icinde var keyword kelimesi kullanilabilir.../

        for (var i = 0; i < 10; i++)
            System.out.print(i);
        System.out.println();
    }

    public static void varEx_7 ()
    {
        System.out.println("Sayi Giriniz.../");
        Scanner kl = new Scanner(System.in);
        var a = kl.nextInt();
        var b = a > 10 ? 100 : "Ankara";
        System.out.println(b);
    }

}


