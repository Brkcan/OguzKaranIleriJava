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
}
