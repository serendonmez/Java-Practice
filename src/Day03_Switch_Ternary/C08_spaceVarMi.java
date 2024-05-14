package Day03_Switch_Ternary;

import java.util.Scanner;

public class C08_spaceVarMi {
    public static void main(String[] args) {
        // Kullanıcıdan alacağını bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.


        Scanner scann = new Scanner(System.in);
        System.out.println("bir metin girin ");
        String metin = scann.nextLine();

        if (metin != ("")){
            System.out.println(metin.contains(" "));
        }else System.out.println("merhaba");
    }



}
