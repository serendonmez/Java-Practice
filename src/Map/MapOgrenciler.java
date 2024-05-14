package Map;

import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapOgrenciler {


     protected static Map< Integer , String> ogrenciler = new TreeMap<>();

     public static void ogrenciEkle() {

         ogrenciler.put(112, "Serdar-Can-11-H-MF");
         ogrenciler.put(113, "Melike-Cem-10-G-TM");
         ogrenciler.put(114, "Bilge-Can-9-E-SOZ");
         ogrenciler.put(115, "Hakan-Yilmaz-10-E-MF");
         ogrenciler.put(116, "Yücel-Sahin-10-D-TM");
         ogrenciler.put(117, "Ayse-Yilmaz-12-A-MF");
         ogrenciler.put(118, "Sibel-Can-11-B-TM");

     }

     public static void noIleIsimSoyisimYazdir(int ogrenciNo ){

        String istenenOgrenciNo= ogrenciler.get(ogrenciNo); // rest Value yu getirecek

         // Bu stringdeki bilgilere tek tek ulasmak icin rest Value yu Split edelim

         String [] arr= istenenOgrenciNo.split("-");

         // arr de index ile isim soy isme ulasabiliriz

         System.out.println(ogrenciNo +" lu ogrencinin adi :"+arr[0]+" soyadi : "+arr[1]);


     }

    public static void sinifVeSubeIleListeOlusturma (Integer sinif, String sube){


        Set<Integer > ogrenciKeyleri = ogrenciler.keySet(); //--> set döndürür


        // set index desteklemedigi icin for Each ile rest value ya ulasalim

        for ( int each : ogrenciKeyleri){


            String istenenOgrenciValue = ogrenciler.get(each);

           String []arr= istenenOgrenciValue.split("-");

           if (arr[2].equals(sinif+"") && arr[3].equalsIgnoreCase(sube)){

               System.out.println(each+" "+arr[0]+" "+arr[1]);
           }



        }






    }


    public static void IsimVeSoyisimIleOgrenciBulma (){







    }

}
