
package com.laurensiaelisabethangela.praktikumpbo.pertemuan6;

import java.util.InputMismatchException;
import java.util.Scanner;


public class MultiException {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        try {
            System.out.print("Masukan bilangan: ");
            int bilangan = input.nextInt();
            
            System.out.print("Masukan pembagi: ");
            int pembagi = input.nextInt();
            
            int hasil = bilangan / pembagi;
            
            System.out.println("Hasil pembagian(dibulatkan: "+hasil);
        }
        
        catch(ArithmeticException e) {
            System.out.println("Bilangan Tidak bisa dibagi");
        }
        
        catch(InputMismatchException e) {
            System.out.println("Harap masukan angka saja!");
        }
    }
}
