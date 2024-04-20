package SundaysJavaPractice;
import java.util.Scanner;

public class C22_ReverseNumber {
    public static void main(String[] args) {

        /*
Soru: Kullanicidan, -sonu sifirdan farkli bir rakamla bitmek sartiyla- bir tamsayi alip,
sayinin tersini yazdiran bir method olusturunuz.
 */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir tamsayi giriniz");
        int sayi= scan.nextInt();
        System.out.println("Girdiginiz sayinin tersi:  "+tersinibul(sayi));
    }

    static int tersinibul(int sayi){
        int tersSayi=0;
        while (sayi!=0){
            int basamak=sayi%10;
            tersSayi=tersSayi*10+basamak;
            sayi=sayi/10;
        }
        return tersSayi;
    }
}
