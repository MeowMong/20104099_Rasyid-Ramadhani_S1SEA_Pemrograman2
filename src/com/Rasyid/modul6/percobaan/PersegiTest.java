package com.Rasyid.modul6.percobaan;

public class PersegiTest {
    public static void main(String[] args) {
        // Objek kotak dari class Persegi / Blueprint persegi
        Persegi kotak = new Persegi();

        // Memanggil untuk mengisi atribut/member SuperClass
        kotak.setSuperP(15);
        kotak.setSuperL(10);

        // Memanggil untuk mengisi atribut/member dari class persegi / SubClass.
        kotak.setP(3);
        kotak.setL(13);

        kotak.getLuas();
    }

}
