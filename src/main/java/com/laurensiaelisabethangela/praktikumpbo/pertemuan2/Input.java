
package com.laurensiaelisabethangela.praktikumpbo.pertemuan2;

import java.util.Scanner;


public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan nama: ");
        String nama = input.nextLine();
        
        System.out.print("Masukan usia :");
        int usia = input.nextInt();
        
        System.out.println("Nama saya: " + nama);
        System.out.println("Usia saya: " + usia + " tahun");
    }
}
