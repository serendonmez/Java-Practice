package SundaysJavaPractice;

import java.util.Scanner;

public class C34_KahveMakinasi {
    static     Scanner scan= new Scanner(System.in);

    public static void main(String[] args) {

        /*
    1. Basit bir Kahve makinesi oluşturun. 3 çeşit kahvemiz olsun.
    2. Sistem şu soruyu sorsun: "Hangi Kahveyi istersiniz?"
    3.Bu soru ile birlikte kullanıcı kahve bilgilerini görsün.
        Hangi Kahveyi İstersiniz?
        Türk kahvesi
        Filtre Kahve
        Espresso
   String hangiKahve oluşturun ve var olan kahvelerden birini yazınız.
  (örn: Türk Kahvesi,  ya da türk kahvesi.  --->  Büyük- küçük harf duyarlı olmaması için String methodu kullanın.)
       1.kosul
      Eğer kahve Türk kahvesi ise, konsola = Türk kahvesi hazırlanıyor. yazsın.
      Eğer filtre kahve ise,   konsola = Filtre kahve hazırlanıyor.  yazsın.
      Eğer Espresso ise, konsola =  Espresso hazırlanıyor...   yazsın.  (String hangiKahve'yi kullanın !)
      Eğer yanlış harf girerseniz, konsola = "Hatali giris yaptiniz, tekrar baslayiniz." yazsın.
      (Hatalı tuslamadan sonra kod calısmaya devam edecektir, o konuyu daha görmediniz bu yüzden bastan baslatın.)
     */



        System.out.println("Hangi Kahveyi istersiniz?");
        System.out.println("\t1-Türk Kahvesi \n\t2-Filtre Kahve \n\t3-Espresso ");
        int secim = scan.nextInt();
        
        switch (secim){
            case 1:
                turkKahvesi();
                sekerIsterMisin();
                break;
            case 2:
                filtreKahve();
                sekerIsterMisin();
                break;
            case 3:
                espresso();
                sekerIsterMisin();
                break;
            default:
                System.out.println(" yanlis kahve secimi yaptiniz");
                
        }
        
        





    }
    private static void sekerIsterMisin () {

        System.out.println(" Seker ister misiniz Evet icin : E hayir icin H ");
        char seker = scan.next().toUpperCase().charAt(0);
        if (seker== 'E'){
            System.out.println(" kahvenize eklemek istediginiz seker sayisini girin ");
            int sekerSayisi= scan.nextInt();
            System.out.println("kahvenize "+sekerSayisi+" adet seker eklenyior");
        }else {
            System.out.println(" sekersiz kahveniz hazirlaniyor");
        }




    }

    private static void espresso() {
        System.out.println("espressonuz hazirlaniyor");
    }

    private static void filtreKahve() {


        System.out.println( " süt eklemek ister misiniz ? evet icin : E Hayir icin : H isaretleyin");
        char sut = scan.next().toUpperCase().charAt(0);
        if (sut=='E'){
            System.out.println(" sütlü filtre kahveniz hazirlaniyior");
        }else {
            System.out.println(" sade filtre kahveniz hazirlaniyor");
        }

    }

    private static void turkKahvesi() {
        System.out.println(" türk kahveniz hazirlaniyor");
    }
}
