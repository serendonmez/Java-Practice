package Day07_Arrays;

public class C04_Constructor {

    /*
    Bir müşteri sınıfı oluşturduk. Müşterinin özelliklerini oluşturalım

     */

    String name;
    String surName;
    String eMail;
    String phoneNumber;


    public C04_Constructor(){

        name="Bilinmiyor";
        surName="Bilinmiyor";
        eMail="Bilinmiyor";
        phoneNumber="Bilinmiyor";
    }


    public C04_Constructor(String name, String surName, String eMail, String phoneNumber){



        this.name=name;
        this.surName=surName;
        this.eMail=eMail;
        this.phoneNumber=phoneNumber;

    }

    public void bilgileriYazdir(){


        System.out.println("müsteri bilgileri ");
        System.out.println("Adi:"+name);
        System.out.println("soyadi: "+surName);
        System.out.println("e maili: "+eMail);
        System.out.println("telefonu : "+phoneNumber);
    }

    public static void main(String[] args) {
        C04_Constructor obj = new C04_Constructor();


        obj.bilgileriYazdir();
        System.out.println("----------------");

        C04_Constructor obj2=new C04_Constructor("Ali","Yilmaz","yilmaz@gmail.com",
                "1234");

                    obj2.bilgileriYazdir();    }


}
