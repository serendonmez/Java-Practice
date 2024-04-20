package Day5_MethodCreation;

public class C08_usAlma {

    //1 sayinin ussunu hesaplatan code create edinim.

    public static void main(String[] args) {
        usAlma(12,2);

    }

    static void usAlma (int sayi, int us){

        int sonuc=1;

        int us1 = us;
        while (us1>0){
            sonuc*=sayi;
            us1--;


        }
        System.out.println(sonuc);


    }

}
