
package com.laurensiaelisabethangela.praktikumpbo.pertemuan4.Tugas;


public class Elektronik {
    //Attribute (Variable)
    String nama;
    int jmlAplikasi;
    
    //Method (Fungsi)
    public void nyalakanHp (){
        System.out.println("Power" + nama + "'telah dinyalakan!");
    }
    
    public void showInfo (){
        System.out.println("Nama     : " + nama);
        System.out.println("Jml Aplikasi : " + jmlAplikasi);
        extraInfo ();
    }
    
    public void extraInfo (){}
    
}
