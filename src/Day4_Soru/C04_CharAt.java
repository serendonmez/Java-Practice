package Day4_Soru;

public class C04_CharAt {
    public static void main(String[] args) {
        /*
        Girilen bir stringdeki a harfi sayısını bulunuz.
            ama  c harfine  gelirse döngüden çıkılsın
        */


        aLarinToplami("Java cok harika");

        // string bi deger olarak assign ettigimiz i degerinden
        // bi karakteri kullnirken metin.chatAt( ) yapmalyiiz.





    }

    public static void aLarinToplami (String metin){

        int toplam =0;

        for (int i = 0; i <= metin.length() ; i++) {
            if (metin.toLowerCase().charAt(i)=='a'){
                toplam++;
                                            //toplam+=i;
            }else if (metin.toLowerCase().charAt(i)== 'c'){
                break;



            }

        }
        System.out.println(toplam);



    }
}
