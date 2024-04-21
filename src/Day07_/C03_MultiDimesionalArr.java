package Day07_;

import java.util.Arrays;

public class C03_MultiDimesionalArr {
    /*
     * $ ve £ isareti olanlarin toplamlarini ayri ayri bulun
     *
     * String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
     */


    public static void main(String[] args) {
        // SPLIT methodu STRING ARR döndürür.

        String str="$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";



        String arr[]= str.split(" "); // bosluktan sonraya virgül koy

        int toplam$= 0;
        int toplam£=0;
        System.out.println(Arrays.toString(arr));


        System.out.println("--------------");

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i].contains("$")){
                toplam$+=Integer.parseInt(arr[i].replace("$","")); // arr[i]=String deger veriri
                // int bir variable a esitlemek icin parse ettik.

            }else {
                toplam£ += Integer.parseInt(arr[i].replace("£", ""));
            }
        }

        System.out.println(" Dolar toplami :"+toplam$);
        System.out.println("£ toplami :"+toplam£);

    }
}
