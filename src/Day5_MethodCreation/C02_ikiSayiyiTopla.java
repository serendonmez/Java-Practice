package Day5_MethodCreation;

import java.util.Scanner;

public class C02_ikiSayiyiTopla {

    //Soru: Bir metod oluşturun ve bu metod iki sayı alıp bu sayıların toplamını döndürsün.

    /*
    Method tanımlarken
    access modifier returnType methodName(paramType param1, paramType param2)
     */


    public static double ikiSayyiyiTopla (int num1, double num2){




    double a= num1+num2;
    // return num1+num2


    return a;
}


    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen iki adet sayı giriniz ve enter tuşuna basınız");
        int sayi1= scan.nextInt();
        double sayi2= scan.nextDouble();
        System.out.println("giridigniz sayilarin top :"+ikiSayyiyiTopla(sayi1,sayi2));



    }



}
