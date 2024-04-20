package Day5_MethodCreation;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CheckPart3 {

    // //SORU - 3
    //    // ask user to enter an integer, word or any sentences
    //    // 1- check if the entry palindrome or not
    //    // (a word, phrase, or sequence that reads the same backwards as forwards, e.g.
    //    // madam or "Live on time, emit no evil")
    //    // 2- if it is not a palindrome, tell to user first character that does not
    //    // fallow the rule
    //    // 3- print on console how it should written to be palindrome


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir tamsayı, kelime veya cümle girin:");
        String input = scanner.nextLine();
        input = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); // Remove non-alphanumeric
        // characters and convert to lowercase
        boolean isPalindrome = true;
        int firstMismatchIndex = -1;
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - i - 1)) {
                isPalindrome = false;
                firstMismatchIndex = i;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("Bu giriş bir palindromdur.");
        } else {
            System.out.println("Bu giriş bir palindrom değil.");
            System.out.println("İlk uyuşmayan karakter: " + input.charAt(firstMismatchIndex));
        }
    }









}
