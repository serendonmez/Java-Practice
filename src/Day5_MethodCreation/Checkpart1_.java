package Day5_MethodCreation;

public class Checkpart1_ {
    ////Soru-1
    //    /*
    //     * Interview questions�
    //     *
    //     * write a return method to reverse number-->ters yazdirmak
    //     *
    //     * Input : 12345 Output : 54321
    //     */

    public static void main(String[] args) {
        System.out.println(NumberReverser(12345)); //4321


    }

    public static int NumberReverser(int num) {


        int temp= num; // gecici sayiya atadik
        int remainder =0; // kalani 0 a esitledin
        int reversedNum= 0; // tesr sayi




        while (temp >0){

            remainder= temp %10;
            temp=temp/10;
            reversedNum= reversedNum*10+remainder;

        }

        return reversedNum;
        }





    }





