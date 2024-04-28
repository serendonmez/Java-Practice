package Day033SubstringFreeUbung;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptions1_CheckedException {
    public static void main(String[] args) {

        String FileStream = "src/Day033SubstringFreeUbung/File1.txt";
        // exception i handle ettigimizde hata vermeden tüm satirlari okumaya devam eder
        //dosyanin okunup okunmamasi önemli degilse bunu tercih ederiz

        try {
            FileInputStream fis= new FileInputStream(FileStream);
        } catch (FileNotFoundException e) {
            System.out.println("dosya yolu hatali");
        }


        String dosyaYolu= "src/Day033SubstringFreeUbung/File2";

        try {
            FileInputStream fis2= new FileInputStream(dosyaYolu);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        String a= "Ali";
        System.out.println(a);


    }


}
