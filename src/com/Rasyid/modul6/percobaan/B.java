package com.Rasyid.modul6.percobaan;

public class B extends A {
    // Atribut tambahan integer z
    private int z;

    // Setter Z
    public void setZ(int z) {
        this.z = z;
    }

    /*
     * X dan Y tidak bisa diakses karena Access Modifiernya private pada kelas A
     * Ketika atribut pada kelas A diubah Access Modifiernya menjadi protected, maka
     * sudah bisa diakses pada kelas B
     */
    public void getJumlah() {
        System.out.println("Jumlah : " + (x + y + z));
    }
}
