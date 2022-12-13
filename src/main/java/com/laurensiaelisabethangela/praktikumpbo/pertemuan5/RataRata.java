
package com.laurensiaelisabethangela.praktikumpbo.pertemuan5;


public class RataRata {
           
//        nilai 1
        protected int nilai1;
        public void setnilai1(int n1)
        {
            nilai1 = n1;
        }public int getnilai1()
        {
            return(nilai1);
        }
       
        //      nilai 2
        protected int nilai2;
        public void setnilai2(int n2)
        {
            nilai2 = n2;
        }public int getnilai2()
        {
            return(nilai2);
        }
       
        //      nilai 3
        protected int nilai3;
        public void setnilai3(int n3)
        {
            nilai3 = n3;
        }public int getnilai3()
        {
            return(nilai3);
        }
       
        //      Jumlah
        public double getJumlah()
        {
            return(nilai1+nilai2+nilai3);
        }
       
        //      Rata-rata
        public double getratarata()
        {
            return((nilai1+nilai2+nilai3)/3);
        }
        
        public static void main(String[] args) {
        // TODO code application logic here
        RataRata isi = new RataRata();
        
        isi.setnilai1(100);
        isi.setnilai2(90);
        isi.setnilai3(80);
        
        System.out.println(" APLIKASI MENGHITUNG NILAI RATA-RATA");
        System.out.println("====================================");
        System.out.println("Nilai 1    = "+isi.getnilai1());
        System.out.println("Nilai 1    = "+isi.getnilai2());
        System.out.println("Nilai 1    = "+isi.getnilai3());
        System.out.println("====================================");
        System.out.println("JUMLAH        = "+isi.getJumlah());
        System.out.println("RATA - RATA   = "+isi.getratarata());
        
    }
    
}

    




