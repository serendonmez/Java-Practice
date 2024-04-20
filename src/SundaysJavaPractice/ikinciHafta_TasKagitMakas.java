package SundaysJavaPractice;

import java.util.Random;
import java.util.Scanner;


public class ikinciHafta_TasKagitMakas {
    static Scanner scan = new Scanner(System.in);
    static Random random = new Random();
    static int pcSecimi, kullaniciSecimi;
    static int pcScore=0;
    static  int kullaniciScore, el =0;
    public static void main(String[] args) {
        /*
    Bilgisayar ile "tas kagit makas oyunu" oynayiniz.
    Kullanici secimini;
    Tas icin 1,
    Kagit icin 2,
    Makas icin 3    yazarak belirtir.
    Kullanici tahminini yazar, sonra bilgisayarin tahminine göre o elin kazanani belli olur.
    5 kez oynadiktan sonra, asagidaki kurallara göre en fazla kazanan, oyunun galibi olur.

    Taş makası kırar
    Kâğıt taşı sarar
    Makas kağıdı keser
     */



        // bilgisayarin random secimi icin oyunlarda kullaniyoruz.
       // int pcSecimi = random.nextInt(3) + 1; // burada pc ye random secim yaptirirken aralik vermelyiz (bound)
        // 1-2-3 secenekleri girmeliyiz. --> javada bütün indexler gibi bound un indexi de 0 dan baslar
        // bu yüzden (+1) ile 1-2-3 ü elde ederiz.


               oyun();


    }

    public static void oyun (){
        el=el+1;
        System.out.println(el+". el");

        System.out.println(" secim yapin \n\t1-Tas \n\t2-Kagit \n\t3-makas");
        kullaniciSecimi= scan.nextInt();



        pcSecimi= random.nextInt(3)+1;


        switch (kullaniciSecimi) {
            case 1:
                System.out.println("Kullanici secimi : tas");
                if (pcSecimi==1){
                    System.out.println(" pc nin secimi : tas ");
                    System.out.println(" Kullanici "+kullaniciScore +"pc : "+pcScore);


                } else if (pcSecimi==2) {
                    System.out.println(" pcnin secimi kagit");
                    pcScore=pcScore+1;
                    System.out.println(" kullanicii :"+kullaniciScore+" Pc: "+pcScore);


                }else if ( pcSecimi==3  ){
                    System.out.println(" pcnin secimi makas");
                    kullaniciScore=kullaniciScore+1;
                    System.out.println("Kullanici : "+kullaniciScore+"pc :  "+pcScore);

                }
                if(el<5) {
                    oyun();
                }else {
                    System.out.println(" oyun bitti");
                }
                break;

            case 2:
                System.out.println(" kullanici secimi : kagit");
                if (pcSecimi==1){
                    System.out.println(" pcnin secimi tas ");
                    kullaniciScore=kullaniciScore+1;
                    System.out.println("kullanici : "+kullaniciScore+" pc:  "+pcScore);


                } else if (pcSecimi==2) {
                    System.out.println(" pcnin secimi kagit");

                    System.out.println("Kullanici "+kullaniciScore+" pc: "+pcScore);

                } else if (pcSecimi==3) {
                    System.out.println(" pcnin secimi makas");
                    pcScore+=1;
                    System.out.println("Kullanici "+kullaniciScore+" pc : "+pcScore);
                    System.out.println(" pc kazandi");

                }
                if(el<5) {
                    oyun();
                }else {
                    System.out.println(" oyun bitti");
                }
                break;
            case 3:
                System.out.println(" kullanici: makas");
                if (pcSecimi==1){
                    System.out.println(" pc nin secimi tas ");
                    pcScore=pcScore+1;
                    System.out.println("Kullanici "+kullaniciScore+" pc: "+pcScore);

                }else if (pcSecimi==2){
                    System.out.println("pc nin secimi kagit ");
                    kullaniciScore=kullaniciScore+1;
                    System.out.println("Kullanici : "+kullaniciScore+" pc:  "+pcScore);

                } else if (pcSecimi==3) {
                    System.out.println("pc nin secimi makas ");
                    System.out.println("Kullanici "+kullaniciScore+" pc:  "+pcScore);

                }
                if(el<5) {
                    oyun();
                }else {
                    System.out.println(" oyun bitti");
                }
                break;
            default:
                System.out.println(" yanlis giris yaptiniz");
                oyun();

        }






    }
}