package day05;

import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {
        /*
Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin
 */
        Scanner scan =new Scanner (System.in);
        System.out.println ("lütfen iki sayi girin");
        int sayi1= scan.nextInt ();
        System.out.println ("ikinci sayi girin");
        int sayi2=scan.nextInt ();
        int top=0;
        if (sayi1>sayi2){
            System.out.println ("sayi1 sayi2 den kucuk olamaz");
        }else

        for (int i = sayi1; i <=sayi2 ; i++) {
            top +=i;


        }
        System.out.println (top);
    }
}
