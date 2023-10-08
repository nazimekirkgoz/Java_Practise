package day05;

public class P08 {
    public static void main(String[] args) {
        //verilen String'deki kullalanilan harfleri
// kelimeyi ve tekrarsiz halini yazdirip
// kelimede kullanilan farkli harf sayisini yazdırın


        String metin="Have a nice day!";
        metin=metin.replaceAll ("\\W","").substring (0,1);
      String tekrarsiz;
        System.out.println (metin);
        for (int i = 0; i < metin.length (); i++) {
            if (metin.contains (metin.substring (i,i+1))){


            }

        }

    }

}
