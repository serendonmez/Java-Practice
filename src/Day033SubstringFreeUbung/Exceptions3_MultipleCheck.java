package Day033SubstringFreeUbung;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions3_MultipleCheck {
    public static void main(String[] args) throws FileNotFoundException, IOException {


        // unhandled exception hatasi aldigimizda DosyaYolu.Read() in üstüne gidince
        // handle etmemiz gereken exceptionin IO exception oldugunu gördük
        // FileInputStream  de aldigimiz exception icin
        // method signature a FileNotFound exception eklemistik
        // IO exception onu cover ettigi icin FileNotFoundException i silebiliriz
        // ya da ikisini birlikte signateure a ekleyebiliriz.

        //Dosya adi dogru , throws exceptionina takilan hata yoksa;


        String b="src/Day033SubstringFreeUbung/File2";

        FileInputStream dosyaYolu= new FileInputStream(b);

        // dosyaYolu.read(); FileInputStream in read methodu bize dosyadaki
        // metni char olarak tek tek getirir
        // tüm metni while ile okuturuz.


        int k=0;
        while ((k=dosyaYolu.read()) !=(-1)){
            System.out.print((char)k);
        }



    }
}
