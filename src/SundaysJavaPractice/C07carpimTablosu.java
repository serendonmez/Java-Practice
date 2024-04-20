package SundaysJavaPractice;

import java.util.Scanner;

public class C07carpimTablosu {
    public static void main(String[] args) {


        /*
Kullanicinin girdigi sayiya kadar carpim
tablosunu olusturan bir program yazalim
    */

        // sout f (print f) bicimli yazmada kullaniliyor (carpim tablosu yazdirmak gibi
        // sout ( "%5d,i*j);

        Scanner scan= new Scanner(System.in);
        System.out.println(" bir sayi girin");
        int sayi= scan.nextInt();

        for (int i = 1; i <=sayi; i++) {

            for (int j = 1; j <=sayi ; j++) {
                System.out.printf("%5d",i*j);

            }
            System.out.println();


        }

    }
}
