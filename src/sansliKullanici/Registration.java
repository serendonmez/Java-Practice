package sansliKullanici;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Registration {


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

static ArrayList<User> usersList= new ArrayList<>();

static public void register(){

    Scanner scan=new Scanner(System.in);
    System.out.println("Enter your name: ");
    String name= scan.nextLine();

    System.out.println("Enter your birthdate (YYYY-MM-dd format");
    String date= scan.nextLine();
    LocalDate birthdate=LocalDate.parse(date);

    User user=new User(name,birthdate);
    usersList.add(user);

    System.out.println("User registered.");

}






}
