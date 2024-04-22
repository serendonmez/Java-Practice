package Day033SubstringFreeUbung;

public class StringClass {

    public static void main(String[] args) {

        String s1= "Simply", s2="Coding";
        s1.concat(s2);
        System.out.println(s1); // Simply --> String immutable dir.

        int a= 51;
        a+=78;
        System.out.println(a); // --> int mutable


        // String methodlardan  Check etmek icin-->Boolean döner
        //  contains,
        //equals,equalsIgnore
        // startWith, endWith
    //-------------------------------
        // position --> int döner
        // length
        // indexOf
        // LastIndexOf
        // compareTo (StringBuilder)
        //compareToIgnoreCase
        //------------------------------

        // Manipulation-->string
        //trim--> varsa space siler.
        String isim=" Sinan   ";
        System.out.println(isim.trim());// --> spacei kaldirir.


        //toUpperCase Lowercase
        // Concat

        //replace Parameter -> char, char -->return type --> String

        String s3="this is a String";
        String s4=s3.replace('a','K');

        System.out.println("ssssssssss");
        System.out.println(s4);

        String s5="This is a String";
        String s6=s5.replace("is","was");
        System.out.println(s6);


        //
        //substring  parameter int, Return Type String
        String s7="This is a test";
        String s8=s7.substring(10);
        System.out.println(s8); // test




        //-----------------
        //CharAt  parameter int, Return type char

        String s9="Hello";
        char ch=s9.charAt(0);
        System.out.println(ch); // H






    }
}
