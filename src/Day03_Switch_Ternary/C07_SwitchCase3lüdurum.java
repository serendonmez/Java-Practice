package Day03_Switch_Ternary;

import java.util.Scanner;

public class C07_SwitchCase3lüdurum {
    public static void main(String[] args) {
        /*

       Kullanicidan ay numarasini alip mevsimi yazdirin.
              */

        Scanner scann =new Scanner(System.in);
        System.out.println("ay no girin ");
        int ayNo= scann.nextInt();

        switch (ayNo){
            case 1: case 2: case 12:
                System.out.println("kis mevsimindesiniz");
                break;
            case 3: case 4: case 5:
                System.out.println("ilkbahar");
                break;
            case 6: case 7: case 8:
                System.out.println("sonbahar");
                break;
            case 9: case 10: case 11:
                System.out.println("yaz");
            default:
                System.out.println(" yanlis bir deger girdiniz 1-12 arasi deger girin");










        }







    }
}
