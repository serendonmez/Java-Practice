package SundaysJavaPractice;

import java.util.Scanner;

public class ilkhafta3_AdSoyadAyirma {
    public static void main(String[] args) {
        // Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
// adinin ilk harfi buyuk digerleri kucuk,
// soyadinin tamami büyük harfle yazacak sekilde ad ayrı soyad ayrı sekilde alt alta ekrana yazdırınız.


        // sunstring  ile sadece index lerle ayirma yapybilriz,
        // boslugu bulma ya da belirli harfi bulmak icin


        Scanner scan= new Scanner(System.in);
        System.out.println(" isim soyisim girisi yapiniz");
        String isimSoyisim = scan.nextLine();
        String isim=isimSoyisim.substring(0,isimSoyisim.indexOf(" "));
       isim= isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase();

        String soyisim= isimSoyisim.substring(isimSoyisim.indexOf(" ")).toUpperCase();
        System.out.println(isim+soyisim);
    }

    }
