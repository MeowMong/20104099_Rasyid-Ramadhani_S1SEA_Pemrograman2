package com.Rasyid.modul6.percobaan;

public class InheritanceTest {
    public static void main(String[] args) {
        // Objek Ortu dari Class A dan Objek Anak dari kelas B
        A ortu = new A();
        B anak = new B();

        // Set nilai dengan objek Ortu dan memangil nilainya
        System.out.println("SuperClass");
        ortu.setX(10);
        ortu.setY(20);
        ortu.getNilai();

        // Set nilai dengan Objek Anak dan memangil nilainya
        System.out.println("SubClass");
        anak.setX(5);
        anak.setY(4);
        anak.setZ(50);
        anak.getNilai();
        anak.getJumlah();
    }
}
