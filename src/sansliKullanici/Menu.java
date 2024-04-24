package sansliKullanici;

import java.util.Scanner;

public class Menu {

    static public void giris(){
        System.out.println(" Welcome to the Application!! Who is the lucky?");
        System.out.println("Select the number of action you want to perform: \n"+
                "1. Enter name\n"+
                "2. List lucky name\n"+
                "3. Exit\n"+
                "Your choice:");

        Scanner scan=new Scanner(System.in);
        if (scan.hasNextInt()) {
            int secim = scan.nextInt();
            switch (secim) {
                case 1: {
                    Registration.register();
                    giris();
                    break;
                }
                case 2: {
                    Listing.printHappyUsers(Registration.usersList);
                    giris();
                    break;
                }
                case 3: {
                    System.out.println("Good bye!!!");
                    break;
                }
                default: {
                    System.out.println("Enter valid value");
                    giris();
                    break;
                }
            }
        }else {
            System.out.println("Please, enter number only!!!");
            giris();
        }



    }

}
