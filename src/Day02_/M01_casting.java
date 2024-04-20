package Day02_;

import java.util.Scanner;

public class M01_casting {
    public static void main(String[] args) {
        /*
3- Kullanıcıdan iki double sayı alın ve ilk sayıyı ikinci sayıa bölün ve
sonucu tam sayı yazdırın
ipucu: sorumluluk bende
 */


        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen ondalikli sayi giriniz");
        System.out.println("1. Sayi: ");
        double sayi1 =scan.nextDouble();
        System.out.println("2 Sayi :");
        double sayi2 = scan.nextDouble();
        System.out.println(" HEsaplama tamamlandi");
        System.out.println("Sonuc :" +(int)(sayi1 /sayi2));
















    }
}
