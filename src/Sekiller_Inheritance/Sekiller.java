package Sekiller_Inheritance;

public class Sekiller {
        /*
   Cember, dikdortgen ve kare sekillerinin alan ve cevre hesaplamasi yapan bir uygulama gelistiriniz.
   1-asagidaki hiyarasiye gore classlar creat ediniz...
       Sekil class(parent) <--Cember class(child)
       Sekil class(parent) <--Dikdortgen class(child)<--Kare class(child)
   2- Classlara uygun olacak sekilde yaricap, uzunluk ve genislik veriable'ler ekleyiniz.
   3- Cember Dikdortgen Karenin alan ve cevre hesaplamalarini yaptirip sonuclari Runner classta yazdiriniz.

*/


    double yariCap;
    double kenar1;
    double kenar2;


    public Sekiller(double uzunKenar, double kisaKenar) {
        this.kenar1 = kenar1;
        this.kenar2 = kenar2;


    }

    public Sekiller(double yariCap) {
        this.yariCap = yariCap;
    }


    double cemberCevreHesaplama(double yariCap){
        return 2*yariCap*Math.PI;
    }

    double cemberAlanHesaplama (double yariCap){
        return Math.PI*yariCap*yariCap;
    }

    double cevreHesaplama( double kenar1, double kenar2){
        return 2*(kenar1+kenar2);
    }
    double alanHesapla ( double kenar1, double kenar2){
         return kenar2*kenar1;
    }
}
