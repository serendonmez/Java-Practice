package SundaysJavaPractice;

import java.util.Scanner;

public class C01_MaxMinValue {
    public static void main(String[] args) {
        // Bir gün içinde alınan bir dizi sıcaklık göstergelerini giriniz.
        // "e" girildiğinde veri girişi sonlandırılsın.
        // Bu değerleri girdikten sonra, günün en sıcak ve soğuk değerlerini ekrana yazdırınız.

        Scanner scanner = new Scanner(System.in);

        System.out.println(" sicaklik degeri giriniz( veri girisini sonlandirmak icin \"e\" ye basin ");

        double maxSicaklik= Double.MIN_VALUE; // ilk deger sabitlyip digerleriyle kiyaslamak gibi 
        double minSicaklik =Double.MAX_VALUE;

    while (true) {
        String input = scanner.nextLine();

        if (input.equals("e")) {
            break;
        }


        double sicaklik = Double.parseDouble(input);
        if (sicaklik > maxSicaklik) {
            maxSicaklik = sicaklik;

        }

        if (sicaklik < minSicaklik) {
            minSicaklik = sicaklik;
        }

    }
        System.out.println("En sicak deger :"+maxSicaklik);
        System.out.println("En soguk deger :"+ minSicaklik);
















    }


}
