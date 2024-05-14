package Day09_OkulYonetimOOP;

import java.util.Scanner;

public class AnaMenu {

    // 1- ÖĞRENCİ İŞLEMLERİ
    //        2- ÖĞRETMEN İŞLEMLERİ
    //        Q- ÇIKIŞ
    static void menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("=========================\n\tOgrenci ve Ogretmen Yonetim Paneli\n=================\n" +
                "\t\t1-Ogrenci Islemleri\n" +
                "\t\t2-Ogretmen islemleri\n" +
                "\t\tQ-Cikis\n\n\n\nSeciminizi yapiniz: ");

            char secim = scanner.nextLine().toLowerCase().charAt(0);

            switch (secim){
                case '1':
                    OgrenciIslemleri ogrenciIslemleri=new OgrenciIslemleri();
                    ogrenciIslemleri.ogrenciIslemleri();
                    // ogrentmen islemleri menüsüne gitsin

                    break;
                case '2':
                    OgretmenIslemleri ogretmenIslemleri=new OgretmenIslemleri();
                    ogretmenIslemleri.ogretmenIslemleri();
                    //OgretmenIslemleri ogretmenIslemleri = new OgretmenIslemleri();
                   // ogretmenIslemleri
                    // ogretmen islemleri menüsüne gitsin
                    break;
                case 'Q':
                    //sistemden cikis
                    System.exit(0);
                default:
            }

    }


}
