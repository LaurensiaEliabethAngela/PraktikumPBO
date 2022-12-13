
package com.laurensiaelisabethangela.praktikumpbo.pertemuan6.tugas;


public class ClassNotFound {  
   public static void main(String[] args) {
       try {
           Class.forName("nama");
       }
       catch(ClassNotFoundException e){
           System.out.println(e);
           System.out.println("Class tidak dapat ditemukan");
       }
   }
}
