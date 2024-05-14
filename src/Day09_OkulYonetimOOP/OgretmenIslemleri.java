package Day09_OkulYonetimOOP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OgretmenIslemleri extends AnaMenu implements I_islemler{

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

    List <Ogretmen> ogretmenList= new ArrayList<>();




    void ogretmenIslemleri() {

        System.out.println(" ============Ogretmen Islemleri ==============\n\t1-Ekleme  \n\t2-Arama\n\t3-Listeleme" +
                "\n\t4-Silme \n\t5-Anamenu \n\tQ-Cikis \n\n\nSeciminiz : ");

        char secim= scanner.nextLine().toUpperCase().charAt(0);
      switch (secim ){

          case '1': ekleme(); break;
          case '2':arama(); break;
          case '3': listeleme(); break;
          case '4': silme();break;
          case '5': AnaMenu.menu();
          case 'Q': cikis();break;
          default:System.out.println(" lütfen gecerli bir secim yapiniz");
      }

    }

    @Override
    public void ekleme() {

        System.out.println(" eklemek istediginiz ögretmen ismini girin :");
        String ad= scanner.nextLine();
        System.out.println("ögrenmenin soyadi : ");
        String soyad = scanner.nextLine();
        System.out.println(" ögretmenin TCKN : ");
        String tcNum = scanner.nextLine();
        System.out.println("ögretmenin yasi : ");
        int yas = scanner.nextInt();
        scanner.nextLine();
        System.out.println(" ögretmenin bolümü");
        String bolum = scanner.nextLine();
        System.out.println(" eklemek istediginiz ogretmen sicil no yu giriniz ");
         int sicilNo= scanner.nextInt();


        scanner.nextLine();
        Ogretmen ogretmen = new Ogretmen(ad, soyad, tcNum, yas , bolum,sicilNo);
        ogretmenList.add(ogretmen);


        listeleme();

        ogretmenIslemleri();

    }

    @Override
    public void arama() {
        scanner.nextLine();
        System.out.println("Ögretmen Listesinde arama yapmak istediginiz ögretmen sicil noyu giriniz");
        int sicilNo = scanner.nextInt();
        scanner.nextLine();

        boolean flag= true;

        for (Ogretmen each : ogretmenList) {
            if (each.getSicilNo()== sicilNo ){
                System.out.println(sicilNo + " sicil no lu ögrenmen bilgileri : \n" + (each ));
                ogretmenIslemleri();
                flag= false;
            }

            if (flag) {

                    System.out.println(" sistemde " + sicilNo + " lu ögretmen bulunamadi");

            }
        }
    }


    @Override
    public void listeleme() {

        for ( Ogretmen each : ogretmenList   ) {


            System.out.println(each);
        }

        ogretmenIslemleri();

    }

    @Override
    public void silme() {

        System.out.println(" silmek istediginiz ögretmen kaydinin ögretmen sicil nosunu giriniz : ");

        int sicilNo= scanner.nextInt();

        boolean flag= true;

        for (int i = 0; i < ogretmenList.size(); i++) {
           if( ogretmenList.get(i).getSicilNo()== sicilNo){

               System.out.println(ogretmenList.get(i)+" kaydi silmek istediginizden emin misiniz ? E: Evet ");
               char eminMisin = scanner.next().toUpperCase().charAt(0);
               scanner.nextLine();
               if (eminMisin==  'E'){
                   ogretmenList.remove(i);
                   flag = false;
                   listeleme();
               }
                scanner.nextLine();
                if (flag){
                    System.out.println(sicilNo + " kaydi ögretmen listesinde bulunmadi.");
                }

           }
        }

        ogretmenIslemleri();
    }


    @Override
    public void cikis() {
        System.exit(0);

    }
}
