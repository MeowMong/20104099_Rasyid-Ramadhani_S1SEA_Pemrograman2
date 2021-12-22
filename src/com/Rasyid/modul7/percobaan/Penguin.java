package com.Rasyid.modul7.percobaan;

public class Penguin extends Burung {
    // Anotasi yang digunakan untuk memberitahu compiler bahwa method tersebut akan
    // di override
    @Override
    public void terbang() {
        System.out.println("Aku tidak bisa terbang");
    }
    /*
     * Ciri ciri Overriding - Nama method harus sama - Parameternya sama
     */
}
