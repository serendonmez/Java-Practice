package Map_KurabiyeDukkani;

import java.util.Scanner;

public class Giris extends islemler{
    Scanner scan= new Scanner(System.in);

    void menu(){

        Urun urun1=new Urun("Portakalli Kurabiye", 15.78);
        Urun urun2=new Urun("Elmali Kurabiye", 13.99);
        Urun urun3=new Urun("Vegan Kurabiye", 14.87);
        Urun urun4=new Urun("Kavala Kurabiye", 16.80);
        Urun urun5=new Urun("Damla sakizli Kurabiye", 16.20);
        Urun urun6=new Urun("Glutensiz Kurabiye", 15.90);

        urunler.put(100100,urun1);
        urunler.put(136479, urun2);
        urunler.put(100512, urun3);
        urunler.put(100987, urun4);
        urunler.put(100396,urun5);
        urunler.put(123600,urun6);

        System.out.println("******Kurabiye Dükkanina Hosgeldiniz******");
        System.out.println("------------------------------------------");
        System.out.println("yapmak istedigniz islem numarasini girin \n" +
                "Ürünleri görüntülemek icin 1\n" +
                "Alisverise devam etmek icin 2\n" +
                "Sepeti Görüntülemek icin 3\n" +
                "Cikis icin 4\n " +
                "tuslayiniz");
        int secim = scan.nextInt();

        switch(secim){
            case 1:



        }





    }
}
