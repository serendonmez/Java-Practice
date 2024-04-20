package Day4_;

import java.util.Scanner;

public class C01_uniqueHarf {
    public static void main(String[] args) {
        /*
         * Kullanicidan 3 harfli bir kelime isteyiniz ve ternary
         * kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
         * Test data: ali eme all
         */

        Scanner scanner= new Scanner(System.in);
        System.out.println(" Lütfen 3 harfli bi kelime girin");
        String word= scanner.nextLine();

        char w1 = word.charAt(0);
        char w2 = word.charAt(1);
        char w3= word.charAt(2);


        // ternary ile

        String sonuc =word.length()==3? (w1!=w2&&w2 !=w3 && w1 != w3) ?  "girdiginiz kelime unique harferden olusuyor" :
             " girdiginiz kelimenin harfleri unique degil"   : "girilen kelime 3 harfli degil";
        System.out.println(sonuc);










    }
}
