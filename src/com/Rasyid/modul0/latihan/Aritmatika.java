package com.Rasyid.modul0.latihan;

public class Aritmatika {

    public static void main(String[] args) {
        System.out.println("Operasi Aritmatika " + "pada tipe integer");
        int a = 2 + 1;
        int b = a - 1;
        int c = a * b;
        int d = c / 3;
        int e = -a;
        int f = a + b - c;
        System.out.println("Nilai a\t: " + a);
        System.out.println("Nilai b\t: " + b);
        System.out.println("Nilai c\t: " + c);
        System.out.println("Nilai d\t: " + d);
        System.out.println("Nilai e\t: " + e);
        System.out.println("Nilai f\t: " + f);

        System.out.println("\nOperasi Aritmatika " + "pada tipe floating-point");
        double fa = 2 + 1;
        double fb = fa - 1;
        double fc = fa * fb;
        double fd = fc / 3;
        double fe = -fa;
        double ff = fa + fb - fc;
        System.out.println("Nilai fa\t: " + fa);
        System.out.println("Nilai fb\t: " + fb);
        System.out.println("Nilai fc\t: " + fc);
        System.out.println("Nilai fd\t: " + fd);
        System.out.println("Nilai fe\t: " + fe);
        System.out.println("Nilai ff\t: " + ff);

    }
}
