package Day5_MethodCreation;

import java.util.Scanner;

public class C05_UsAlmA {




    public static void main(String[] args) {

        // Kullanicidan 2 sayi alaliniz.
        //1. sayi taban
        //2. sayi Ust
        //1 sayinin ussunu hesaplatan code create edinim.
        // 3, 3  sonuc = 27

        //2  3 = 2*2*2=8
        usAlma();


    }

    public static void usAlma (){

        Scanner scanner = new Scanner(System.in);
        System.out.println("birsayi girin");
        int sayi= scanner.nextInt();
        System.out.println("bir üs girin");
        int us= scanner.nextInt();

        // tekrar sayisini bilmediigmiz icin while ile yapariz

        // taban --> 5
        // us-->3 5*5*5 =125


        int AlinacakUs = us; // while döngüsünde azalarak bitmemesi icin baska bir var a atadik
        int sonuc= 1;

        while( AlinacakUs!=0){

            sonuc*=sayi;

            AlinacakUs--;

        }
        System.out.println("girdiginz sayinin karesi :"+sonuc);













    }











}
