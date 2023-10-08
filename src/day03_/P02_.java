package day03_;

import java.util.Scanner;

public class P02_ {
    public static void main(String[] args) {
        /*
2- Kullanıcdan bir harf girmesini isteyiniz. O harften sonra gelen harfleri
    Girdiğiniz harf :
    Girdiğiniz harften sonraki  3 harf :
şeklinde yazdırın.
ipucu: char
 */

        Scanner wq=new Scanner(System.in);
        System.out.println("Lütfen bir harf girin");
        char harf=wq.next().charAt(0);
        System.out.println("girdiginiz harf:" +harf);
        System.out.println("girdiginiz harften sonraki 3 harf:");

    }
}
