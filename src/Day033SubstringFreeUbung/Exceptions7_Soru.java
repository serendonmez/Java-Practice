package Day033SubstringFreeUbung;

public class Exceptions7_Soru {
    public static void main(String[] args) {


        String s= "J";
        try {
            s=s+"a";
        }catch (Exception e){
            s=s+"v";

        }finally {
            s=s+"a";
        }
        s=s+"m";
        System.out.println(s);


        //Object obj = new Integer (100);
       //  System.out.println((Byte)obj); --> class cast Exception verir.


        String a= "-12345"; //  String deger eger int e parse edilemeyecek bir deger olsaydi
        int i= Integer.parseInt(a);  // "Java"  ya da " 15,789 ) gibi
        System.out.println(i+2); //bu durumda NumberFormatException throw ederdi.

        countEgg(10);


        String s2= null;
        System.out.println(s2.length()); //NullPointerException

    }

    public static void countEgg(int numberOfEgg){

        try{
            if (numberOfEgg<0){
                throw  new IllegalArgumentException();
            }else {
                System.out.println(numberOfEgg);
            }
        }catch (IllegalArgumentException e){
            System.out.println("negatif olamaz");
        }
    }
}
