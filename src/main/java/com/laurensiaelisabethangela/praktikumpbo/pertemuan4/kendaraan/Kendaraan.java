
package com.laurensiaelisabethangela.praktikumpbo.pertemuan4.kendaraan;


public class Kendaraan {
    
    //Attribute (Variable)
    String nama;
    int jmlRoda;
    
    //Method (Fungsi)
    public void nyalakanMesin (){
        System.out.println("Mesin" + nama + "'telah dinyalakan!");
    }
    
    public void showInfo (){
        System.out.println("Nama     : " + nama);
        System.out.println("Jml roda : " + jmlRoda);
        extraInfo ();
    }
    
    public void extraInfo (){}
    
}
