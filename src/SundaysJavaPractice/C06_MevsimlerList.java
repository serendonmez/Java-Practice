package SundaysJavaPractice;

import java.util.ArrayList;

public class C06_MevsimlerList {
    public static void main(String[] args) {

        //Ilkbahardan baslayarak 4 mevsim array olusturun. Yazdan geriye dogru mevsimleri siralayin.


        ArrayList<String> mevsimler=new ArrayList<>();
        mevsimler.add("Ilkbahar");
        mevsimler.add("Yaz");
        mevsimler.add("Sonbahar");
        mevsimler.add("Kis");
        System.out.println(mevsimler.subList(0,4));
        yerDegistir(mevsimler,0,1,2,3);
        System.out.println(mevsimler);
        System.out.println("----------Diger yazdirma sekli-----------");
        for (String mevsim:mevsimler) {
            System.out.print(mevsim+" ");
        }
    }
    public static void yerDegistir(ArrayList<String>liste,int index0, int index1, int index2, int index3){


        String boskova= liste.get(index0);
        liste.set(index0, liste.get(index1));
        liste.set(index1,boskova);
        String boskova1= liste.get(index2);
        liste.set(index2, liste.get(index3));
        liste.set(index3,boskova1);
    }



}

