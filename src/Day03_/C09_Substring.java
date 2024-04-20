package Day03_;

import java.util.Scanner;

public class C09_Substring {
    public static void main(String[] args) {
        // Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
        // ad ayrı soyad ayrı sekilde ekrana yazdırınız.

        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen adınızı ve soyadınızı arada bir boşluk olacak şekilde giriniz: ");
        String nameSurname= scan.nextLine();
        System.out.print(nameSurname.substring(0, nameSurname.indexOf(" "))); // bosluga kadar yazdir yok,
                                                            // boslugun indexine kadar yazdir diyebilirsin

        System.out.print((nameSurname.substring(nameSurname.indexOf(" "))));

        System.out.println("  ");







    }
}
