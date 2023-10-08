package day04;

import java.util.Scanner;

public class P02 {
    public static void main(String[] args) {
               /*
     2-Kullanicidan aldigi urun adedi ve ve liste fiyatini alin, kullaniciya musteri
    karti olup olmadigini sorun. Musteri karti varsa 10 urunden fazla alirsa
    %20, yoksa %15 indirim yapin, Musteri karti yoksa 10 urunden fazla
    alirsa %15, yoksa %10 indirim yapin
   */


    Scanner scan=new Scanner(System.in);
    System.out.print("Lütfen almak istediğiniz ürün adedini giriniz: ");
    int adet= scan.nextInt();
    System.out.print("Ürün Liste fiyatı: ");
    double fiyat= scan.nextDouble();

    System.out.println(" T127 Kart kullanıyor musunuz? E/H ");
    char kart=scan.next().charAt(0);

    if (kart=='E' || kart=='e'){
        if (adet>10){
            System.out.println("%20 Müşteri indirimli toplam tutar: "+((adet*fiyat)*(0.8)));
        }else{
            System.out.println("%15 Müşteri indirimli toplam tutar: "+((adet*fiyat)*(0.85)));
        }
    } else if (kart=='H'|| kart=='h') {
        if (adet>10){
            System.out.println("%15 Müşteri indirimli toplam tutar: "+((adet*fiyat)*(0.85)));
        }else{
            System.out.println("%10 Müşteri indirimli toplam tutar: "+((adet*fiyat)*(0.9)));
        }

    }

}
}
