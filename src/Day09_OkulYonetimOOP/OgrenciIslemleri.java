package Day09_OkulYonetimOOP;

import java.util.*;

public class OgrenciIslemleri  implements  I_islemler {

//// neden extends Ogrenci degil ?
    /*
Seçilen Kişi türüne göre aşağıdaki işlemleri gösteren bir alt menü daha gösterilsin.
    ============= İŞLEMLER =============
         1-EKLEME
         2-ARAMA
         3-LİSTELEME
         4-SİLME
         5-ANA MENÜ
         Q-ÇIKIŞ

    SEÇİMİNİZ:
     */

    Scanner scanner = new Scanner(System.in);
    List<Ogrenci> ogrenciList= new ArrayList<>();


    int ogrNum=1000;
    void ogrenciIslemleri(){

        System.out.println("============Islemler=============\n\t1-Ekleme\n\t2-Arama\n\t3-Listeleme\n\t4-Silme" +
                "\n\t5-Anamenu \n\tQ-Cikis\n\n\nSeciminiz");

        char secim = scanner.next().toUpperCase().charAt(0);
        switch (secim){
            case '1' : ekleme(); break;
            case '2':arama();break;
            case '3':listeleme(); break;
            case '4':silme();break;
            case '5': AnaMenu.menu();
            case 'Q':cikis();break;
            default:System.out.println("Yanlis giris yaptiniz.");

        }
    }
    @Override
    public void ekleme() {

        System.out.println(" ==================================================");

        System.out.println("                   Yeni Ögrenci Bilgi Giris Ekrani                      ");
        System.out.println(" =======================================================================");
        scanner.nextLine();
        System.out.println(" ögrencinin adi : ");
        String ad = scanner.nextLine();
        System.out.println(" soyadi : ");
        String soyad= scanner.nextLine();
        System.out.println("ögrencinin TCKN sini giriniz : ");
        String tcNum = scanner.nextLine();
        System.out.println("yasi : ");
        int yas = scanner.nextInt();
        System.out.println(" sinifi : ");
        int sinif= scanner.nextInt();

        Ogrenci ogrenci = new Ogrenci(ad,soyad,tcNum,yas, ++ogrNum ,sinif);

        ogrenciList.add(ogrenci);
        System.out.println(" ogrenci ekleme islemi basariyla tamamlanmistir");
        listeleme();
        ogrenciIslemleri();



    }

    @Override
    public void arama() {

    scanner.nextLine();  // user a soracaksak nextLine yap
        System.out.println("Aranan TCKN: ");
        String tcNumber=scanner.next();

        for (Ogrenci each: ogrenciList){
            if (each.getTcNum().contains(tcNumber)) {
                System.out.println("Girdiginiz " + tcNumber + " TC numarali ogrenci sistemde kayitlidir");
                System.out.println(each.getAd()+" "+each.getSoyad());
//
            }else {
                System.out.println(tcNumber+" tc numarasi sistemde kayitli degil");
            }
        }

    }

    @Override
    public void listeleme() {
        for (Ogrenci each :ogrenciList){
            System.out.println(" sistemde kayitli kisi sayisi : \n");
            System.out.println(ogrenciList.size());
            System.out.println(" ögrenci listesi güncel hali : ");
            System.out.println(each);
        }
        ogrenciIslemleri();
    }

    @Override
    public void silme() {
        System.out.println(" silinecek TCKN : ");
        String tcNum= scanner.next();
        boolean flag = true;



       for (int i = 0; i < ogrenciList.size(); i++) {
           if (ogrenciList.get(i).getTcNum().equals(tcNum)){
               System.out.println(tcNum+" numarali ögrenci tüm bilgileriyle sistemden silinecektir \nsilme islemi " +
                       "icin emin misiniz");
               char eminMisin=scanner.next().toUpperCase().charAt(0);

               if (eminMisin=='E') {
                   ogrenciList.remove(i);
               }else {
                   ogrenciIslemleri();
               }

              flag = false;
               listeleme();
           }
           if (flag){
               System.out.println(" ogrenci listesinde "+tcNum+" ögrenci yoktur");
           }
       }

    }




    @Override
    public void cikis() {
        System.exit(0);
    }
}
