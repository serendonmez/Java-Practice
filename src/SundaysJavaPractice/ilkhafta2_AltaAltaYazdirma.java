package SundaysJavaPractice;

public class ilkhafta2_AltaAltaYazdirma {
    public static void main(String[] args) {
         /*
                12345 sayisinin herbir basamagini konsolda altalta yazdirin.
            input: 12345
                    output: 1
                            2
                            3
                            4
                            5
                                                               */
                int sayi=12345;


        basamaklariBulma(sayi);


    }

    public static void basamaklariBulma ( int sayi){




        int birlerBasamak=sayi%10;
        sayi/=10;
        int onlarBas= sayi%10;
        sayi/=10;
        int yuzlerBas=sayi%10;
        sayi/=10;
        int binlerBas =sayi%10;
        sayi/=10;
        int onbinlerBas=sayi%10;


        System.out.println(onbinlerBas);
        System.out.println(binlerBas);
        System.out.println(yuzlerBas);
        System.out.println(onlarBas);
        System.out.println(birlerBasamak );






    }
}
