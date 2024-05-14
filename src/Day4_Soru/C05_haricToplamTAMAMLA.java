package Day4_Soru;

public class C05_haricToplamTAMAMLA {
    public static void main(String[] args) {
        /* TASK :
      Kullanıcıdan 10 adet sayı isteyiniz
      Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.
            */

            sayiToplama(15,12,13,14,15,17,18,16,8,2);

    }



    public static void sayiToplama(int sayi1, int sayi2, int sayi3, int sayi4, int sayi5,
                                   int sayi6, int sayi7,int sayi8, int sayi9, int sayi10){
        int toplam = 0;
        for (int i = sayi1; i <=sayi10 ; i++) {
            toplam+=i;


        }
        System.out.println(" girdiginiz sayilarin toplami : "+ toplam);


    }

}
