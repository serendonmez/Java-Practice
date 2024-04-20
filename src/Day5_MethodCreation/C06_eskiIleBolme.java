package Day5_MethodCreation;

public class C06_eskiIleBolme {

    // kullanicidan bolunen ve bolen seklinde 2 sayi alalim ve bolme operatoru
    // kullanmadan bolme islemini gerceklestirip bolumu hesaplayan method create ediniz


    static int bolum=0; // tüm classta kullanmak icin class level da olusturduk


    public static void main(String[] args) {

        bolmeIslemi(240,12);

    }



    public static void bolmeIslemi (int bolunen, int bolen){



         while (bolunen>=bolen){
             bolunen-=bolen;

             bolum++;
         }
        System.out.println(bolum);






    }
}



