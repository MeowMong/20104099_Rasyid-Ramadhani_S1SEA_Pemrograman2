# Modul 4 : Dasar Pemrograman Berbasis Objek

## Dasar Teori

### 1. Information Hiding
<p>Information Hiding adalah konsep menyembunyikan atribut dan method suatu
objek dari objek lain. Informasi dari suatu class disembunyikan agar anggotaanggota tersebut tidak dapat diakses dari luar. Caranya cukup dengan memberikan akses control private ketika mendeklarasikan suatu atribut atau method.</p>

### 2. Encapsulation (Enkapsulasi)
<p>Enkapsulasi adalah suatu cara untuk menyembunyikan implementasi detail dari suatu class. Enkapsulasi mempunyai dua hal mendasar, yaitu:<br>
a. Information Hiding <br>
b. Menyediakan suatu perantara (method) untuk pengaksesan data.</p>

### 3. Constructor (Konstruktor)
<p>Konstruktor adalah suatu method yang pertama kali dijalankan pada saat pembuatan suatu obyek. Konstruktor merupakan method yang berfungsi untuk menginisialisasi variabel-variabel instance yang akan di miliki oleh objek. Konstruktor dipanggil pada saat proses instansiasi kelas menjadi objek.</p>

### 4. Overloading constructor
<p>Overloading Constructor merupakan suatu class yang mempunyai lebih dari 1 constructor, dengan syarat daftar parameternya tidak boleh ada yang sama. Constructor tidak dapat dipanggil secara langsung, namun harus dipanggil dengan menggunakan operator new pada pembentukan sebuah class.</p>

<hr>

## Praktikum
Soal : 
1. Membuat 2 class dalam project yang tertera di modul lalu analisis dan temukan konsep apa saja yang digunakan pada modul project modul ini, serta mengapa outputnya seperti itu


Jawaban :
1. [Jawaban Soal 1](https://github.com/HaiNyore/20104099_Rasyid-Ramadhani_S1SEA_Pemrograman2/blob/modul4/src/com/Rasyid/modul4/latihan/StudentRecord.java)
Program ini menggunakan class yang berbeda dengan method-method didalamnya untuk mengeksekusi perintah dari main class.

#### Output :
```java
Wahyu
Hitung = 0
```
## Kesimpulan

