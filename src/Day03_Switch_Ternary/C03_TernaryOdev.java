package Day03_Switch_Ternary;

import java.util.Scanner;

public class C03_TernaryOdev {
    public static void main(String[] args) {

        // Kullanıcıdan bir pozitif tamsayı girmesini isteyin,
        // o pozitif tamsayı 3 basamaklı ise ekrana "3 Basamaklı" yazdırın.
        // 3 basamaklı degilse çift olup olmadigini kontrol edin.
        // Çift ise "3 basamaklı olmayan çift sayı" yazdırın.
        // Çift sayı degilse "3 basamaklı olmayan tek sayı yazdırın."

        Scanner scann =new Scanner(System.in);
        System.out.println("Pozitf tam sayi giriniz: ");
        int sayi = scann.nextInt();

        System.out.println(sayi>=100 ?"sayi 3 basamakli ": (sayi%2==0)? "3 basamaklı olmayan çift sayı":
               "3 basamaklı olmayan tek sayı" );








    }
}
