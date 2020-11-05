package com.teguh.arrayOfObject;

/**
 * Coded by Teguh Rijanandi
 * NIM 19104008
 * Institut Teknologi Telkom Purwokerto
 *
 * Array of object in java
 */

public class Konohagakure {

    // initialize all variable
    protected String noRegistrasi;
    protected String nama;
    protected String peringkat;

    /**
     * To get Nomor Registrasi
     * @return
     */
    public String getNoRegistrasi() {
        return noRegistrasi;
    }

    /**
     * To set Nomor Registrasi
     * @param noRegistrasi
     */
    public void setNoRegistrasi(String noRegistrasi) {
        this.noRegistrasi = noRegistrasi;
    }

    /**
     * To get Nama
     * @return
     */
    public String getNama() {
        return nama;
    }

    /**
     * To set Nama
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * To get Peringkat
     * @return
     */
    public String getPeringkat() {
        return peringkat;
    }

    /**
     * To set Peringkat
     * @return
     */
    public void setPeringkat(String peringkat) {
        this.peringkat = peringkat;
    }
}
