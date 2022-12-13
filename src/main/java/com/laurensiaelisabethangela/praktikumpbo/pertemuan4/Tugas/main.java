
package com.laurensiaelisabethangela.praktikumpbo.pertemuan4.Tugas;


public class main {
     public static void main(String[] args) {
        //Class object = new class ()
        Hp ia= new Hp ();
        Elektronik kn = new Elektronik();
        
        //Memasukan nilai attribute
        ia.nama = "Samsung";
        ia.jmlAplikasi =15;
       
        
        kn.nama = "elektronik misterius";
        kn.jmlAplikasi = 12;
        
        
        //Uji coba pemanggil method
       ia.showInfo();
       
        
       kn.showInfo();
    }

}
