
package com.laurensiaelisabethangela.praktikumpbo.pertemuan3.challenge;


public class main {
    public static void main(String[]args) {
        library umum  = new library ("Dinas arsip dan perpustakaan daerah Banyumas", 120, 2001);
        library nasional = new library ("Perpustakaan Smansa", 200, 2002);
        library sekolah = new library ("perpustakaan Smansa",150, 2003);
        
        umum.showProfile();
        nasional.showProfile();
        sekolah.showProfile();
    }
}
