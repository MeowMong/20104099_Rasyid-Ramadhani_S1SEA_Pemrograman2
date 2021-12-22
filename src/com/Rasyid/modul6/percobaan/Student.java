package com.Rasyid.modul6.percobaan;

public class Student extends Person {
    public Student() {
        // Sebelum SubClass menjalankan konstruktornya sendiri,
        // SubClass akan menjalankan Konstruktor SuperClassnya terlebih dahulu.
        // super("ini nama", "ini alamat");
        // super();
        System.out.println("Inside Student : Constructor");
        /*
         * Kesimpulan : Ketika sebuah objek Class Student di-instansiasi pada Class
         * InheritDemo, konstruktor dari SuperClass Person dipanggil secara implisit
         * untuk melakukan inisialisasi terlebih dahulu, setelah itu pernyataan dalam
         * konstruktor dari SubClassStudent baru dijalankan.
         */
    }
}