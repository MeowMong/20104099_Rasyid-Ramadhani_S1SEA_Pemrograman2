package com.Rasyid.modul3.percobaan;

public class TesTabungan {
    public static void main(String[] args) {
        System.out.println();
        Tabungan uangku = new Tabungan(5000);
        System.out.println("Saldo awal tabungan Anda\t: " + uangku.saldo);
        uangku.ambilUang(1500);

        System.out.println("Jumlah uang yang diambil\t : 1500");
        System.out.println("Saldo tabungan Anda sekarang adalah\t: " + uangku.saldo);
    }
}
