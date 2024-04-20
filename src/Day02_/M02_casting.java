package Day02_;

import java.util.Scanner;

public class M02_casting {
    public static void main(String[] args) {
       /* 2- Kullanıcdan bir harf girmesini isteyiniz. O harften sonra gelen harfleri
        Girdiğiniz harf :
        Girdiğiniz harften sonraki  3 harf :
        şeklinde yazdırın.
        ipucu: char */

        Scanner scan= new Scanner(System.in);
        System.out.println("harf girin");
        char harf= scan.next().charAt(0);
        System.out.println("Girdiginiz harf :" + harf);
        System.out.println("Girdiginiz harften sonraki 3 harf:"+(char)(harf+1)+" "+(char)(harf + 2)+ " "+(char)(harf+3));











    }
}
