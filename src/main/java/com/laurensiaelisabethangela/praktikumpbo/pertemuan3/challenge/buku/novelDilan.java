
package com.laurensiaelisabethangela.praktikumpbo.pertemuan3.challenge.buku;


public class novelDilan {
    private String namaPenerbit;
    private int jumlahHalaman;
    private int tahunTerbit;
    private String namaPengarang;

    public novelDilan(String namaPenerbit, int jumlahHalaman, int tahunTerbit, String namaPengarang) {
        this.namaPenerbit = namaPenerbit;
        this.jumlahHalaman = jumlahHalaman;
        this.tahunTerbit = tahunTerbit;
        this.namaPengarang = namaPengarang;
    }
    
     
    public String getNamaPenerbit(){
        return namaPenerbit;
    }
    public void setNamaPenerbit(){
        this.namaPenerbit = namaPenerbit;
    }
    public int getJumlahHalaman(){
        return jumlahHalaman;
    }
    public void setJumlahHalaman(){
        this.jumlahHalaman = jumlahHalaman;
    }
    public int getTahunTerbit(){
        return tahunTerbit;
    }
    public void setTahunTerbit(int tahunTerbit){
       this.tahunTerbit = tahunTerbit;
    }
    public String getNamaPengarang(){
        return namaPengarang;
    }
    public void setNamaPengarang(String namaPengarang){
        this.namaPengarang = namaPengarang;
    }
    public void showProfile (){
        System.out.println("Nama         : " + namaPenerbit);
        System.out.println("Halaman      : " + jumlahHalaman);
        System.out.println("Tahun Terbit : " + tahunTerbit);
        System.out.println("Pengarang    : " + namaPengarang);
      }
    }
