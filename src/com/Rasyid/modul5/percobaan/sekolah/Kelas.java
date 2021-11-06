package com.Rasyid.modul5.percobaan.sekolah;

import com.Rasyid.modul5.percobaan.Mahasiswa;

public class Kelas {
    private int kodeKelas;
    private String namaKelas;
    private Mahasiswa mahasiswa;

    public Kelas(int kode, String nama) {
        this.kodeKelas = kode;
        this.namaKelas = nama;
    }

    public void setMahasiswa(Mahasiswa mhs) {
        this.mahasiswa = mhs;
    }
}
