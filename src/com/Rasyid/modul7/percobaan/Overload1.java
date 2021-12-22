package com.Rasyid.modul7.percobaan;

public class Overload1 {
    // Terdapat 3 method
    // Tipe short
    void myMethod(short s) {
        System.out.println("Short");
    }

    // Tipe integer
    void myMethod(int i) {
        System.out.println("int");
    }

    // Tipe long
    void myMethod(long l) {
        System.out.println("long");
    }

    public static void main(String[] args) {
        Overload1 o = new Overload1();
        byte b = 1;

        o.myMethod(b);
    }
}
