package Day033SubstringFreeUbung;

import java.util.Scanner;

public class C03_ {
    public static void main(String[] args) {
        //Schreiben Sie eine Methode, die einen Satz als Parameter akzeptiert und
        // alle Wörter im Satz umdreht.
        // Verwenden Sie dazu die substring-Methode, um jedes Wort zu manipulieren.


        Scanner scann= new Scanner(System.in);
        System.out.println(" einen satz bitte");
        String satz= scann.nextLine();
        String umgedrehteSatz= ""; // seren

        for (int i = satz.length()-1; i >=0 ; i--) {

            umgedrehteSatz +=satz.charAt(i);



        }
        if (umgedrehteSatz.equalsIgnoreCase(satz)) {
            System.out.println(" es ist ein Palindrome");
        }else{
            System.out.println(" es ist keine Palindrome");
        }










    }







}
