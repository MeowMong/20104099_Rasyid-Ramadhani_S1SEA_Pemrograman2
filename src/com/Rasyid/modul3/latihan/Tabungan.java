package com.Rasyid.modul3.latihan;

public class Tabungan {
    int saldo;

    public Tabungan(int initsaldo) {
        this.saldo = initsaldo;
    }

    public int getSaldo() {
        return saldo;
    }

    public int simpanUang(int jumlah) {
        return saldo = saldo + jumlah;
    }

    public boolean ambilUang(int jumlah) {
        if (saldo - jumlah < 0)
            return false;
        else
            saldo -= jumlah;
        return true;
    }
}
