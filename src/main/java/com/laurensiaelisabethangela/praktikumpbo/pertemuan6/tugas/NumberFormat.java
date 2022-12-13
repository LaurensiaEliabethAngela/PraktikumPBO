
package com.laurensiaelisabethangela.praktikumpbo.pertemuan6.tugas;


public class NumberFormat {
    public static void main(String[] args) {
        try{
            int angka = Integer.parseInt("Saya");
            
            System.out.println(angka);
        }
        catch(NumberFormatException e){
            System.out.println(e);
            System.out.println("Tidak dapat Melakukan Casting");
        }
    }
}
