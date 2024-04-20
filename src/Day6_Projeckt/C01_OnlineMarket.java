package Day6_Projeckt;

import java.util.Scanner;

public class C01_OnlineMarket {
    static Scanner scan = new Scanner(System.in); // alttaki main methodta da gecerli olsun diye
    static boolean ekUrun = false;
    static int urunKodu;
    static String urunAd;
    static int urunFiyat;
    static int urunAdedi;
    static int toplam;
    static String sepet ="\n ";




    /*
====================PROJEMIZ===================================
ilk programa girildiginde bizi bir menu karsilasin bu secenekler
1 ŞARKÜTERİ ÜRÜNLERİ
2 MANAV ÜRÜNLERİ
3 MARKET ÜRÜNLERİ
secime göre;
4-urunleri listele ve
5-fiyatlari gelsin
6-Alışveriş bitince fiş yazdırsın.
7- Fiş yazdırdıktan sonra da çıkış yapılsın.
*/
    public static void main(String[] args) {

        girisEkrani();
    }


    public static void girisEkrani() {


            System.out.println(" ---T141 WISE MARKET-----");
            System.out.println("hosgeldiniz");
            System.out.println("lütfen alisveris yapacaginiz reyonu secin ");
            System.out.println(" \t1-Sarküteri reyonu\n\t2-Manav\n\t3-Market\n\t4-Fis yazdirma\n\t5-Cikis");
            int secim = scan.nextInt();

            if (!(secim >= 1 && secim <= 5)) {
                System.out.println(" gecersiz menü");



            } else {
                switch (secim) {
                    case 1:
                        sarkuteri();
                        break;
                    case 2:
                        Manav();
                        break;
                    case 3:
                        Market();
                        break;
                    case 4:
                        FisYazdir();
                        break;
                    case 5:
                        Cikis();
                        break;
                    default:

                }
            }


    }



    private static void Cikis() {
        System.out.println(" cikis yapiliyor");
        System.exit(0);
    }


    private static void FisYazdir() {
        System.out.println(" fisiniz yazdiriliyor");
    }

    private static void Market() {
        System.out.println(" ----Market Reyonuna hosgeldiniz----");
        System.out.println("lütfen almak istediginiz ürünün kodunu girin");
        System.out.println();
    }

    private static void Manav() {
        System.out.println(" ----Manav Reyonuna hosgeldiniz----");
        System.out.println(" lütfen almak istediginz ürününün kodunu girin ");

        System.out.println("\t201-Elma 40tl \n\t202-Portakal 40tl \t\n203-Salatalik 30 tl \t\n204-Domates " +
                "35 tl\t\n205-Muz" + "70 tl");


        while (!ekUrun) { // ek urunu false ile tanimlamistik burda ek urun almak istiyorsa while calisacak
            System.out.println("ürün kod: ");

            urunKodu = scan.nextInt();

            if (urunKodu == 0) {
                girisEkrani();

            } else if (!(urunKodu >= 201 && urunKodu <= 205)) {
                System.out.println(" gecerli kod girin");


            }else if( urunKodu>=201 && urunKodu <=205){

               switch (urunKodu){
                   case 201:
                       urunAd="elma";
                   urunFiyat=40;
                       System.out.println(urunAdedi+" kg Elma"+ urunFiyat*urunAdedi+" tl dir");
                       break;
                   case 202:
                       urunAd="portakal";
                   urunFiyat=40;
                       System.out.println(urunAdedi+" kg portakal"+urunFiyat*urunAdedi+" tl dir.");
                       break;
                   case 203:
                       urunAd="salatalik";
                       urunFiyat=30;
                       System.out.println(urunAdedi+" kg salatalik "+urunAdedi*urunFiyat+"tl dir");
                       break;
                   case 204:
                       urunAd="domates";
                       urunFiyat=35;
                       System.out.println(urunAdedi+" kg domates"+urunFiyat*urunAdedi+" tl dir");
                       break;
                   case 205:
                       urunAd="muz";
                       urunFiyat=70;
                       System.out.println(urunAdedi+" kg muz "+urunFiyat*urunAdedi+" tl dir");
                       break;


               }
               toplam=urunFiyat*urunKodu;
               toplam+=urunFiyat;
                System.out.println("ödemediniz gerek tutar : "+toplam);
                sepet+=urunAdedi+"kg "+urunAd+urunFiyat*urunAdedi+" tl dir";
                System.out.println("baska bir ürün girmek icin ürün kodu girin. istemiyorsaniz \n" +
                        "ana menü icin 0'a basin");










            }
        }


    }
    private static void sarkuteri() {
        System.out.println("---- Şarküteri Reyonuna Hoşgeldiniz ----");
        System.out.println("Lütfen almak istediğiniz ürünü seçiniz");
        System.out.println("\t101-Peynir   250₺\n\t102-Tereyağ   500₺\n\t103-Yoğurt   30₺\n\t104-Sucuk   " +
                "320₺\n\t105-Yumurta   95₺");
        while(!ekUrun){
            System.out.print("Ürün Kodu: ");
            urunKodu= scan.nextInt();
            if(!(urunKodu>=101 && urunKodu<=105)){
                System.out.println("Yanlış bir kod girdiniz. Tekrar Deneyiniz");

                sarkuteri();

            }else if(urunKodu>=101 && urunKodu<=105) {
                System.out.print("Kaç Paket alacaksınız?: ");
                urunAdedi=scan.nextInt();

                switch (urunKodu){
                    case 101:
                        urunAd="Peynir";
                        urunFiyat=250;
                        System.out.println(urunAdedi+" Paket "+urunAd+" fiyatı: "+(urunAdedi*urunFiyat)+"'TL'dir");
                        break;
                    case 102:
                        urunAd="Tereayağ";
                        urunFiyat=500;
                        System.out.println(urunAdedi+" Paket "+urunAd+" fiyatı: "+(urunAdedi*urunFiyat)+"'TL'dir");
                        break;
                    case 103:
                        urunAd="Yoğurt";
                        urunFiyat=30;
                        System.out.println(urunAdedi+" Paket "+urunAd+" fiyatı: "+(urunAdedi*urunFiyat)+"'TL'dir");
                        break;
                    case 104:
                        urunAd="Sucuk";
                        urunFiyat=320;
                        System.out.println(urunAdedi+" Paket "+urunAd+" fiyatı: "+(urunAdedi*urunFiyat)+"'TL'dir");
                        break;
                    case 105:
                        urunAd="Yumurta";
                        urunFiyat=95;
                        System.out.println(urunAdedi+" Paket "+urunAd+" fiyatı: "+(urunAdedi*urunFiyat)+"'TL'dir");
                        break;




                }
                urunFiyat=urunAdedi*urunFiyat;
                toplam+=urunFiyat;
                System.out.println("olusan tutar : "+ toplam);
                sepet+=urunAd+" paket"+ urunAdedi+"fiyati :"+ urunFiyat+"tl dir\n";
                System.out.println("baska bir ürün girmek icin ürün kodu girin. istemiyorsaniz " +
                        "ana menü icin 0'a basin");

            }


        }

    }
    //ekUrun=false;

}