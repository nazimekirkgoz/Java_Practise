package day05;

import java.util.Scanner;

public class P07 {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        System.out.println ("lütfen bir cümle girin");
        String cümle= scan.nextLine ();
        String tersmetin="";
        for (int i = cümle.length (); i >0; i--) {
            tersmetin +=cümle.substring (i-1,i);

        }
        cümle=tersmetin;
        System.out.println ("girilen metnin tersten yazilisi:"+cümle);
    }
}
