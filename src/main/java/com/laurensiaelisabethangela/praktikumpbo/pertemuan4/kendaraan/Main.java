
package com.laurensiaelisabethangela.praktikumpbo.pertemuan4.kendaraan;


public class Main {
    public static void main(String[] args) {
        //Class object = new class ()
        Mobil mb = new Mobil ();
        Kendaraan kn = new Kendaraan();
        
        //Memasukan nilai attribute
        mb.nama = "Daihatsu";
        mb.jmlRoda =4;
        mb.maxGear = 6;
        
        kn.nama = "Kendaraan misterius";
        kn.jmlRoda = 3;
        
        
        //Uji coba pemanggil method
        mb.showInfo();
        mb.belok("kanan");
        
       kn.showInfo();
    }
    
}
