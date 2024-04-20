package Day033SubstringFreeUbung;

public class C02_Palindrome_method {
    public static void main(String[] args) {


        //  Schreiben Sie eine Methode, die einen String als Parameter akzeptiert und prüft,
        //  ob der String ein Palindrom ist (d.h. ob er vorwärts und rückwärts gelesen dasselbe ergibt).
        // Verwenden Sie dabei die substring-Methode.
        System.out.println(isPalindrome("madamMadam"));


    }







    public static boolean isPalindrome (String str) {

        String rts ="";


        for (int i = str.length()-1 ; i >0 ; i--) {
            rts += str.charAt(i);

        }if (str.equalsIgnoreCase(rts)){
            return true;
        }else {
            return false;
        }



    }
}
