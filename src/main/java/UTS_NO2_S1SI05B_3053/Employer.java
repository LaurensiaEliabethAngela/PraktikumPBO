
package UTS_NO2_S1SI05B_3053;


public abstract class Employer {
    
    String nama;
    String jabatan_3053;
    double gajibersih_3053;
    double gajikotor_3053;
    double gajipokok_3053;
    double uangmakan_3053;
 
    public Employer()
    {
        gajipokok_3053=1500000.0;
    }
 
    public void setNama (String name)
    {
        this.nama=name;
    }
 
    public String getNama()
    {
        System.out.println ("Nama Karyawan : " +nama);
        return nama;
    }
 
    public String jabatan_3053()
    {
        System.out.println ("Posisi Jabatan : " +jabatan_3053);
        return jabatan_3053;
    }
 
    public abstract double perhitungangaji();
 
}

