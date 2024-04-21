package Day033SubstringFreeUbung;

public class CharacterChar {

    public static void main(String[] args) {
        char ch1;
        char ch2='a';

        char ch3= (char)65; // int  degeri chara cast ettik


        // char to ASCII
        char ch4= 'A';
        int n= (int)ch4;
        // ASCII to char
        int i=97;
        char ch5= (char)i;

        // uppercase to Lowercase

        char ch6='B';
        ch6+=32;
        System.out.println(ch6);

        // 66+32=98

        //Lowercase to Uppercase
        char ch7='a';
        ch7-=32;
        System.out.println(ch7);


            char ch8='A';
            ch8++;
        System.out.println(ch8);

        // escape sequences

        // \'
        // \""

        // character Methods
     Character ch9= 'a';
     // isLetter

        System.out.println(Character.isLetter('5')); // flase
        System.out.println(Character.isLetter((char)65)); /// true A
        // isDigit
        System.out.println(Character.isDigit((char)49));
        System.out.println(Character.isDigit((char)'c'));
        System.out.println(Character.isDigit((char)'5'));

        // isWhiteSpace --> white space is not just space character

        System.out.println(Character.isWhitespace('\t')); // true


        // toLowerCase toUppercase

        char g= 'w';
        g-=32;
        System.out.println(g);


        System.out.println(Character.toUpperCase('e'));
        System.out.println(Character.toLowerCase((char)79));
        System.out.println((char)97); // a

        // toString

        String str = Character.toString('Y');
        System.out.println(str);





    }
}
