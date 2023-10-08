package day04;

import java.util.Scanner;

public class P03 {
    public static void main(String[] args) {
        /*
ÖDEV SORUSU- 20230923- Kullanicidan gunu ismini girmesini isteyin,
 girilen gun hafta ici bir gun ise
"Simdi calisma zamani tatile .. gun var" seklinde hafta sonu tatiline kac
gun kaldigini yazdirin, girilen gun hafta sonu ise "Simdi dinlenme
zamani" yazdirin.
 */
        Scanner scanner=new Scanner (System.in);
        System.out.println ("lütfen bir gün ismi giriniz");
        String gun= scanner.nextLine ();
        switch (gun){
            case "pzt":
                System.out.println ("calisma zamani tatile 5 gun var");
                break;
            case "sali":
                System.out.println ("calisma zamani tatile 5 gun var");
                break;
                case "carsamba":
                System.out.println ("calisma zamani tatile 4 gun var");
                break;
                case "persembe":
                System.out.println ("calisma zamani tatile 3 gun var");
                break;
                case "cuma":
                System.out.println ("calisma zamani tatile 2 gun var");
                break;
                case "c.tesi":
                System.out.println ("h.sonu dinlenme zamani");
                break;
                case "pazar":
                System.out.println ("h.sonu dinlenme zamani");
                break;

        }
    }
}
