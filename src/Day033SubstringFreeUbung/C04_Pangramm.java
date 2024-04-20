package Day033SubstringFreeUbung;

import java.util.Scanner;

public class C04_Pangramm {
    public static void main(String[] args) {
        //Schreiben Sie ein Programm, das den Benutzer nach einem Satz fragt und
        // dann überprüft, ob der Satz ein Pangramm ist (d.h. ob er alle Buchstaben des Alphabets mindestens einmal enthält).
        // Verwenden Sie die substring-Methode, um Buchstaben zu überprüfen.
        //zB. " The quick brown fox jumps over the lazy dog.
        // Pangramm = alfabedeki bütün harfleri icermesi

        // var ile cözdü.



        //Schreiben Sie eine Methode, die zwei Strings als Parameter akzeptiert und
        // prüft, ob der zweite String eine Teilzeichenfolge des ersten Strings ist.
        // Verwenden Sie dazu die substring-Methode.
        Scanner scanner= new Scanner(System.in);
        System.out.println(" Geben Sie bitte einen Satz ein");
        String satz1 = scanner.nextLine();
        System.out.println("Geben Sie bitte den zweiten satz ein.");
        String satz2= scanner.nextLine();

        if (satz1.contains(satz2)){
            System.out.println(" der zweite Satz ist eine Teilzeicjenfolge des ersten Strings ");
        }else {
            System.out.println(" es ist keine Teilzeichenfolge des ersten Strings");
        }


    }





}
