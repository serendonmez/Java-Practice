package Day02_;

import java.util.Scanner;

public class M06_WeekdayOrWeekend {
    public static void main(String[] args) {
        /* /*
1- Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
Ornek:  gun=Pazar output = "Hafta sonu"  gun=Sali output = "Hafta ici"
*** String icin equals method'unusalı kullanin
 */
        Scanner scanner=new Scanner(System.in);
        System.out.println("bir gün girin");
        String gun =scanner.nextLine();

        if (gun.equals("pazartesi")||gun.equals("sali")||gun.equals("carsamba")||gun.equals("persembe")||gun.equals("cuma")){
            System.out.println("Bugün "+gun+" haftaici bir gündesiniz! Iyi calismalar");
        }
        if (gun.equals("cumartesi")||gun.equals("pazar")){
            System.out.println("");
        }









    }
}
