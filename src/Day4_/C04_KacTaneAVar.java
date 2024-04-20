package Day4_;

public class C04_KacTaneAVar {
    public static void main(String[] args) {

          /*
        Girilen bir stringdeki a harfi sayısını bulunuz.
        ama  c harfine  gelirse döngüden çıkılsın
        Test Data: Java Candır, gerisi heyecandır.
         */



        String text="Java Candır, gerisi heyecandır.";
        int a=0;

        for (int i = 0; i < text.length(); i++) {
            if (text.toLowerCase().charAt(i)=='a'){
                a++;
            } else if (text.toLowerCase().charAt(i)=='c') {
                break;
            }

        }
        System.out.println("a harfi sayısı: "+a);

    }
}
