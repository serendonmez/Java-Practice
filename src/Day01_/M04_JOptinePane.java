package Day01_;

import javax.swing.*;

public class M04_JOptinePane {
    public static void main(String[] args) { // ekranda yeni pencere acarak veri isteme




       String name= JOptionPane.showInputDialog("Lütfen isminizi giriniz");
       String surname = JOptionPane.showInputDialog("Lütfen soyisminizi girin");

        String ageSTR= JOptionPane.showInputDialog( "Lütfen yasinizi giriniz"); // burda yasi String olarak yazdik
        // ancak yasla hesaplama yapacaksak stringi int e cevirmeliyiz
        int age=Integer.parseInt(ageSTR); // string yas variable ile int yas variable e farkli olmali
                                            // biri metin biri sayi

        String mail = JOptionPane.showInputDialog("Lütfen mail adresinizi giriniz");
        String pass = JOptionPane.showInputDialog("Lütfen sifrenizi giriniz");
        JOptionPane.showMessageDialog(null,"Isim:"+name+
                "\nSoyisim: "+surname+ "\nYas"+age+  "\nMail adresi"+mail+ "\nsifre"+pass+
                "\nseklinde kaydiniz basariyla olusturulmustur.");

        /*note to myself : showinputdialog : scanner gini calisiyor kullanicidan veriyi aldigin yer
        showMessageDialog kullanicinin girdigi bilgileri kullaniciya toplu sekilde tekrar gösterildigi yer


         */

     //  JOptionPane.showMessageDialog(null, "Sayin "+name+" "+ surname+ "\nHosgeldiniz");
      //  JOptionPane.showMessageDialog(null, mail+" Adresine ait sifrenizi Kontrol ediniz");

























    }
}
