package Day5_MethodCreation;

import java.util.Scanner;

public class C04indexiTekSayi {



    // indexi tek sayi olan karakterleri yazdiran bir code create ediniz

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("lütfen bir kelime girin");
        String kelime = scan.nextLine();

        int sayac=0;

      while(sayac<=kelime.length()-1){
          if (sayac%2==1){
              System.out.println(sayac+". indexteki harf:"+kelime.charAt(sayac));
          }
          sayac++;
      }




    }






    }

