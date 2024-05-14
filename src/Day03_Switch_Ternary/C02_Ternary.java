package Day03_Switch_Ternary;

import java.util.Scanner;

public class C02_Ternary {
    public static void main(String[] args) {

        Scanner scann= new Scanner(System.in);
        System.out.println("lütfen bir karakter giriniz");
        char character = scann.next().charAt(0);


        System.out.println(Character.isLetter(character)?(Character.isLowerCase(character)? "kucuk harf" : " buyuk harf"):
        "harf degil");

    }
}
