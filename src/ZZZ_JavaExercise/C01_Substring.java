package ZZZ_JavaExercise;

import java.util.Scanner;

public class C01_Substring {
   static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {

        //Schreiben Sie ein Programm, das den Benutzer nach einem Wort fragt und dann das erste Zeichen des Wortes ausgibt.

  //  Scanner scanner=new Scanner(System.in);
  //  System.out.print("Schreiben Sie bitte ein Wort: ");
  //  String wort= scanner.nextLine();

  //  System.out.println(wort.substring(0,1));
  //  System.out.println(wort.indexOf(" ")); // -1 verir cünkü bosluksuz

  //  //Schreiben Sie eine Methode, die einen String als Parameter akzeptiert
  //  // und die ersten drei Zeichen dieses Strings zurückgibt.


  //  Scanner scann=new Scanner(System.in);
  //  System.out.print("Schreiben Sie bitte ein Wort: ");

  //  String name = scann.nextLine();
  //  System.out.println(name.substring(0, 3));

        //Schreiben Sie ein Programm, das den Benutzer nach seinem vollständigen Namen fragt
        // und dann nur den Vornamen ausgibt.


        System.out.print("Geben Sie bitte ihren vollständigen Namen ein :");

        String nameSurname = scan.nextLine();

        System.out.println(nameSurname.substring(0,nameSurname.indexOf(" "))); // vorname
        System.out.println("-------------------------");


        //Schreiben Sie eine Methode, die einen Satz als Parameter akzeptiert und
        // das letzte Wort des Satzes zurückgibt.

        ersteDreiZeichen();




        //Schreiben Sie ein Programm,
        // das den Benutzer nach einem Wort fragt
        // und dann alle Buchstaben außer dem ersten und dem letzten Buchstaben ausgibt.

      ausserErstUndLetzt("Monika");





    }

    public static void ersteDreiZeichen( ){
        System.out.println("Geben Sie bitte ein Satz ein");
        String satz=scan.nextLine();
        System.out.println(satz.substring(satz.lastIndexOf(" ", satz.length() - 1)));

    }

    public static void ausserErstUndLetzt(String name){

        System.out.println(name.substring(1, name.length() - 1));


    }
}
