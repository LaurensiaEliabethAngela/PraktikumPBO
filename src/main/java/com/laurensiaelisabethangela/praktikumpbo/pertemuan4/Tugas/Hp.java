
package com.laurensiaelisabethangela.praktikumpbo.pertemuan4.Tugas;

public class Hp extends Elektronik{
    //nama
   int jmlAplikasi;
   
    
    public void Tekan(String nama){
        System.out.println("Hp " + nama + " masukan " + jmlAplikasi + "!");
     
    }
    public void tekan(){
        System.out.println("Error: Mohon masukan password!");
    }


    public void extraInfo(){
        System.out.println("jmlAplikasi :" + jmlAplikasi);
    }
  
    }
