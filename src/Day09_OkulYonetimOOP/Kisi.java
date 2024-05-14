package Day09_OkulYonetimOOP;

public class Kisi {

    //Ad,Soyad, Tc kimlik No, yaş


    // 1. private olarak vari olustur
    //2. parametreli constructor olustur ( ölen p siz Const yeniden olusturulur
    //3. getter setter ayarlanir
    //4. toString() ile bilgiler yazdirilir


    private String ad;
    private String soyad;
    private String tcNum;
    private int yas;

    protected Kisi(String ad, String soyad, String tcNum, int yas) {
        this.ad = ad;
        this.soyad = soyad;
        this.tcNum = tcNum;
        this.yas = yas;
    }


    public Kisi() {
    }


    protected String getAd() {
        return ad;
    }

    protected void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getTcNum() {
        return tcNum;
    }

    public void setTcNum(String tcNum) {
        this.tcNum = tcNum;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }


    @Override
    public String toString() {
        return "\n\nKisi Bilgisi :" +"\n"+
                "Adi :" + ad + " "+ "\n"+
                "Soyad : " + soyad + " \n"+
                "TCKN:" + tcNum + " \n"+
                "Yasi:" + yas +"\n";

    }
}
