# Modul 5 : Mengelola Class

## Dasar Teori

### 1. Package
<p>Package adalah suatu cara untuk mengatur class-class yang kita buat dalam suatu package, akan sangat bermanfaat jika class-class yang kita buat sangat banyak sehingga perlu dikelompokan berdasarkan kategori tertentu. Yang harus diperhatikan adalah nama class utama yang harus sama dengan nama package.</p>

### 2. Import Class
<p>Perintah import digunakan untuk memberitahukan kepada program, untuk mengacu/memuat pada class-class yang terdapat dalam package tertentu, untuk membuka dan menjalankan class-class tersebut.</p>

### 3. Kata Kunci _this_
<p>Kata kunci ini digunakan dalam sebuah kelas untuk menyatakan objek sekarang. Kata kunci this sangat berguna untuk menunjukkan suatu member dalam class-nya sendiri. Kata kunci this dapat digunakan baik untuk data member maupun untuk function member, serta dapat juga digunakan untuk konstruktor.</p>

<hr>

## Praktikum
[Jawab : ](https://github.com/HaiNyore/20104099_Rasyid-Ramadhani_S1SEA_Pemrograman2/tree/modul5/src/com/Rasyid/modul5/latihan)
<p> Pada package modul5/latihan terdapat 1 class bernama TesLatihan.java sebagai main class dan 1 package bernama 'perbankan' dengan 2 class didalamnya yaitu, Nasabah.java dan Tabungan.java yang berisi method, objek, konstruktor yang akan digunakan dan dijalankan.</p>

* Class TesLatihan.java<br>
Class ini menggunakan metode import class untuk mengakses objek class yang berada pada package lain. Pada class ini menggunakan pemanggilan objek yang telah dipanggil dengan metode import tadi ke kelas dengan input namaAwal "Agus" dan namaAkhir "Daryanto".

```java
import package :
package com.Rasyid.modul5.latihan;

import com.Rasyid.modul5.latihan.perbankan.*;

Deklarasi Objek:
Nasabah nasabah = new Nasabah("Agus", "Daryanto");
```

* Class Nasabah.java<br>
Dalam class ini menggunakan kata kunci _this_ untuk menjelankan suatu member dan konstruktor yang ada didalam class. Metode Getter and Setter digunakan dalam class ini untuk menerima input dari main class dan output ke main class. Penggunaan method tersebut untuk mengatur tabungan awal dengan setTabungan dan mengatur nama awal dan nama akhir.

```java
public class Nasabah {
    // DECLARE
    private String namaAwal;
    private String namaAkhir;

    Tabungan tabungan = new Tabungan(5000);

    public Nasabah(String namaAwal, String namaAkhir) {
        this.namaAwal = namaAwal;
        this.namaAkhir = namaAkhir;
    }

    // GETTER
    public String getNamaAwal() {
        return namaAwal;
    }

    public String getNamaAkhir() {
        return namaAkhir;
    }

    public Tabungan getTabungan() {
        return tabungan;
    }

    // SETTER
    public void setNamaAwal(String namaAwal) {
        this.namaAwal = namaAwal;
    }

    public void setNamaAkhir(String namaAkhir) {
        this.namaAkhir = namaAkhir;
    }

    public void setTabungan(Tabungan tabungan) {
        this.tabungan = tabungan;
    }
}
```

* Class Tabungan.java<br>
Dalam class ini merupakan class untuk mengatur nilai saldo dengan method Getter dan Setter getSaldo, setSaldo, simpanUang dan ambilUang untuk perhitungan sukses atau gagalnya saldo yang dikeluarkan.

```java
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
```

#### Output :
```java
Nasabah atas nama : Agus Daryanto
Saldo Awal        : 5000
Jumlah uang yang disimpan       : 3000
Jumlah uang yang diambil        : 6000 Berhasil
Jumlah uang yang disimpan       : 3500
Jumlah uang yang diambil        : 4000 Berhasil
Jumlah uang yang diambil        : 1600 Gagal
Jumlah uang yang disimpan       : 2000
Saldo sekarang    : 3500
```
## Kesimpulan
Kesimpulan yang didapat dari modul 5 - Mengelola Class ini merupakan, penggunaan method, objek, konstruktor yang ada pada class dengan package yang berbeda dapat dilakukan dengan menggunakan import package tujuan. Ketika method, objek, atau variabel dalam class yang sama ingin digunakan, kata kunci _this_ juga harus digunakan.