package SundaysJavaPractice;

import java.util.Scanner;

public class C07hesapMakinasi {
    public static void main(String[] args) {
        /*
   Basit 4 işlem yapan bir hesap makinesi kodlayınız....
Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayanız.
Kullanicidan iki sayi girmesini isteyiniz.
Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirınız.
   */

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen ilk sayiyi girin");
        double sayi1= scan.nextDouble();
        System.out.println(" ikinci sayiyi girin");
        double sayi2= scan.nextDouble();

        System.out.println("Yapmak istediginiz islemle ilgili sembolü girin" +
                "\nToplama icin +" +
                "\nCikarma icin -" +
                "\nBölme icin /" +
                "\ncarpma icin * yaziniz");

        char islem=scan.next().charAt(0);
        double sonuc=0;

        switch (islem){
            case '+':
                sonuc=sayi1+sayi2;
                System.out.println(sonuc);
                break;
            case '-':
                sonuc=sayi1-sayi2;
                break;
            case '/':
                if (sayi1 ==0){
                    System.out.println(" islem sonucu 0");

                } else if (sayi2==0) {
                    System.out.println(sonuc+" tanimsizdir");

                }else {
                sonuc=sayi1/sayi1;
                    System.out.println(sonuc);
                    System.out.println(sonuc);
                }
                break;
            case '*':
                sonuc=sayi1*sayi2;
                System.out.println(sonuc);
                break;
            default:

        }


    }
}
