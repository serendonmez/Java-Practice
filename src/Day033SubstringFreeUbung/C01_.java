package Day033SubstringFreeUbung;

import java.util.Scanner;

public class C01_ {
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




      //  System.out.println(satz.substring(satz.lastIndexOf(" ")));
       // System.out.println(satz.charAt(satz.length()- 1));


        //Schreiben Sie ein Programm,
        // das den Benutzer nach einem Wort fragt
        // und dann alle Buchstaben außer dem ersten und dem letzten Buchstaben ausgibt.

        Scanner scann=new Scanner(System.in);
        System.out.print("geben Sie ein Wort ein :");
        String wort = scann.nextLine();
        System.out.println(wort.substring(1, wort.length()-1)); // kadar dedigimiz 2. yeri vermez
        System.out.println(wort.length()-1);

        String str = "seren sevim ";
        System.out.println(str.indexOf(0));




    }

    public static void ersteDreiZeichen( ){
        System.out.println("Geben Sie bitte ein Satz ein");
        String satz=scan.nextLine();
        System.out.println(satz.substring(satz.lastIndexOf(" ", satz.length() - 1)));

    }
}
