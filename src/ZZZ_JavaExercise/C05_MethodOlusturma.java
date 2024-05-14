package ZZZ_JavaExercise;

public class C05_MethodOlusturma {

    //Schreiben Sie eine Methode, die zwei Strings als Parameter akzeptiert und
    // prüft, ob der zweite String eine Teilzeichenfolge des ersten Strings ist.
    // Verwenden Sie dazu die substring-Methode.

    public static void main(String[] args) {
        System.out.println(isSubstring("Süreyya","Yasemin"));


    }




    public static boolean isSubstring(String metin1, String metin2){

        if (metin1 == null || metin2 == null){
            return false;
        }

        for (int i = 0; i <=metin1.length()- metin2.length() ; i++) {
            if (metin1.substring(i,i + metin2.length()).equalsIgnoreCase(metin2)){
                return true;
            }


        }
        return false;

    }

}
