package day08;

import java.util.ArrayList;
import java.util.Scanner;

public class P06 {
    public static void main(String[] args) {
       /* Soru-2:
        Kullanicidan pozitif bir tamsayi alip, o tamsayiyi tam bolebilen tum pozitif
        tamsayilari bir liste olarak bize donduren bir method olusturun.
                */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayi girin");
        int girilenSayi= scan.nextInt();
        System.out.println(pozitiftamBolen(girilenSayi));

    }

    private static ArrayList<Integer> pozitiftamBolen(int sayi) {


        ArrayList<Integer> bolenler=new ArrayList<>();
        for (int i = 1; i <= sayi; i++) {
            if (sayi%i==0){
                bolenler.add(i);
            }

        }
        return  bolenler ;
    }


}
