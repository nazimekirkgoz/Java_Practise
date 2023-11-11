package day08;

import java.util.ArrayList;
import java.util.Scanner;

public class P07 {
    public static void main(String[] args) {

            ArrayList<String> isimler = new ArrayList<String>();
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.print("Lütfen bir isim girin (çıkmak için 'q' tuşuna basın): ");
                String isim = scanner.nextLine();
                if (isim.equals("q")) {
                    break;
                }
                isimler.add(isim);
            }
            System.out.println("Girdiğiniz isimler: " + isimler);

    }
}
