package day03_;

import java.util.Scanner;

public class P04 {
    public static void main(String[] args) {
       /* 1- Öğrenci notunu harf notuna dönüştüren bir kod yazınız
        85-100 -----> AA
        80-85 ------> BA
        75-80 ------> BB
        65-75 ------> CB
        50-65 ------> CC
        50 Altı ise  ------> FF


        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen sinav notunu giriniz");
        int not = scan.nextInt();

        if (not > 100 || not < 0) {
            System.out.println("dogru not girin");

        } else if (not >= 85) {
            System.out.println("AA");


        } else if (not >= 80) {
            System.out.println("BA");

        } else if (not >= 75) {
            System.out.println("BB");


        } else if (not >= 65) {
            System.out.println("CB");


        } else if (not >= 50) {
            System.out.println("CC");

        } else {
            System.out.println("FF");
        }


        */
        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen cinsiyetinizi girin, erkek 'E' ,kadin 'K'");
        char cinsiyet = scanner.next().toUpperCase().charAt(0);
        System.out.println("Lütfen yasinizi girin");
        int yas = scanner.nextInt();


        if (cinsiyet == 'K' && yas >= 60) {
            System.out.println("Emekli olabilirsiniz");
        } else if (cinsiyet=='K' && yas<60) {
            System.out.println("emekli olmaniza" + (60 - yas) + "yila ihtiyaciniz var");
        } if (cinsiyet == 'E' && yas >= 65) {
            System.out.println("Emekli olabilirsiniz");
        } else {
            System.out.println("emekli olmaniza" +" "+ (65 - yas)+" " + "yila ihtiyaciniz var");

        }



        }





        }




