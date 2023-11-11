package day08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P05 {
    public static void main(String[] args) {
        /*
        Soru-1:
        Kullanicidan istedigi kadar isim alip, Q’ya bastiginda girdigi isimleri bize
        liste olarak dondurecek bir method olusturun.


         */

        isimleriDondur();
    }

    private static void isimleriDondur() {



        ArrayList<String> isimler = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir isim girin, cikmak icin  q ya basin");
        String isim= scan.nextLine();
        while (!isim.equalsIgnoreCase("q")) {
            System.out.println("Lütfen bir isim girin, cikmak icin  q ya basin");
            isim = scan.nextLine();
            isimler.add(isim);

        }

        System.out.println(isimler);

            }

        }





