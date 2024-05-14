package Map;

import java.util.*;

public class C01 extends MapOgrenciler{


    public static void main(String[] args)  {



        /*
        1- Keyvalue : ilk value
        2- Value /Values
        Map < DataType of Key , Data Type of other Values> map= new HashMap<>();
                                                               =new TreeMap<>();
         */

       ogrenciEkle();
        System.out.println(ogrenciler);
        // {112=Serdar-Can-11-H-MF,
        // 113=Melike-Cem-10-G-TM,
        // 114=Bilge-Can-9-E-SOZ,
        // 115=Hakan-Yilmaz-10-E-MF,
        // 116=Yücel-Sahin-10-D-TM,
        // 117=Ayse-Yilmaz-12-A-MF,
        // 118=Sibel-Can-11-B-TM}

        noIleIsimSoyisimYazdir(116);


        sinifVeSubeIleListeOlusturma(12,"A");


    }

}
