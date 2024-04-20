package Day01_;

import java.util.Scanner;

public class M03_ScannerClass {
    public static void main(String[] args) {



        // Dummy = next. nextLine problemi
        // next ten sonra ´ki satirlarda nextLine girilirse atlama problemi olusabilir
        // bunu engellemek icin next ten sonra scan.nextLine(); satiri yazilir.
        // daha sonra yazilan nextLine da sorun olusmaz


        /*
        1- Kullanıcıdan ad/soyad/yas/mail adresi/şifre bilgileirini alıp
        sisteme kaydedildiğini aşağıdaki formatta yazdırın.
         *****       KAYIT BAŞARILI      *****
        Adınız: Tarık
        Soyadınız: Yiğit
        Yaşınız:42
        Mail Adresiniz:tarik@yigit.com.tr
        Şifreniz: A2e365
        şeklinde sistemimize kaydınız başarıyla tamamlanmıştır.
         */

        Scanner scanner =new Scanner(System.in);
        System.out.print( " isim:");
        String isim = scanner.nextLine();

        System.out.print(" soyisim :");
        String soyisim = scanner.nextLine();

        System.out.print( "Mail:");
        String mail = scanner.next();

        scanner.nextLine() ;    // bosluk olusturma görevi

        System.out.print("sifre:");
        String sifre= scanner.nextLine();

        System.out.print("yas :");
        int yas= scanner.nextInt(); /* String den farkl idata türünde print yaparsak ya next le devam ederiz;
        ya da nextLine kullanacaksak öncesinde scanner.nextLine(); yazariz */






      // scanner.nextLine() ;




        System.out.println(" \n********KAYIT BASARILI****"+
                " \nisim:"+ isim+
                "\nsoyisim :"+ soyisim+
                "\nyas"+ yas+
                "\nmail:"+ mail+
                "\nsifre :"+sifre+
                "\nseklinde sistemimize kaydniz basariyla tanimlanmistir"
        );



























    }
}
