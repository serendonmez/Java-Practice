package ZZZ_JavaExercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions4_TryCatchIleHandling {
    public static void main(String[] args)  {
        // bir den fazla exception oldugu zaman ;
        // 1 tek try multiple catch
        // bu durumda hem
       // FileNotFoundException
        // hem de IOException icin cath olusturmaliyiz
        // 2 . catch i FileNotFoundException icin yazdigimizda
        // FileNotFoundException zaten IOException a extends uyarisi aliriz
        // bu durumda önce FileNotFoundException ile catch
        // sonra IOException ile catch yapmaliyiz

        // Run time Exception bunlari catch edemez cünkü
        // run time exceptionlar unchecked  exception lardir ;
        // FileInputException ve IO Exception checked exceptionlardan en cok karsilasilanlari
        //



        try {
            String b="src/Day033SubstringFreeUbung/File2";

            FileInputStream dosyaYolu= new FileInputStream(b);

            int k=0;
            while ((k= dosyaYolu.read())!= (-1)){
                System.out.print((char)k);
            }
        } catch (FileNotFoundException e) {


            System.out.println("dosya yolu bulunamadi");


        }catch (IOException e){

            System.out.println(" Dosya Input/Output Sorunu var ( yazdirma ) ");

        }



        // Exception konusunda uygulayabilecegimiz 2 yol vardir :
        //1. try catch ile handle etmek ve exception durumuda
        // kodun biizm istedigimiz gibi calismasini saglamak

        // 2. throws ile exception i kontrol altinda tutmak;
        // yani Compile time daki kirmizi hatayi kaldirmak
        // kodu run time da kontrol etmek

    }
}
