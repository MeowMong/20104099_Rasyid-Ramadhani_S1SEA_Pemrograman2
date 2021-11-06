package com.Rasyid.modul5.latihan.perbankan;

public class Tabungan {
    // DECLARE
    private int saldo;

    public Tabungan(int saldo) {
        this.saldo = saldo;
    }

    // GETTER n SETTER
    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int simpanUang(int jumlah) {
        return saldo = jumlah + saldo;
    }

    public boolean ambilUang(int jumlah) {
        if (saldo - jumlah < 0) {
            return false;
        } else
            saldo -= jumlah;
        return true;
    }

}
