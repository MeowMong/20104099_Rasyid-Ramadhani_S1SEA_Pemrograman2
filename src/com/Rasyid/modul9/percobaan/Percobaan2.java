package com.Rasyid.modul9.percobaan;

public class Percobaan2 {
    public static void main(String[] args) {
        int bil = 10;
        try {
            System.out.println(bil / 0);
        } catch (Throwable e) {
            System.out.println("Indeks array melebihi batas");
        }
    }
}
