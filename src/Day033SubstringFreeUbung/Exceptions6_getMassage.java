package Day033SubstringFreeUbung;

import java.util.InputMismatchException;

public class Exceptions6_getMassage {
    public static void main(String[] args) {



        Exceptions5_thrower obj =new Exceptions5_thrower();


        try {
            Exceptions5_thrower.divide();
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }catch (InputMismatchException e){
            System.out.println("uyumsuz veri girisi yaptiniz");
        }catch (Exception e){
            System.out.println(" lütfen bilgilerini kontrol edin");
        }


    }




}
