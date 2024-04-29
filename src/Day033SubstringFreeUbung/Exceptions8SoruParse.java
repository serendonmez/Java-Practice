package Day033SubstringFreeUbung;

public class Exceptions8SoruParse {

    public static void main(String[] args) {
        String name="seren";



        try {
            System.out.println("2");
            int x= Integer.parseInt(name);
            System.out.println("3");
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }
    }

}
