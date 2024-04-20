package Day6_Project;

import java.util.Scanner;

public class C02_ATM {

    /*
             ATM EKRANI VE ISLEMLER
        -Kullanicidan giriş için kart numarasi ve şifresini isteyin,
           eger herhangi birini yanlis girerse tekrar girmesini isteyin.
        -Kart numarasini boşluk ile girerse, eger numara doğruysa kabul edin.
        -Kart numarasi ve sifre dogrulanirsa kullanicinin yapabileceği işlemleri (Menu listesi) ekrana yazdirin.
        -Menu listesinde;
               Bakiye sorgulama, para yatirma, para çekme, para gönderme, sifre değiştirme ve cikis
               islemleri olacaktır.
        -Para çekme ve para gonderme işleminde mevcut bakiyeden buyuk para çekilemez ve gönderilemez.
        -Para gönderme işleminde istenen iban TR ile baslamali ve toplam 10 karakter olmali,
            eger iban bu kriterlere uygun değilse menü ekranina geri donmelidir.
       - Sifre değiştirme işlemini yapmadan önce mevcut şifreyi teyit etmelidir.
         */
    static Scanner scan=new Scanner(System.in);
    static String kartno="123456";
    static String sifre="1234";
    static double bakiye= 30000;
    public static void main(String[] args) {
        giris();
    }
    public static void giris() {
        System.out.println("****************WISEBANK'A HOSGELDINIZ*****************\n"+
                "Güvenliginiz icin Kart No ve sifrenizi baskalari ile paylasmayiniz\n"+
                "------------------------------------------------------------------");
        System.out.println("Kart numaranizi giriniz");
        String kkartno= scan.nextLine();
        System.out.println("Sifrenizi giriniz");
        String ksifre= scan.nextLine();
        kkartno=kkartno.replaceAll("\\s","");
        if (kkartno.equals(kartno)&&ksifre.equals(sifre)){
            menu();
        }else {
            System.out.println("Hatali giris yaptiniz, yeniden baslayiniz");
            giris();
        }
    }
    public static void menu() {
        //Bakiye sorgulama, para yatirma, para çekme, para gönderme, sifre değiştirme ve cikis
        System.out.println(" Yapmak istediginiz islemin numarasini giriniz\n"+
                "1. BAKIYE SORGULAMA\n "+
                "2. PARA YATIRMA\n "+
                "3. PARA CEKME\n "+
                "4. PARA GÖNDERME\n "+
                "5. SIFRE DEGISTIRME\n "+
                "6. CIKIS\n "+
                "secim:");
        int secim= scan.nextInt();
        switch (secim){
            case 1:{
                bakiyesorgulama();
                break;
            }
            case 2:{
                System.out.println("Yatirmak istediginiz miktari giriniz");
                double miktar=scan.nextDouble();
                parayatirma(miktar);
                break;
            }
            case 3:{
                System.out.println("Cekeceginiz miktari giriniz");
                double miktar=scan.nextDouble();
                paracekme(miktar);
                break;
            }
            case 4:{
                paragonderme();
            }
            case 5:{
                sifredegistirme();
            }
            case 6:{
                System.out.println("Bankamizi tercih ettiginiz icin tesekkür ederiz.");
                System.exit(0);
            } default:{
                System.out.println("Hatali giris yaptiniz, sistemde olmayan bir islem sectiniz, tekrar deneyiniz");
                menu();
            }
        }
    }
    public static void sifredegistirme() {
        scan.nextLine();
        System.out.println("Mevcut sifrenizi giriniz");
        String ksifre= scan.nextLine();
        if (ksifre.equals(sifre)){
            System.out.println("Yeni sifrenizi giriniz");
            String sifre= scan.nextLine();
            if (sifre.length()==4){
                sifre=sifre;
                System.out.println("Sifreniz güncellendi");
                menu();
            }else {
                System.out.println("Sifreniz sadece dört rakamdan olusmalidir");
                sifredegistirme();
            }
        }else {
            System.out.println("Girdiginiz sifre dogru degil");
            sifredegistirme();
        }
    }
    public static void paragonderme() {
        scan.nextLine();
        //String pattern="^TR\\d{8}$";
        //if (iban.startsWith("TR")&&iban.length()==10&& Pattern.matches(pattern,iban))
        System.out.println("IBAN no giriniz");
        String iban= scan.nextLine().toUpperCase().replaceAll("\\s","");
        if (iban.startsWith("TR")&&iban.length()==10){
            System.out.println("Miktari giriniz");
            double miktar= scan.nextDouble();
            if (miktar<=bakiye){
                bakiye-=miktar;
                bakiyesorgulama();
            }else {
                System.out.println("Bakiyeniz yetersiz, tekrar deneyiniz");
                menu();
            }
        }else {
            System.out.println("Gecerli bir IBAN no giriniz");
            paragonderme();
        }
    }
    public static void paracekme(double miktar) {
        if (miktar<=bakiye){
            bakiye-=miktar;
            bakiyesorgulama();
        }else {
            System.out.println("Bakiyeniz yetersiz, tekrar deneyiniz");
            paracekme(scan.nextDouble());
            //double yenimiktar= scan.nextDouble();
            //paracekme(yenimiktar);
        }
    }
    public static void parayatirma(double miktar) {
        bakiye+=miktar;
        bakiyesorgulama();
    }
    public static void bakiyesorgulama() {
        System.out.println("Bakiyeniz:  "+ bakiye);
        menu();
    }

}
