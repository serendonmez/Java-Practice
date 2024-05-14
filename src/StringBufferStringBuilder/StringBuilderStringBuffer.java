package StringBufferStringBuilder;

public class StringBuilderStringBuffer {
    public static void main(String[] args) {


        //  String is immutable
        String s = "purple";
        String s1 = "purple";

        s = s + " white";

        System.out.println(s); // purple white
        // String bir degeri mutable yapmak icin Stringbuffer ya da builder kullaniriz

       StringBuffer sb= new StringBuffer("Orange");
        System.out.println(sb.capacity());// 16 -> bossa
        System.out.println(sb.length());  //0

        StringBuffer sb1= new StringBuffer("Orange");
        System.out.println(sb1.capacity());// 16 + 6 ->22
        System.out.println(sb1.length()); // 6
        System.out.println(sb1.append("-white")); //Orange-white
        System.out.println(sb1.reverse()); //etihw-egnarO
        System.out.println(sb1.capacity()); //22
        System.out.println(sb1.length()); //12
        sb1.trimToSize(); //        // kapasiteyi lengt'e indirger
        // trimToSize dan sonra capacity = length

        System.out.println(sb1.capacity()); //12
        System.out.println(sb1.append(" "+s));
        String str1 = sb1.toString(); // StringBuffer i to String ile string yapabiliriz.
        System.out.println(str1); //etihw-egnarO purple white
        System.out.println(sb1.delete(0, 13)); // purple white (etihw-egnarO ) sildik
        boolean isHere=true;
       sb1.insert(0, isHere+" "); // true purple white
        // insert: bir elementi ya da degeri sonradan araya koymak icin kullanilir.
        System.out.println(sb1); //true purple white
        // insert le islem yapinca sb1 in yeni degeri olusturdugumuz deger olur
        // yazdirmasak da insert islemi kalicidir


        System.out.println(sb1.substring(4, 9));// purp
        // substring ile baslangic indexten son index e kadar elde edebiliriz.
        // ancak yeni variable in yeni degeri ne atayamayiz
        // sb1 i yazdirinca da eski degerini verecektir
        System.out.println(sb1);  //true purple white



        sb1.setLength(2);
        System.out.println(sb1.length()); // lenght : 2

        System.out.println(sb1); //tr

        sb1.deleteCharAt(0);
        System.out.println(sb1); // r


        sb1.append("ichard, Emil");
        System.out.println(sb1); //richard, Emil

        sb1.setCharAt(0,'R');
        System.out.println(sb1); // Richard, Emil

        sb1.subSequence(2,6);
        System.out.println(sb1); //Richard, Emil


        System.out.println(sb1.substring(8, 13)); // Emil
        System.out.println(sb1); //Richard, Emil


        sb1.setLength(5);
        System.out.println(sb1); //Richa
        System.out.println("444");
        // StringBuffer methodlarinda  sb1 in degerini methodlarla her seferinde degistirdik
        // / Sub -String-CharAt-Sequence haric ) sub methodlari kalici degisiklik yapmaz




        String h= "HaSan";
        System.out.println(h.toLowerCase()); //hasan
        System.out.println(h); // HaSan
        System.out.println(h.concat(str1)); //HaSanetihw-egnarO purple white
        System.out.println(h); //HaSan

        // String de ise String buffer ve Builder a göre kullanilan methodlarla degismedi

        // buffer ve builder arasindaki fark : String buffer is Thread safe String builder not








    }

}
