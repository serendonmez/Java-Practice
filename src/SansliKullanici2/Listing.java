package SansliKullanici2;

import java.util.ArrayList;
import java.util.Random;

public class Listing {


    public static void printHappyUser(ArrayList<User> usersList) {

        Random random = new Random();
        int randomEleman= random.nextInt(usersList.size());

        User luckyUser = usersList.get(randomEleman);
        System.out.println(" Dear " + luckyUser.name +" you are the lucky person \nyou were born on "
                + luckyUser.birthdate+ "\nCongragulations");




    }
}
