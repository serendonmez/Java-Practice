package Day07_Arrays;

import java.util.Arrays;

public class C02_MultiDimensionalArrays_nestedforLoop {

    // multidimensional arrayin iç array lerindeki tüm elemanların toplamını birer
    // birer bulan ve herbir sonucu yeni bir arrayin elemanı yapan ve yeni array i ekrana
    // yazdıran programı yaziniz.
    // input {{10,20,30},{4},{6,7,20}}==> output ={60,4,33}

    public static void main(String[] args) {

        int [][] arr={{10,20,30,78},{12,4,85},{6,7,20,9}};

        int []toplamArr=new int[3];// 0,0,0--->60,


        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[i].length ; j++) { //toplamArr[0]= arr [0][0] =10+arr[0][1]+arr[0][2]=
                toplamArr[i]+=arr[i][j];  //toplamArr[1]=arr[1][0]
                //ToplamArr[2]=arr[2][0]+arr[2][1]+arr[2][2]
            }

        }
        System.out.println(Arrays.toString(toplamArr));


    }


}
