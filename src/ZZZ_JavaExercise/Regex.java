package ZZZ_JavaExercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {

        // erstellung eines Regex
        String regex= "Hello world";
        Pattern pattern = Pattern.compile(regex);
        // matcher und Pattern

        Matcher matcher= pattern.matcher("Hello world this is a Regex Example");
        boolean matchFound=matcher.find();

        // Grundlegende Regex Pattern

        // Praktische Anwendung vin Regex
        //1. Validierung von E-mail.

        String emailRegex= "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern emailPattern=Pattern.compile(emailRegex);

        //Extrahieren von Zahlen aus einem Text

        String text="The price of the item is $45.99";
        String numberRegex="\\d+\\.\\d+"; // \\d-->rakam \\d+ iki basamakli sayi
        // \\.\\d+-->45,99
        // \\.\\ 4,5
        // -? --> negativ Value

        // ^[a-zA-Z0-9]+$ --> a-z = kücük harfler ve A-Z ye büyük harfler 0-9 arakmalri tmesil ediyor
        // -? --> negativ degerler alabilir

        // ^[a-z]+$

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            System.out.println("Bitte geben Sie was ein");
            System.out.println( sonu$(scanner.nextLine()));

        }

    }

    static public boolean istWort(String s){

        // tüm kelime ayni mi?

        return s.matches("Wort");
        
    }


    static public boolean hatBuchStaben(String s){

        // patternschreibweise basa [] ile istedigimiz sekli girebiliriz.

      return s.matches("[wW]ort");
    }


    // Buchstaben  Buchstaben
    // farkli kelimeri kontrol ettirebiliriz ilk kelime mi, ikinci mi seklinde
    public static boolean istTrueOderFalse(String s){
        return s.matches("[tT]rue|[fF]alse");
    }



//[Alle buchstaben] {4 stück}-->  [a-zA-Z]{4}-->
    public static boolean hatVierBisNeun(String s){

        return s.matches("[a-zA-Z]{4,9}"); // range girebiliriz. {2,5} de olabilir.

    }




// [AllesZahlen]{5Stück} _zB. für Postleitzahlen


    public static boolean hatfunfZahlen (String s){

        return s.matches("[0-9]{5}");
    }

    // [ALle BuchstabenundZahlen] {KeineBisVier}

    public static boolean hatZahlenUndOderBuchStaben (String s){

        return s.matches("\\w{0,}"); // {0, } --> 0 dan sonsuza tüm inputlar sayi rakam ya da _ olabilsin.
    }

    public static boolean sonu$(String s){

        return s.matches("^[A-Za-z][A-Za-z0-9!@#$%^&*]*$");

        //^[A-Za-z]--> ilk harf
        // [A-Za-z0-9!@#$%^&*] --> ilk harften sonra
        //* --> en son bununla bitir.
    }




    /* (\\w) ile [a-z] farki : -->
    [a-zA-Z0-9_] ==\\w
    "abc123_" ifadesi ikisi icin de esit.
     Köşeli parantezler arasındaki her bir karakter ayrı değerlendirilmektedir.
      Parantezler,() arasında kullanılan karakterler ise, bütün bir karakter olarak değerlendirilir.

       {n} --> karakter gruplarının n kez tekrarlanması gerektiğini belirtiriz
       ^ : Satırın başlangıcıyla match olur
        $: Satırın sonu ile match olur.
        . : Nokta karakteri
    * : Yıldız karakteri. Kendinden önce gelen karakterin sıfır veya daha fazla kullanıldığında match olur
        + :Kendinden önce gelen karakterin en az bir veya daha fazla kullanıldığında match olur

     */

}
