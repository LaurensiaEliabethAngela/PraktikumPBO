
package UTS_NO2_S1SI05B_3053;


public class commisionEmploye {
    public class CommisionEmployee extends Employer
{
    double uangmakan_3053;
 
    public CommisionEmployee()
    {
        jabatan_3053="Commision Employee";
        uangmakan_3053=500000.0;
    }
 
    @Override
    public double perhitungangaji()
    {
        double potongan;
        gajikotor_3053=gajipokok_3053+uangmakan_3053;
        potongan=(5.0/100.0)*gajikotor_3053;
        gajibersih_3053=gajikotor_3053-potongan;
     
        System.out.println ("Gaji Pokok : " +gajipokok_3053);
        System.out.println ("Uang Makan : " +uangmakan_3053);
        System.out.println ("Gaji Kotor : " +gajikotor_3053);
        System.out.println ("Potongan : " +potongan);
        System.out.println ("Gaji Bersih : " +gajibersih_3053);
     
        return gajibersih_3053;
    }
}
}
