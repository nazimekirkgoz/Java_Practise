package day05;

import java.util.Scanner;

public class P04 {
    public static void main(String[] args) {
        /*
         * Girilen bir stringdeki a harfi sayısını bulunuz. ama c harfine gelirse
         * döngüden çıkılsın
         *
         * Bugün hava oldukca güzel.-> 2
         *
         *
         */
        Scanner scan=new Scanner (System.in);
        System.out.println ("lütfen bir cümle girin");
        String cümle= scan.nextLine ();
        int sayac=0;
        for (int i = 0; i < cümle.length (); i++) {
            if (cümle.toUpperCase ().charAt (i)=='A'){
                sayac++;
            }
            if (cümle.toUpperCase ().charAt (i)=='C'){
                break;
            }

        }
        System.out.println ("cümlenizde  "  + sayac + "  adet  a harfi vardir");
    }
}
