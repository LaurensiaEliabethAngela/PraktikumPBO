
package UTS_NO2_S1SI05B_3053;


public class projectPlanner {
    public class ProjectPlaner extends Employer
{
    double uangmakan_3053;
    double tunjangankinerja;
    double tunjanganjabatan;
 
    public ProjectPlaner()
    {
        jabatan_3053="project planner";
        uangmakan_3053=500000.0;
        tunjangankinerja=500000.0;
        tunjanganjabatan=1000000.0;
    }
 
    public double perhitungangaji()
    {
        double potongan;
        gajikotor_3053=gajipokok_3053+uangmakan_3053+tunjangankinerja+tunjanganjabatan;
        potongan=(15.0/100.0)*gajikotor_3053;
        gajibersih_3053=gajikotor_3053-potongan;
     
        System.out.println ("Gaji Pokok : " +gajipokok_3053);
        System.out.println ("Uang Makan : " +uangmakan_3053);
        System.out.println ("Tunjangan Kinerja : " +tunjangankinerja);
        System.out.println ("Tunjangan Jabatan : " +tunjanganjabatan);      
        System.out.println ("Gaji Kotor : " +gajikotor_3053);
        System.out.println ("Potongan : " +potongan);
        System.out.println ("Gaji Bersih : " +gajibersih_3053);
     
        return gajibersih_3053;
    }
}
}
