package Day5_MethodCreation;

import java.util.Scanner;

public class C01_MethodCreation {



        //Soru: Bir metod oluşturun ve bu metod bir string alıp bu string'in uzunluğunu döndürsün.




    public static int calculateStringLength(String text){





        return text.length();

    }

    public static void main(String[] args) {


        Scanner scanner= new Scanner(System.in);
        System.out.println("lütfen bir metin girin");
        String metin =scanner.nextLine();
        System.out.println(" girilen metnin uzunlugunu "+calculateStringLength(metin));











    }


}
