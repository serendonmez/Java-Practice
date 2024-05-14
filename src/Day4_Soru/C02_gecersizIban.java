package Day4_Soru;

import java.util.Scanner;

public class C02_gecersizIban {
    public static void main(String[] args) {
        /*

            * Kullanıcıdan aldığınız  Adı, Soyadı ve kredi kartı numaralarını aşağıdaki gibi özel forma dönüştürün
            * Kredi kartı numarasını kontrol edin, yoksa 16 haneden küçük olursa   "Geçersiz kredi kartı numarası" yazdırın.
            * input : John White 1234234534561478
            output: Ad : J*** Soyad :W**** kartNo:***********1478 (Adın baş harfleri ve soyadı büyük olmalıdır)
*/
        Scanner scanner= new Scanner(System.in);
        System.out.println(" lütfen isim giriniz");
        String isim = scanner.nextLine();
        System.out.println("soy isminizi girin");
        String soyIsim = scanner.nextLine();
        System.out.println(" iban no girin");
        String iban = scanner.nextLine();


       // isim =isim.toUpperCase().charAt(0)+isim.replaceAll("\\w","*");
         isim= isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w","*");

        soyIsim=soyIsim.toUpperCase().charAt(0)+ soyIsim.replaceAll("\\w","*");
        System.out.println(isim+soyIsim);

        if (iban.length()!= 16){
            System.out.println(" gecersiz iban");
        } else {
            System.out.println((iban.substring(0,12).replaceAll("\\d","*")+(iban.substring(12))));
        }




    }
}
