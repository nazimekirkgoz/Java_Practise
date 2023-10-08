package Exercise;

import java.util.Scanner;

public class E4 {
    public static void main(String[] args) {
        /*
    Bir sayinin mükemmel olup olmadiğini bulan bir method yaziniz.
    Mükemmel sayi : bir sayinin kendisi hariç bölenlerinin toplamı, kendisine eşitse o sayi mükemmeldir.
    ORNEK:
    INPUT     : 6
    OUTPUT : 1,2,3
                  1+2+3 = 6 = 6 (Mükemmel)

                  mukemmel sayi kontrolu
                  1. kullanicidan sayi alalim
                  2. bir toplam degiskeni olusturuyoruz
                  3. sayinin bolenleri bul
                  4. bolenleri toplamla topla
                  5. sayiyla toplamin esitligini kontrol et

    */
        sayitoplami (6);

    }
    public static void sayitoplami(int sayi) {
        int toplam = 0;

        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam += i;
            }

        }
        if (toplam==sayi){
            System.out.println ("mükemmel sayi");
        }else {
            System.out.println ("mükemmel sayi degil");
        }


    }
}

