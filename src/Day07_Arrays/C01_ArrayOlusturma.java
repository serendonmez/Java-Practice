package Day07_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C01_ArrayOlusturma {



    //kullanicin girdigi sayi kadar int array olusturan ve array elemanlarini
    //kullanicidan alan ve girilen array elemanlarinin en buyuk ile en kucuk
    //elemaninin arasindaki farki gosteren java programi yazin

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println(" kac adet eleman gireceksiniz");
        int n= scan.nextInt();
        int []arr= new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.println(i+1+". elemani girin");
            arr[i]=scan.nextInt();

        }
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr); // bu satirdan sonra arr sort edilmemis haline döner
        // bu nedenle sort methodundan sonra atama yapilamsi icin yazdir
        System.out.println(Arrays.toString(arr)); //  kücükten büyüge dogru siralanir

        System.out.println("En büyük elemanla en kücük eleman farki"+((arr.length-1)-arr[0]));


    }

}
