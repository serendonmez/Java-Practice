package SundaysJavaPractice;
import java.util.Random;
import java.util.Scanner;
public class C21_OyunSayiTahmin {
    public static void main(String[] args) {

        /* BILGISAYAR 0-100 ARASINDA BIR SAYI TUTUP, KULLANICIDAN TAHMIN ISTER
ve KULLANICI SAYIYI BULANA KADAR "DAHA KUCUK VEYA DAHA BUYUK SAYI SÖYLE" DIYE YOL GOSTERIR
BULUNCA KACINCI TAHMINDE BULDUGUNU YAZAR
*/
        Random random = new Random();
        int bilgisayarinSayiyi= random.nextInt(100);
        System.out.println(" Hosgeldiniz, hadi oyun oynayalim!");
        System.out.println("0 ile 100 arasinda bir sayi tuttum, haydi bir sayi yazarak tahmin et :)");
        //System.out.println(bilgisayarinSayiyi);
        Scanner scan=new Scanner(System.in);
        int kullaniciSayisi;
        int count=1;
        do {
            kullaniciSayisi=scan.nextInt();
            if (kullaniciSayisi>bilgisayarinSayiyi){
                System.out.println("Daha kucuk bir sayi tahmin etmelisin");
            } else if (kullaniciSayisi<bilgisayarinSayiyi) {
                System.out.println("Daha buyuk sayi tahmin etmelisin");
            }else {
                System.out.println("Tebrikleeeerrrr!!!   "+ count+ ". tahminde bildiniz!");
            }
            count++;
        }
        while (kullaniciSayisi!=bilgisayarinSayiyi);
    }






    }

