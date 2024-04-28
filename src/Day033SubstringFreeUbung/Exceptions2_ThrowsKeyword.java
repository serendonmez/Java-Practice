package Day033SubstringFreeUbung;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptions2_ThrowsKeyword {

    public static void main(String[] args) throws FileNotFoundException {

        // Dosyanin okunmasi cok önemli ise ve dosya bulunamadiginda kod calismasin istiyorsak
        // dosyani bulinamadigi durumda exception firlatsin kod calismasin ve
        //  kodu inceleyenleri uyarmak amacilya
        // throws key wordu koymaliyiz
        // method adi yanina throws + exception adi yolu ile
        // java hata üzerine gidildiginde otomatik yapar
        // bu duurm sorunu handle etmez, exception i önlemez
        // kod calismadiysa ayrintili olarak hatanin kaynagini söyler

        // asagida dosya adini degistirdik
        // java dosyayi bulamayacagi icin exception verecektir
        // exception : dosya bulunmadi




        String dosyaYolu= "src/Day033SubstringFreeUbung/File2369";

        FileInputStream fileInputStream= new FileInputStream(dosyaYolu);


    }
}
