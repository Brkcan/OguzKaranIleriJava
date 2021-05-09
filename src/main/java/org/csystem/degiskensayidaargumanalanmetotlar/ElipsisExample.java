package org.csystem.degiskensayidaargumanalanmetotlar;

/*
      Degisken sayida arguman alan metotlara varargs methods denir.
      Elipsis parametresi ile yazilir.
      Elipsis parametresi acisindan bir dizi referansidir
*/

public class ElipsisExample {
    public static void main(String[] args) {
        int a[]  = {10, 20, 30};

        System.out.println(Util.sum(a));
        System.out.println(Util.sum_1(a));
        System.out.println(Util.sum_2(10 ,20, 30));

        int[] b = {1, 2, 3, 4, 5};
        int[] c = {1, 4, 4, 5,};
        int[] d = {5, 6, 7, 3};
        Util.sum_3(b, c, d);

        Util.display(10, 20, 30);
    }
}

class Util {
    public static int sum (int [] a)
    {
        var total = 0;

        for (var val : a)
            total += val;

        return total;
    }

    public static int sum_1 (int [] a)
    {
        var total = 0;

        for (var i=0; i < a.length; i++){
            total += a[i];
        }
        return total;
    }

    public static int sum_2 (int... a)
    {
        var total = 0;

        for (var val : a)
            total += val;

        return total;
    }

    public static void sum_3 (int[] ... a)
    {
        for (int i=0; i<a.length; i++){
            for (int j=0; j<a[i].length;j++)
                System.out.print(a[i][j]);
            System.out.println();
        }
    }

    public static void display (int... a)
    {
        for (var val : a)
            System.out.println(val);
    }

    // error
    /*public static void display_2 (int... a, int n)
    {
        for (var val : a)
            System.out.println(val);
    }*/


    // metot parametresinde elipsis son parametresi olmali
    public static void display_3 (int n, int... a)
    {
        for (var val : a)
            System.out.println(val);
    }


}
