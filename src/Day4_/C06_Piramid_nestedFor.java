package Day4_;

public class C06_Piramid_nestedFor {
    public static void main(String[] args) {
        /*
 Yıldızlar (*) ile piramit oluşturabileceğiniz bir kod yazınız.
        Sonuç böyle olmalıdır;


               *
              * *
             * * *
            * * * *
           * * * * *
            * * * *
             * * *
              * *
               *

           şeklini konsola yazdiriniz.


 */


      int cap= 5;

        for (int i = 1; i <=cap ; i++) {
            for (int j = 1; j <= cap-i ; j++) {
                System.out.print(" ");

            }
            for (int j =1 ; j <=i ; j++) {
                System.out.print("* ");


            }

            System.out.println();
            // ücgenin üst kismini yazdirdik

        }
      for (int i = cap-1; i >=1 ; i--) {
          for (int j = 1; j <=cap-i ; j++) {
              System.out.print(" ");

          }

          for (int j = 1; j <= i; j++) {
              System.out.print("* ");

          }
          System.out.println();


      }

















 //       int cap= 5;
//
//
 //       for (int i = 1; i <=cap ; i++) { // satirlari yazdiriyor Strukture belirlioruz
 //           for (int j = 1; j <=cap-i ; j++) {// satirdaki  boslugu
 //               System.out.print(" ");
//
 //           }
 //           for (int j = 1; j <=i ; j++) { // satirdaki *i yazdiriyor
 //               System.out.print("* ");
//
 //           }
 //           System.out.println(); // her satirdaki " " ve * i yazdiktan sonra asagi satira inmek icin
//
 //       }
 //       for (int i = cap-1; i>=1; i--) {
 //           for (int j = 1; j <=cap- i  ; j++) {
 //               System.out.print(" ");
//
 //           }
 //           for (int j = 1; j<=i; j++) {
 //               System.out.print("* ");
//
 //           }
 //           System.out.println();
//
//
 //       }
//












    }

}
