package Day09_OkulYonetimOOP;

public class Ogrenci extends Kisi{

    private int ogrNum;
    private int sinif;


    public Ogrenci(String ad, String soyad, String tcNum, int yas, int ogrNum, int sinif) {
        super(ad, soyad, tcNum, yas);
        this.ogrNum = ogrNum;
        this.sinif = sinif;
    }


    public Ogrenci() {
    }

    @Override
    public String toString() {
        return super.toString()+
                "ogrenci Numarasi : " + ogrNum + " \n"+
                "sinifi : " + sinif ;
    }
}
