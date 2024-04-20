package SundaysJavaPractice;

import java.util.Scanner;

public class ilkHafta1_YillikCaySekerHesapla {
    public static void main(String[] args) {
/*
     Kullaniciya
     * 1 = Gunde kac bardak cay ictigini,
     * 2 = Her bardak icin kac kup seker kullandigini sorup;
     kullanicinin yillik ve 40 yillik seker tuketimini kg bazinda consolda yazdiran bir program yazin.
     * Kullanici eger seker kullanmiyorsa "Aferin, boyle devam et :)" ciktisini gorsun.
      (1 kup seker = 2.77 gr)
*/

        Scanner scan=new Scanner(System.in);
        System.out.println(" günde kac bardak cay iciyorsunuz");
        double ictigiBardak= scan.nextDouble();
        System.out.println("her bardak icin kac küp seker kullaniyorsunuz");
        double sekermiktari= scan.nextDouble();

        if (sekermiktari!=0){
            System.out.println(" yillik kullandiginiz seker miktari :"+(2.77*sekermiktari*ictigiBardak*365)+"40 yilda :"
                    +(40*2.77*sekermiktari*ictigiBardak*365)+ " gr kadar seker tüketmis olacaksiniz");
        }else {
            System.out.println("Aferin, boyle devam et :");

        }












    }
}
