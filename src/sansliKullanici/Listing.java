package sansliKullanici;

import java.util.ArrayList;
import java.util.Random;

public class Listing {

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


    static public void printHappyUsers(ArrayList<User> usersList){


        Random random=new Random();
        int randomindex= random.nextInt(usersList.size());

        User LuckyUser=usersList.get(randomindex);
        System.out.println(LuckyUser.name + "---- You are luckuser!!"+"-----You were born on " + LuckyUser.birthdate );


    }

}
