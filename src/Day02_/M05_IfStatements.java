package Day02_;

import java.util.Scanner;

public class M05_IfStatements {
    public static void main(String[] args) {




        /*
                  Türkiye cumhuriyetinde yaşayan birisi eğer 18 yaşında ve TC vatandaşı ise ehliyet alabilir
                Kullanıcıdan yaşını ve TC vatandaşı olup olmadığını sorup ehliyet alabiliyorsa yazdırın
      */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen yasinizi girin");
        int age =scanner.nextInt();
        System.out.println(" Tc vatandasi iseniz E degilseniz H tuslayiniz");
        char TcMi= scanner.next().charAt(0);
        String TC= Character.toString(TcMi);

        if (age>=18 && TC.equalsIgnoreCase("e") ){
            System.out.println("Ehliyet albilirsiniz");
        }else{
            System.out.println(" ehliyet alamazsiniz");
        }




    }
}
