package SundaysJavaPractice;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import static java.util.Collections.sort;

public class C02_MaxMinSicaklikArrayList {
    public static void main(String[] args) {

        // Bir gün içinde alınan bir dizi sıcaklık göstergelerini giriniz.
      // "100" girildiğinde veri girişi sonlandırılsın.
        // Bu değerleri girdikten sonra, günün en sıcak ve soğuk değerlerini ekrana yazdırınız.

        Scanner scan = new Scanner(System.in);
        ArrayList<Double> gununSicakliklari=new ArrayList<>();


       // int sonladirmasayisi=100;
        double girilenSicaklik=0;
        int sayac=0;



        do {
            System.out.println("Sicaklik degerlerini giriniz. (Veri girisini sonlandirmak icin 100 yaziniz)");
            girilenSicaklik=scan.nextDouble();

            if (girilenSicaklik!=100){
                gununSicakliklari.add(girilenSicaklik);
                sayac++;
            }
        }while (girilenSicaklik!=100);{
            System.out.println("Veri girisi sonlandirildi");
            System.out.println("--------------");
        }
         Collections.sort(gununSicakliklari);
        System.out.println("Gunun en dusuk sicaklik degeri: "+ gununSicakliklari.get(0));
        System.out.println("Girilen deger sayisi" +gununSicakliklari.size());
        System.out.println("Gunun en yuksek sicaklik degeri: "+gununSicakliklari.get(sayac-1));
    }





    }

