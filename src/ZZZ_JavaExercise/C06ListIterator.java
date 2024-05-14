package ZZZ_JavaExercise;

import java.util.*;

public class C06ListIterator {
    public static void main(String[] args) {
        /*
        ListIterator ile ilgili dikkat edilecekler
        1- lit her lit.next(); gordugunde
           iterator'i bir saga goturur,
           islem hatasi yapmamak icin while loop icerisinde
           sadece 1 kere lit.next(); kullanilmalidir

        2- iterator biz soylemedikce hareket etmez,
           biz nerede birakirsak orada bizi bekler

           biz bir isleme baslamadan once
           iterator'in yerini belirlemeli,
           eger istedigimiz yerde degilse,
           istedigimiz yere gondermeliyiz
     */


        List<Integer> list= new ArrayList<>(Arrays.asList(4,5,9,6,3,2,1));

        System.out.println(list);






     ListIterator<Integer> lit= list.listIterator();


// index kullanmadan  cift sayilari yok ettik

     while(lit.hasNext()){

         Integer sayi= lit.next();

         if (sayi%2 ==0){

             lit.remove();


         }
     }
        System.out.println(list); // 5 9 3 1 |



        // en son durumda | iterator en sonda kaldi

        while( lit.hasPrevious()){
            lit.previous();
        }

        System.out.println(list); // [ |  5, 9, 3, 1]



        // index kullanmadan listedeki cift sayilari 2
        // tek sayilari 1 arttir.

        lit.add(22);
        lit.add(8);
        lit.add(34);
        System.out.println(list); //[22, 8, 34, | 5, 9, 3, 1]

        // listenin basindan add yaptigimiz icin intrator 5 ten önce kaldi
        // tekrar en basa alalim

        while (lit.hasPrevious()){
            lit.previous();
        }

        System.out.println(list);  //[  | 22, 8, 34, 5, 9, 3, 1]


        while(lit.hasNext()){ // [  | 22, 8, 34, 5, 9, 3, 1]


            Integer sayi= lit.next();
            if (sayi%2 ==0){
                lit.set(sayi+2);

            }else {
                lit.set(sayi+1);
            }
        }
        System.out.println(list);

















    }
}
