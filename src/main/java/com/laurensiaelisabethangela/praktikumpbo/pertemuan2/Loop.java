
package com.laurensiaelisabethangela.praktikumpbo.pertemuan2;


public class Loop {
    public static void main(String[] args) {
        for (int i=0; i<5.; i++) {
         System.out.println("Looping...(" + i + "/5)");
        }
        System.out.println("For loop selesai ! \n");
        
        // -- While --
        int j=0;
        while(j<5) {
            System.out.println("Looping...(" + j + "/5)");
            j++;
        }
        System.out.println("While loop selesai! \n");
        
        // -- Do While --
        int k=0;
        do { 
            System.out.println("Looping...(" + k + "/5)");
            k++;
            
        } while (k<5);
        System.out.println("Do-While loop selesai1 \n");
        }
    }

