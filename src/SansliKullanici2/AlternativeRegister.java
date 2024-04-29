package SansliKullanici2;

import java.time.LocalDate;
import java.util.Scanner;

import static SansliKullanici2.Registration.usersList;

public class AlternativeRegister {
    public static void alternativeRegister(){


            Scanner scan=new Scanner(System.in);
            System.out.println("Enter your name: ");
            String name= scan.nextLine();
/*
        System.out.println("Enter your birthdate (YYYY-MM-dd format");
        String date= scan.nextLine();
        LocalDate birthdate=LocalDate.parse(date);


 */


            LocalDate birthdate = null;
            boolean formatDate = false;

            while (!formatDate){
                System.out.println("kayit gününüzü girin (in yyyy MM dd) : ");
                String date = scan.nextLine();
                if (date.matches("^\\d{4}-\\d{2}-\\d{2}$") ){
                    birthdate =LocalDate.parse(date);
                    if (birthdate.isAfter(LocalDate.now())){
                        System.out.println("Gecersiz giris");
                    }else {
                        System.out.println("gecerli giris");
                        formatDate=true;
                    }

                }else {
                    System.out.println(" gecersiz format girisi lütfen yyyy-MM-dd seklinde girin");
                }
            }

            User user= new User(name, birthdate);
            usersList.add(user);
        System.out.println(" kaydiniz alindi");



    }
}
