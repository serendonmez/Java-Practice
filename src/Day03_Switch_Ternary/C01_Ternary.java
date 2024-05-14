package Day03_Switch_Ternary;

import java.util.Scanner;

public class C01_Ternary {
    public static void main(String[] args) {
        //Kullanicidan bir sayi aliniz
    //Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
    //10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
    //Sayi o dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.

        Scanner scann= new Scanner(System.in);
        System.out.println("lütfne bir sayi giriniz");

       int sayi=scann.nextInt();
     //  if (sayi>=0){
     //      if (sayi<10){
     //          System.out.println("rakam");
     //      }else {
     //          System.out.println("Pozitif sayi");
     //      }
     //  }else {
     //      System.out.println("negatif sayi");
     //  }


        System.out.println(sayi>= 0 ? (sayi<10 ? "rakam": "pozitif sayi"):"negatif sayi ");


    }
}
