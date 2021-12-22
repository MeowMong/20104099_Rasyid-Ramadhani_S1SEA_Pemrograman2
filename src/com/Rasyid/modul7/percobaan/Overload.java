package com.Rasyid.modul7.percobaan;

public class Overload {
    // Terdapat 2 fungsi
    void myOverload(A a) {
        System.out.println("Overload.myOverload(A a)");
    }

    // Method parameter B lebih dekat dengan kelas A. Jadi
    void myOverload(B b) {
        System.out.println("Overload.myOverload(B b)");
    }

    public static void main(String[] args) {
        // Membuat objek Overload bernama o
        Overload o = new Overload();
        // Tambahan
        A a = new A();
        // Membuat objek C bernama c
        C c = new C();

        o.myOverload(a);
        o.myOverload(c);
    }

}
