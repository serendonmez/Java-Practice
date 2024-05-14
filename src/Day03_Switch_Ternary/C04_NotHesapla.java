package Day03_Switch_Ternary;

import java.util.Scanner;

public class C04_NotHesapla {
    public static void main(String[] args) {


        // Kullanıcıdan notunu alın ve aşağıdaki kurallara göre ekrana A, B, C veya D yazdırın.
        // 1. 0()dahil ile 50 arasi - D
        // 2. 50(dahil) ile 60 arası - C
        // 3. 60(dahil) ile 80 arası - B
        // 4. 80(dahil) ustu- A
        // Yanlis not girilirse ekrana "Gecerli not giriniz" yazdirin




        Scanner scann =new Scanner(System.in);
        System.out.println("notuzu girin: ");

        int not = scann.nextInt();


        int puan = not/10;
        switch (puan){
            case 1 :
            case 2:
            case 3:
            case 4:
                System.out.println("Notunuzu D");
                break ;
            case 6:
            case 7:
                System.out.println(" C");
                break;
            case 8:
            case 9 :
                System.out.println("B");
                break;
            case 10 :
            case 11:
                System.out.println(" A ");
                break;



        }






    }
}
