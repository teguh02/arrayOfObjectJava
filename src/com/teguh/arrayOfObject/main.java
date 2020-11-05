package com.teguh.arrayOfObject;
import com.teguh.arrayOfObject.Konohagakure;

/**
 * Coded by Teguh Rijanandi
 * NIM 19104008
 * Institut Teknologi Telkom Purwokerto
 *
 * Array of object in java
 */

public class main {

    /**
     * Main class
     * @param args
     */
    public static void main(String[] args) {
        Konohagakure[] k = new Konohagakure[3];

        // membentuk data objek
        k[0] = new Konohagakure();
        k[0].setNoRegistrasi(012606);
        k[0].setNama("Uchiha Sasuke");
        k[0].setPeringkat("Genin");

        // buat data objek index selanjutnya
        k[1] = new Konohagakure();
        k[1].setNoRegistrasi(012607);
        k[1].setNama("Uzumaki Naruto");
        k[1].setPeringkat("Genin");

        // buat data objek index terakhir
        k[2] = new Konohagakure();
        k[2].setNoRegistrasi(012601);
        k[2].setNama("Haruno Sakura");
        k[2].setPeringkat("Chunin");
        
        // print data objek menggunakan bantuan foreach
        // Nb. for jika bentuknya seperti ini dinamakan foreach

        for (Konohagakure data:k) {
            System.out.println("Nomor Registrasi" + data.getNoRegistrasi());
            System.out.println("Nama " + data.getNama());
            System.out.println("Peringkat " + data.getPeringkat());
            System.out.print("\n");
        }
    }

}
