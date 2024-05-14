package Day07_Arrays;

public class C07NestedFor {
    public static void main(String[] args) {

        // * * * * *
        // * * * *
        // * * *
        // * *
        // *




        for (int i = 0; i < 5; i++) { // i=0 i=1
            for (int j = 5; j >i ; j--) { // 5>0 -> *
                //4>0-->* 3>0-->*2>0-->* 1>0-->* 0>0 -->false loop biter
                System.out.print("* "); // 5>1 -->*.. 4>1 3>1..

            }
            System.out.println(); // bi satir asagi iner

        }


        //


        for (int i = 0; i <10 ; i++) {
            for (int j = 0; j<i ; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

        for (int i = 1; i <=5 ; i++) {
            for (int j = 5; j >=i ; j--) {
                System.out.print("* ");

            }
            System.out.println();

        }


            int n= 10;

        for (int i = 1; i <=10 ; i++) {
            for (int j = i; j <=10 ; j++) {
                System.out.print(" ");
                
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");

            }
            System.out.println();
        }








    }
}
