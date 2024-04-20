package Day5_MethodCreation;

public class CheckPart2 {
    public static void main(String[] args) {

         /*
        Soru -2
          // verilen bir sayinin Armstrong sayi olup olmadigini kontrol eden code yazin
                // Armstrong sayi rakamlarinin kuplerinin toplamina esit olan sayidir
                // 153 = (1*1*1) + (5*5*5) + (3*3*3) gibi
                //370 = (3*3*3) + (7*7*7*)+(0) = 370
         */





            AmstrongNum(1150);



        }


        public static int AmstrongNum( int sayi){

        int temp = sayi;

        int remainder =0;
        int reverseNum = 0;

        while (temp>0 ) {

            remainder = temp % 10; // 3
            reverseNum += remainder * remainder * remainder;
            temp = temp / 10; //15


        }

            if ( sayi ==reverseNum){
                System.out.println(" girdigniz sayi Amstrong sayidir ");
            }else {
                System.out.println( "sayi amstrong degil ");
            }
            System.out.println(reverseNum);


            return reverseNum;
        }

 }

