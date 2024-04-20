package SundaysJavaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class C06_Ternary {

    public static void main(String[] args) {

// kullanicidan üc sayi al,
// -tek mi cift mi olduklarini
// -en büyük sayiyi
// -en kücük sayiyi yazdir

        Scanner scanner = new Scanner(System.in);
        System.out.println(" 1 adet tam sayi giriniz");
        int sayi1= scanner.nextInt();
        System.out.println(" 1 adet tam sayi giriniz");
        int sayi2= scanner.nextInt();
        System.out.println(" 1 adet tam sayi giriniz");
        int sayi3= scanner.nextInt();


        List<Integer> sayilar= new ArrayList<>(Arrays.asList(sayi1,sayi2,sayi3));

        System.out.println(sayilar);

        for (int i = 0; i <sayilar.size() ; i++) {


            System.out.println(sayilar.get(i)<sayilar.get(i+1)?" en kücük sayi : " +sayilar.get(i):sayilar.get(i+1));



        }


        for (int i = 0; i < sayilar.size(); i++) {
            System.out.println(sayilar.get(i)>sayilar.get(i+1)?" en büyük sayi : " +sayilar.get(i):sayilar.get(i+1));

        }

        System.out.println(sayi1%2==0 ? "Ilk sayi cift sayidir" : "Ilk sayi tek sayidir");

        System.out.println(sayi2%2==0 ? "Ikinci sayi cift sayidir" : "Ikinci sayi tek sayidir");
        System.out.println(sayi3%2==0 ? "Ucuncu sayi cift sayidir" : "ucuncu sayi tek sayidir");



        if (sayi1<sayi2&&sayi1<sayi3){
            System.out.println("Ilk sayi olan "+sayi1+ " en kücüktür.");
        } else if (sayi2<sayi1&&sayi2<sayi3) {
            System.out.println("Ikinci sayi olan "+sayi2 + " en kücüktür.");
        } else if (sayi3<sayi1&&sayi3<sayi2) {
            System.out.println("ücüncü sayi olan "+sayi3+ " en kücüktür.");
        }else {
            System.out.println("Lütfen birbirinden farkli sayilar giriniz");
        }
        if (sayi1>sayi2&&sayi1>sayi3){
            System.out.println("Ilk sayi olan "+sayi1+ " en büyüktür.");
        } else if (sayi2>sayi1&&sayi2>sayi3) {
            System.out.println("Ikinci sayi olan "+sayi2 + " en büyüktür.");
        } else if (sayi3>sayi1&&sayi3>sayi2) {
            System.out.println("Ücüncü sayi olan "+sayi3+ " en büyüktür.");
        }else {
            System.out.println("Lütfen birbirinden farkli sayilar giriniz");
        }




    }



}
