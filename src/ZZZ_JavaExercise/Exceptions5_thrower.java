package ZZZ_JavaExercise;

import java.util.Scanner;

public class Exceptions5_thrower {
    public static void main(String[] args) {
        divide();
    }

    public static void divide (){

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir sayi girin");
        int number = scanner.nextInt();

        if (number==0){
            throw new ArithmeticException("0 a bölemezsiniz");

            // sout ( " 0 a bölemezsiniz ") yerine exception verdik.
        }else {
            System.out.println(10/number);
        }
    }
}
