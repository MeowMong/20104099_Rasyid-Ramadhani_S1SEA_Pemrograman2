package com.Rasyid.modul4.percobaan;

public class MainTabungan2 {
    public static void main(String[] args) {
        Tabungan2 saya = new Tabungan2("Barca", 12456, 11111);
        Tabungan2 kamu = new Tabungan2("Manu", 12467, 15000, 22222);

        System.out.println("Saldo awal saya\t: " + saya.getSaldo());
        System.out.println("Saldo awal kamu\t: " + kamu.getSaldo());
        System.out.println("Nomor pin saya\t: " + saya.getPin());
        System.out.println("Nomor pin kamu\t: " + kamu.getPin());
    }
}
