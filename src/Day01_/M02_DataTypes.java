package Day01_;

public class M02_DataTypes {
    public static void main(String[] args) {

        //byte< short < intiger< long< float < double
        // byte , short, intiger, long, sadece tamsayi degeri alir ve sirasiyla
        // 8 bit, 16 bit, 32 bit ( en cok kullanilan) ve 64 bitdata saklayabilir
        // float ve double ondalikli sayi kaydeder

         // boolean; mantiksal olarak true lfase deger iceriri.
         //char : ASCII karakterler



   byte sayi= 127;
        System.out.println("sayi = " + sayi); // soutv bi önceki satirda yazilan datayi yazdirir.
        
        byte b1=Byte.MAX_VALUE;
        System.out.println("b1 = " + b1);

       //  byte b2 = 129; kabul etmez.


        short shr = Short.MAX_VALUE;
        System.out.println("shr = " + shr);

        int sayi1= Integer.MAX_VALUE;
        System.out.println("sayi1 = " + sayi1);

        long long1 = Long.MAX_VALUE ;
        System.out.println("long1 = " + long1);

        float flt = Float.MIN_VALUE ;
        System.out.println("flt = " + flt);

        double dbl= Double.MIN_VALUE ;
        System.out.println("dbl = " + dbl);

        /* non primitv data türleri

        cok fazla türü vardir
        karakter siniri yoktur
        String bu data türünde en cok kullanidigmiz

         */

         String isim = "Tarik ";
         System.out.println("isim = " + isim);
         System.out.println("isimin ilk harfi  = " + isim.charAt(0));
         // verilen metnin ilk harfini yazdirmak variable.charAt.(0)


         int sayi4 = 128;

         System.out.println("sayi4 = " + sayi4);

         isim = "murat" ;
         System.out.println(" isim : "+ isim); // isim e baska deger atandigi icin son degeri yazdirir.
         System.out.println("isim = " + isim.toLowerCase());
        System.out.println("isim = " + isim.toUpperCase().charAt(0)); // sadece ilk harfi büyük yazdirdi

        System.out.println("isim = " + isim.toUpperCase()); // variable--> Data type --> String

        System.out.println(Character.isLetter((char)'A')); // methodlar---> return typi olur --> boolean












    }
}
