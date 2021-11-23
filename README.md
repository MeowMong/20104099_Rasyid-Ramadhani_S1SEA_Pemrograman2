# Modul 7 : Overloading dan Overriding

## Dasar Teori

### 1. Pengertian Overloading
<p>Overloading adalah suatu keadaan ketika terdapat beberapa method dengan nama yang sama pada satu Class tetapi dengan parameter yang berbeda (mempunyai implementasi dan return value). Tujuan dibuatnya Overloading yaitu memudahkan pengguna method dengan fungsi yang hampir sama.</p>
Ciri-ciri Overloading sebagai berikut : <br>
1. Penamaan method harus sama <br>
2. Daftar/Isi Parameter harus berbeda <br>
3. Return type boleh sama, juga boleh berbeda <br>


### 2. Deklarasi Overloading

```java
public class myInfo(){
	public void info() {
        System.out.println("Halo.. Aku Mahasiswa!");
    }

    public void info(String nama) {
        System.out.println("Haloo.. Namaku " + nama);
    }
}
```

<p>Deklarasi diatas merupakan Overloading Method dengan method pertama tanpa parameter dan method kedua dengan 1 parameter.</p>

### 3. Pengertian Overriding
<p>Overriding merupakan mekanisme dimana sebuah method dapat dideklarasikan ulang pada kelas turunannya.</p>
Ciri-ciri Overriding sebagai berikut : <br>
1. Penamaan method harus sama <br>
2. Daftar/Isi Parameter harus sama <br>
3. Return type harus sama <br>

### 4. Deklarasi Overriding

```java
public class Burung {
    public void terbang() {
        System.out.println("Aku terbang");
    }
}
public class Penguin extends Burung {
    @Override
    public void terbang() {
        System.out.println("Aku tidak bisa terbang");
    }
}
```

<p>Terdapat anotasi "@Override" yang digunakan untuk memberi informasi ke Compiler bahwa method tersebut akan di-Override. Method yang terkena override (overriding method) diharuskan tidak boleh mempunyai modifier yang lebih luas aksesnya dari method yang meng-override(overriding method).</p>

<hr>

## Praktikum
[ -> Program <- ](https://github.com/HaiNyore/20104099_Rasyid-Ramadhani_S1SEA_Pemrograman2/tree/modul7/src/com/Rasyid/modul7/percobaan)

Dalam praktikum ini, menjalankan beberapa percobaan dengan menggunakan Overloading dan Overriding, berikut analisisnya.
* Percobaan Overloading <br>
Program yang digunakan : A, B, C, Overload, Overload1 <br>
Pada Class A, B, C, menggunakan konsep Inheritance. Pada Class Overload, terdapat 2 method yang sama dengan parameter yang berbeda.

```java
public class Overload {
    void myOverload(A a) {
        System.out.println("Overload.myOverload(A a)");
    }

    void myOverload(B b) {
        System.out.println("Overload.myOverload(B b)");
    }

    public static void main(String[] args) {
        // Membuat objek Overload bernama o
        Overload o = new Overload();

        o.myOverload(a);
        o.myOverload(c);
    }
}
```
Output yang dihasilkan akan menampilkan hasil dari class A karena method parameter B lebih dekat dengan Class A.

* Percobaan Overriding <br>
Program yang digunakan : Burung, Penguin, Overriding <br>
Pada Class Burung dan Penguin, terdapat method yang sama. Tetapi Class Penguin merupakan turunan dari Class Burung dan pada Class Penguin terdapat anotasi khusus sebagai penanda untuk override method tersebut.

```java
public class Burung {
    public void terbang() {
        System.out.println("Aku terbang");
    }
}
public class Penguin extends Burung {
    @Override
    public void terbang() {
        System.out.println("Aku tidak bisa terbang");
    }
}
```

## Kesimpulan
Overloading dan Overriding terjadi pada method atau konstruktor. Overloading akan terjadi ketika terdapat 2 method/kontruktor yang sama dengan parameter berbeda didalam satu method dan Overriding akan terjadi ketika terdapat method dan parameter yang sama pada Class turunannya. Ketika melakukan overriding, terdapat anotasi khusus sebagai penanda method tersebut akan di-override. SubClass yang paling dekat dengan SuperClass akan diproses/dijalankan terlebih dahulu.