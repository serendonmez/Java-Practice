package SansliKullanici2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Registration {
    static ArrayList<User> usersList =new ArrayList<>();



    static public void register (){

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
        Scanner scanner= new Scanner(System.in);
        System.out.println(" lütfen isim soy isim girin");
        String name =scanner.nextLine();
        LocalDate bugun = LocalDate.now();


        System.out.println(" lütfen dogum tarihinizi girin gün/ay/yil seklinde");



        LocalDate birthdate = null;




            try {
                String date = scanner.nextLine();
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MM yyyy");
                birthdate = LocalDate.parse(date, dtf);

            } catch (DateTimeParseException e) {
                System.out.println("lütfen dogum tarihinizi gün ay yil seklinde girin örn: 01 01 1994 ");
                register();
            }



            User user = new User(name, birthdate); // obj ile hem string hem local date, hem de int

            usersList.add(user); //




    }


}
