package ZZZ_JavaExercise;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class C06Iterator {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(12);
        list1.add(98);
        list1.add(102);
        list1.add(45);


        Iterator iterator= list1.iterator();// [ (| -> iterator is here) 12, 98 , 102 , 45 ]

        Integer sayi= (Integer) iterator.next(); // [ 12, ( | iterator is here ) 98 , 102, 45]
        System.out.println(sayi);  // 12

        Integer x= (Integer) iterator.next();
        if (x % 2 != 0){
            iterator.remove();
        }


        ArrayList<String> list2 = new ArrayList<>();
        list2.add("siyah");
        list2.add("beyaz");
        list2.add("kirmizi");
        list2.add("mavi");

        Iterator iterator1 = list2.iterator();

        System.out.println(list2); // [ (|  )siyah, beyaz, kirmizi, mavi]

        String str= (String) iterator1.next(); // [siyah, (|)  beyaz, kirmizi, mavi]
        System.out.println("123");
        System.out.println(str); // siyah
        str = (String) iterator1.next();
        System.out.println(str); //beyaz

        System.out.println(iterator1.hasNext()); //true
        str= (String) iterator1.next(); //[siyah,  beyaz,  (|)  kirmizi, mavi]
        System.out.println(str); //kirmizi
        iterator1.remove();
        System.out.println(list2); //[siyah, beyaz, mavi]
        // str a her yeni deger atamasinda cast etmek zorunda kaldik

        // cünkü;
        // iteratorler sadece object return ve store ederler
        // bu nedenle ArrayList icindeki data türünü cast etmemiz gerekir
        // burada type parametre kullanmak daha dogrudur


        ArrayList<String> list3 = new ArrayList<>();
        list3.add("sari");
        list3.add("yesil");
        list3.add("turuncu");
        list3.add("mor");



        Iterator<String> iterator3= list3.iterator(); // [ ( | ) sari, yesil, turuncu, mor]
        String str2 = iterator3.next(); // [sari, (|) yesil, turuncu, mor]
        System.out.println(str2); // sari
        str2= iterator3.next();  //  [sari, yesil,  (|) turuncu, mor]
        System.out.println(str2); //yesil
        iterator3.remove(); // yesili remove etti
        System.out.println(list3); // [sari, turuncu, mor]





  //      System.out.println(iterator3.hasNext());  //true
  //      str2 = iterator3.next();
  //      System.out.println(str2); //turuncu
  //      System.out.println(iterator3.hasNext()); //true
  //      str2 = iterator3.next();
  //      System.out.println(str2); //mor
  //      System.out.println(iterator3.hasNext()); //false



        // eger her element icin bu islemi tek tek yazmak istemezsek
        // bir while loop kullanabiliriz



        while (iterator3.hasNext()){

            str2= iterator3.next();
            System.out.println(str2); // turuncu  // mor
        }



        List<String> namen= new ArrayList<>(Arrays.asList("Dieter","Anna","Robet","Susi"));

        System.out.println("listin uzunlugu:"+namen.size());

        // iterator bize list ya da Arrayin methodu gibi iterator sunar.

        Iterator<String> iterator2 = namen.iterator();

        while(iterator2.hasNext()){ // [  | Dieter, Anna, Robet ,Susi]
            String siradakiIsim = iterator2.next(); //[  Dieter,  | Anna, Robet ,Susi ]
            System.out.println("name : "+siradakiIsim);
        }





    }
}
