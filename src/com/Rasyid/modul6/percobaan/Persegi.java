package com.Rasyid.modul6.percobaan;

public class Persegi extends Bentuk {
    /*
     * Class Persegi mewarisi bentuk dari Class Bentuk. Program ini menggunakan
     * konsep inheritance Persegi adalah subClass dan Bentuk adalah SuperClass
     */
    protected int p, l;

    // super untuk dari class Bentuk
    // Merujuk pada member dari parent class
    public void setSuperP(int p) {
        super.p = p;
    }

    public void setSuperL(int l) {
        super.l = l;
    }

    // this untuk sesama class / memanggil dari class sendiri
    // Merujuk pada member dari class itu sendiri (Persegi)
    public void setP(int p) {
        this.p = p;
    }

    public void setL(int l) {
        this.l = l;
    }

    public void getLuas() {
        System.out.println("Luas Super\t: " + (super.p * super.l));
        System.out.println("Luas\t: " + (this.p * this.l));

    }
}