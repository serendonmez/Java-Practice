package SansliKullanici2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class menu {

    /*
    Sansli Kullanici Belirleme Uygulamasi
  Kulanıcıların adini ve dogum tarihini girerek bir ArrayListe ekleyen
 ve sonrasında birini random şanslı kullanıcı olarak ekrana yazdıran bir uygulamadır.
 Bunun için;
 1- Bir user class oluşturun fields: name , birthDate (LocalDate cinsinden)
 2- Registration class oluşturun, icinde register method olusturun
 ve Kullanıcıdan user ismini ve dogum tarihini alarak ArrayList e ekleyin
 3- Listing class oluşturun ve printHappyUsers isminde bir metod ekleyerek
 ArrayListteki userlardan random sansli kisiyi yazdıran metodu oluşturun.
 4- Menu class olustur
 5- Runner clas
*/

public static void giris (){

    System.out.println( " welcome to the Application ! who is the lucky?");

    System.out.println(" Select the number of action you´want to perform" +
            "1-Enter the name\n"+
            "2-List lucky name\n"+
            "3-Exit\n"+
            "your choice : \n");
    Scanner scanner = new Scanner(System.in);

    try {
        int secim = scanner.nextInt();

        switch (secim){
            case 1: AlternativeRegister.alternativeRegister();
            giris();
            break;
            case 2: Listing.printHappyUser(Registration.usersList);
            giris();
            break;
            case 3: System.exit(0);
            default:
                System.out.println(" Enter valid value");

        }
    } catch (InputMismatchException e) {
        System.out.println("lütfen sayi girin");
    }

}
}
