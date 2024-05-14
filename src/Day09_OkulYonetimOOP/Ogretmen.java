package Day09_OkulYonetimOOP;

public class Ogretmen extends  Kisi{

    //Öğretmen: Ad,Soyad, Tc kimlik No, yaş, bölüm, ve sicil No bilgileri içermelidir.

    private String bolum ;

    private int sicilNo;

    public Ogretmen(String ad, String soyad, String tcNum, int yas, String bolum, int sicilNo) {
        super(ad, soyad, tcNum, yas);  // bu classta tanimlanmayan bu vari ler parenttan gelecek
        this.bolum = bolum;
        this.sicilNo = sicilNo;
    }

    public Ogretmen() {
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public int getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(int sicilNo) {
        this.sicilNo = sicilNo;
    }

    @Override
    public String toString() {
        return "Ogretmen :" + super.toString()+ // super classtan alinanlar buraya eklensin
                "bolum: " + bolum +
                "\nsicilNo: " + sicilNo ;


    }
}
