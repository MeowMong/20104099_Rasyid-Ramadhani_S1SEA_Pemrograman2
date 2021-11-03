package com.Rasyid.modul4.percobaan;

public class MainTabungan {
    public static void main(String[] args) {
        // Objek dengan nama saya dengsn constructor dari kelas Tabungan
        Tabungan saya = new Tabungan("Barca", 50410420, 1000000, 12345);
        // Objek dengan nama saya untuk memanggil
        System.out.println("Nama\t\t: " + saya.getNama());
        System.out.println("No.Rekening\t: " + saya.getNoRekening());
        System.out.println("Saldo\t\t: " + saya.getSaldo());
        System.out.println("Pin\t\t: " + saya.getPin());
    }

}
