
package com.laurensiaelisabethangela.praktikumpbo.pertemuan5;


public class Array2 {
    public static void main(String[] args) {
        //pembuatan array
         String[] names = {
         "Rain",
         "Thunder",
          "Storm"
         };
         
         //cek panjang array
         System.out.println("Panjang array: " + names.length);
         
         
         
         //Menampilkan semua nilai array
         for(int i=0; i<names.length; i++){
             System.out.println(i + ": " + names[i]);
         }
         
    }
}
