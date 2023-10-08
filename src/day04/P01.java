package day04;

import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {
          /*
        1- Kullanıcnın EYT li olup olmadığını tespit eden ve emekli olup olamayacağını yazdırın.
           Olamıyorsa kaç prim günü eksiği olduğunu yazdırın
           KURALLAR
             : 1999 yılı 9. ay öncesi işe başlamış olmak
             : Kadınlar: 5000 prim günü, 20 yıl hizmet süresi.
             : Erkekler: 5500 prim günü, 25 yıl hizmet süresi.

           */
        Scanner scanner=new Scanner (System.in);
        System.out.println ("cinsiyet");
        char cinsiyet= scanner.next ().toUpperCase ().charAt (0);
        System.out.println ("pirimsayisi");
        int prim= scanner.nextInt ();
        System.out.println ("hizmet yili");
        int hizmetyili= scanner.nextInt ();
        System.out.println ("giris yili");
        int giris= scanner.nextInt ();
        if (giris>1999.09){
            System.out.println ("eyt olamazsiniz");
        }else {
            System.out.println ("eyt lisiniz");
        }
        if (cinsiyet=='k'){
            if (prim<5000 && hizmetyili<20){
                System.out.println ("eyt olamazsiniz,eyt olabilmeniz icin"+(5000-prim)+"e ihtiyac var");
            }else if (prim<5000 && hizmetyili>20){
                System.out.println ("eyt icin"+(5000-prim)+"e ihtiyaciniz var");
            }else if (prim>=5000 && hizmetyili<20){
                System.out.println ("eyt icin"+(20-hizmetyili)+"e ihtiyaciniz var");
            }else {
                System.out.println ("sartlari saglamiyorsunuz");
            }
        }
        if (cinsiyet=='e'){
            if (prim<5500 && hizmetyili<25){
                System.out.println ("eyt olamazsiniz,eyt olabilmeniz icin"+(5500-prim)+"e ihtiyac var");
            }else if (prim<5500 && hizmetyili>25){
                System.out.println ("eyt icin"+(5500-prim)+"e ihtiyaciniz var");
            }else if (prim>=5500 && hizmetyili<25){
                System.out.println ("eyt icin"+(25-hizmetyili)+"e ihtiyaciniz var");
            }else {
                System.out.println ("sartlari saglamiyorsunuz");
            }
        }
            }
        }








