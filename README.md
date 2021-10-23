# Modul 2 : Dasar Pemrograman Java

## Dasar Teori
* Keyword dalam Java
* Tipe Dasar
* Variabel
* Casting dan Promotion

<hr>

## Praktikum
Soal : 
1. Menganalisa batasan maksimum dari suatu tipe
2. Anak Ayam
3. A + B - C

Jawaban :
1. [Jawaban Soal 1](https://github.com/HaiNyore/20104099_Rasyid-Ramadhani_S1SEA_Pemrograman2/blob/modul2/src/com/Rasyid/modul2/latihan/BigInteger.java)
Program ini tidak dapat berjalan karena maksimal bilangan dalam nilai angka/integer (bukan tipe data) merupakan 2147483647, solusinya adalah mengurangi satu angka.
#### Output :
```java
/BigInteger.java:3: error: integer number too large
        long p = 2147483648;
                 ^
1 error
```

2. [Jawaban Soal 2](https://github.com/HaiNyore/20104099_Rasyid-Ramadhani_S1SEA_Pemrograman2/blob/modul2/src/com/Rasyid/modul2/latihan/AnakAyam.java)
Program berjalan dengan adanya 'looping' dan 'if else.
```java
=== CERITA ANAK AYAM ===
Anak ayam turun 10
Mati 1 tinggal 9
Anak ayam turun 9
Mati 1 tinggal 8
Anak ayam turun 8
Mati 1 tinggal 7
Anak ayam turun 7
Mati 1 tinggal 6
Anak ayam turun 6
Mati 1 tinggal 5
Anak ayam turun 5
Mati 1 tinggal 4
Anak ayam turun 4
Mati 1 tinggal 3
Anak ayam turun 3
Mati 1 tinggal 2
Anak ayam turun 2
Mati 1 tinggal 1
Anak ayam turun 1
Mati 1 tinggal induknya
```

3. [Jawaban Soal 3](https://github.com/HaiNyore/20104099_Rasyid-Ramadhani_S1SEA_Pemrograman2/blob/modul2/src/com/Rasyid/modul2/latihan/ABC.java)
Program berjalan dengan analisa input menggunakan 'while do' untuk memberikan batasan testcase.
```java
Masukan jumlah testcase	: 12
Masukkan kembali Testcase (<=10)	: 20
Masukkan kembali Testcase (<=10)	: 2

Masukkan A1	: 2
Masukkan B1	: 3
Masukkan C1	: 9
A + B - C	= -4

Masukkan A2	: 10
Masukkan B2	: 20
Masukkan C2	: -20
A + B - C	= 50
```

<hr>

## Kesimpulan
Setiap tipe data memiliki batasan atau jangkauan ukuran masing-masing. Java memiliki _case-sentitive_ pada syntax yang digunakan, bisa dalam penulisan, logika, maupun tanda baca.
