package SundaysJavaPractice;


import java.util.Arrays;

public class C06_harflereAyir {

    public static void main(String[] args) {

        ////Altinyildiz kelimesini ters ceviren bir method yazip,
        //// sonra ters halini harflerine ayiran bir method daha yaziniz.


        String kelime="Altinyildiz";
        String terskelime=tersCevir(kelime);
        System.out.println("Kelimenin tersi: "+tersCevir(kelime));
        System.out.println("Harflerine ayrilmis hali: "+ Arrays.toString(ayir(terskelime)));
        System.out.println("Kelimenin harflerine ayrilmis hali: "+Arrays.toString(harflerineAyir(kelime)));



    }

    public static String tersCevir(String kelime){
        String terskelime="";
        for (int i = kelime.length()-1; i >=0 ; i--) {
            terskelime+=kelime.charAt(i);
        }
        // return terskelime.substring(0,1).toUpperCase()+
        // terskelime.substring(1).toLowerCase();
        return terskelime;
    }
    public static String[] ayir(String terskelime){
        String [] harfler=new String[terskelime.length()];
        for (int i = 0; i < terskelime.length(); i++) {
            if (i==0){
                harfler[i]=String.valueOf(terskelime.charAt(i)).toUpperCase();
            } else if (i==terskelime.length()-1) {
                harfler[i]=String.valueOf(terskelime.charAt(i)).toLowerCase();
            }else {
                harfler[i]=String.valueOf(terskelime.charAt(i));
            }
        }
        return harfler;
    }
    public static String[]harflerineAyir(String kelime){
        String [] harfler=new String[kelime.length()];
        for (int i = 0; i < kelime.length(); i++) {
            harfler[i]=String.valueOf(kelime.charAt(i));
        }
        return harfler;
    }
}
