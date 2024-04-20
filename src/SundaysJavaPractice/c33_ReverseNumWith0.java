package SundaysJavaPractice;
import java.util.Scanner;
public class c33_ReverseNumWith0 {
    public static void main(String[] args) {

         /*
    Soru: Kullanicidan bir tamsayi alip,
    sayinin tersini yazdiran bir method olusturunuz.
     */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir tamsayi giriniz");
        int sayi= scan.nextInt();
        String tersSayi=tersiniBul(sayi);
        System.out.println("Girdiginiz sayinin tersi:  "+tersiniBul(sayi));

    }


    static String tersiniBul(int sayi){
        String strSayi=Integer.toString(sayi);
        StringBuilder tersSayi= new StringBuilder();
        //sayinin tersini aliyoruz
        for (int i = strSayi.length()-1; i >=0 ; i--) {
            tersSayi.append(strSayi.charAt(i));
        }
        return tersSayi.toString();
    }

}
