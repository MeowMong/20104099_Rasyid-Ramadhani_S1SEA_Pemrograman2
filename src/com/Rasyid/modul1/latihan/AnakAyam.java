package com.Rasyid.modul1.latihan;

public class AnakAyam {
    public static void main(String[] args) {

        System.out.println("=== CERITA ANAK AYAM ===");
        for (int i = 10; i >= 1; i--) {
            System.out.println("Anak ayam turun " + i);
            if (i > 1)
                System.out.println("Mati 1 tinggal " + (i - 1));
            else if (i == 1)
                System.out.println("Mati 1 tinggal induknya");
        }
    }

}
