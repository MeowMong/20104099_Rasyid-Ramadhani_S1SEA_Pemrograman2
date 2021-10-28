package com.Rasyid.modul4.percobaan;

public class MainTabungan3 {
    public static void main(String[] args) {
        Tabungan3 saya = new Tabungan3("Barca", 12345);
        Tabungan3 kamu = new Tabungan3("Manu", 12467, 15000, 22222);

        saya.setSaldo(10000);
        saya.setPin(11111);

        System.out.println("Saldo awal saya\t: " + saya.getSaldo());
        System.out.println("Saldo awal kamu\t: " + kamu.getSaldo());
        System.out.println("Nomor pin saya\t: " + saya.getPin());
        System.out.println("Nomor pin kamu\t: " + kamu.getPin());
    }
}
