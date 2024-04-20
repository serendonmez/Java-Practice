package Day03_;

import java.util.Scanner;

public class C06_ucBasamakliSayiYazdirma {
    public static void main(String[] args) {

        // 2- Girilen 3 basamaklı bir sayıyı yazı ile yazdırınız

        Scanner scann =new Scanner(System.in);
        System.out.println("uc basamakli sayi girin ");
        int sayi = scann.nextInt();
        int birlerBAsamagi= (sayi%10), onlarBasamagi=(sayi/10)%10, yuzlerBasamagi=(sayi/100); //3-120_12_2_10/100

        switch (yuzlerBasamagi){
            case 0:System.out.print("");break;
            case 1:System.out.print("yüz");break;
            case 2:System.out.print("iki yüz");break;
            case 3:System.out.print("üc yüz");break;
            case 4:System.out.print("dört yüz");break;
            case 5:System.out.print("bes yüz");break;
            case 6:System.out.print("alti yüz");break;
            case 7:System.out.print("yedi yüz");break;
            case 8:System.out.print("sekiz yüz");break;
            case 9:System.out.print("dokuz yüz");break;


        }

        switch (onlarBasamagi){
            case 0:System.out.print("");break;
            case 1:System.out.print("on");break;
            case 2:System.out.print("yirmi");break;
            case 3:System.out.print("otuz");break;
            case 4:System.out.print("kirk");break;
            case 5:System.out.print("elli");break;
            case 6:System.out.print("altmis");break;
            case 7:System.out.print("yetmis");break;
            case 8:System.out.print("seksen");break;
            case 9:System.out.print("doksan");break;


        }

        switch (birlerBAsamagi){
            case 0:System.out.print("");break;
            case 1:System.out.print("bir");break;
            case 2:System.out.print("iki");break;
            case 3:System.out.print("üc");break;
            case 4:System.out.print("dört");break;
            case 5:System.out.print("bes");break;
            case 6:System.out.print("alti");break;
            case 7:System.out.print("yedi");break;
            case 8:System.out.print("sekiz");break;
            case 9:System.out.print("dokuz");break;


        }




    }
}
