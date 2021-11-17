# Modul 6 : Konsep Inheritance

## Dasar Teori

### 1. Pengertian Inheritance
<p>Inheritance atau bisa disebut Pewarisan adalah suatu konsep pewarisan dari sebuah class ke class lain. Biasanya class yang diwarisi itu lebih umum, dan class yang mewarisi itu lebih spesifik. Kelas yang diwarisi itu disebut dengan “Parent Class” atau “Super Class”, dan class yang mewarisi itu disebut “Child Class” atau “Sub Class”.</p>

<p>Dengan inheritance kita dapat meminimalisir penulisan berulang pada atribut dan method. Karena class yang mewarisi itu, mewarisi atribut dan method dari kelas SuperClass. Saat menggunakan inheritance, kita dapat dengan mudah menggunakan kembali, menyesuaikan, dan memelihara kode yang sudah dibuat.</p>

### 2. Deklarasi Inheritance

```java
public class B extends A{
	***
}
```

<p>B adalah SubClass dan A adalah SuperClass. Dalam Java, untuk mendeklarasikan suatu class sebagai SubClass, digunakan kata kunci Extends sebagai SubClass dan menambahkan Class SuperClassnya.</p>

### 3. Keyword dalam Inheritance
Keyword yang digunakan dalam menggunakan Inheritance, seperti :
1. Extends <br>
Kata yang digunakan bila akan terjadi pewarisan.

2. Super </br>
Untuk merujuk pada member dari ParentClass/SuperClass. seperti kata kunci in.this. Beberapa hal yang harus diingat ketika memanggil konstruktor Super.

### 4. Istilah dalam Inheritance
Terdapat istilah dalam Inheritance, yaitu :
1. Super Class <br>
Sebuah class yang fiturnya akan diwariskan ke anaknya. Disebut dengan Induk/ParentClass/SuperClass.

2. SubClass <br>
Sebuah class yang fiturnya akan mewarisi class Induknya. Class ini dapat memiliki fiturnya sendiri.

### 5. Jenis-Jenis Inheritance
Terdapat 5 jenis inheritance, yaitu :
1. Single Inheritance <br>
Konsep ini hanya memperbolehkan satu SubClass mempunyai satu ParentClass. (Jenis ini yang akan digunakan dalam praktikum)
2. Multilevel Inheritance
3. Multiple Inheritance
4. Hierarchical Inheritance
5. Hybrid Inheritance

### 6. Access Control
Akses kontrol atau kontrol pengaksesan, suatu ParentClass dapat tidak mewariskan sebagian membernya kepada SubClassnya. Sejauh mana suatu sumber dapat diwariskan pada class lain.



<hr>

## Praktikum
[ -> Program <- ](https://github.com/HaiNyore/20104099_Rasyid-Ramadhani_S1SEA_Pemrograman2/tree/modul6/src/com/Rasyid/modul6/percobaan)

Dalam praktikum ini, menjalankan beberapa percobaan dengan menggunakan Konsep Inheritance, berikut analisisnya.
* Percobaan 1 <br>
Program yang digunakan : Bentuk, Persegi, PersegiTest <br>
Pada Class Bentuk, terdapat Atribut dengan access modifier protected dengan tipe data integer tiap variabelnya. Class ini ditujukan sebagai Parent atau SuperClass ayng atributnya akan diwariskan pada Class Persegi.

```java
package com.Rasyid.modul6.percobaan;

public class Bentuk {
    protected int p, l;
}
```

Pada Class Persegi, program ini mewarisi bentuk dari Class Bentuk. Program ini menggunakan konsep Inheritance (ditandai dengan keyword extends) dengan Class Persegi sebagai SubClass dan Class Bentuk sebagai SuperClass. Lalu terdapat method Setter yang berbeda kegunaannya.
```java
package com.Rasyid.modul6.percobaan;

public class Persegi extends Bentuk {
    protected int p, l;

    // super untuk dari class Bentuk
    // Merujuk pada member dari parent class
    public void setSuperP(int p) {
        super.p = p;
    }

    public void setSuperL(int l) {
        super.l = l;
    }

    // this untuk sesama class / memanggil dari class sendiri
    // Merujuk pada member dari class itu sendiri (Persegi)
    public void setP(int p) {
        this.p = p;
    }

    public void setL(int l) {
        this.l = l;
```

* Percobaan 2 <br>
Program yang digunakan : Person, Student, InheritDemo <br>
Pada class Person terdapat atribut dengan access modifier protected dan tipe data String. Program ini menggunakan Overloading Konstruktor karena terdapat 2 konstruktor yang berbeda; Konstruktor tanpa parameter dan Konstruktor dengan 2 parameter.
```java
package com.Rasyid.modul6.percobaan;

public class Person {
    // Atribut
    protected String name;
    protected String address;

    // Overloading Constructor
    // Konstruktor tanpa parameter
    public Person() {
        System.out.println("Inside Person : Constructor");
        name = " ";
        address = " ";
    }

    // Konstruktor dengan 2 parameter
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
```
Pada Class Student, menggunakan konsep Inheritance dengan Person sebagai SuperClass dan Person sebagai SubClass. Pada Program ini terdapat Konstruktor probadi dalam bentuk comment, sebelum SubClass menjalankan konstruktornya sendiri, SubClass akan menjalankan konstruktor SuperClassnya terlebih dahulu.
```java
package com.Rasyid.modul6.percobaan;

public class Student extends Person {
    public Student() {
		// Ketika salah satu konstruktor ini dibuka, maka akan terjadi pemanggilan secara eksplisit, jika tertutup maka terjadi pemanggilan secara implisit dari konsep Inheritance 
        // super("ini nama", "ini alamat");
        // super();
        System.out.println("Inside Student : Constructor");
	}
}
```
Jadi, ketika sebuah objek Class Student di-instansiasi pada Class InheritDemo, Konstruktor dari SuperClass PErson dipanggil secara implisit untuk melakukan inisialisasi terlebih dahulu, setelah itu pernyataan dalam konstruktor dari SubClass Student baru dijalankan.

* Percobaan 3 <br>
Program yang digunakan : A, B, InheritanceTest <br>
Pada Class A yang merupakan SuperClass, awalnya menggunakan atribut access modifier private dengan tipe data int pada variabelnya. Lalu ketika Class B yang merupakan SubClass ingin inisialisasi, terdapat error pada variabel x dan y. <br>
Sebelum diubah :
```java
package com.Rasyid.modul6.percobaan;

public class A {
    // Super Class
    // Atribut X dan Y dengan modifier private
    private int x;
    private int y;
```
Setelah diubah :
```java
package com.Rasyid.modul6.percobaan;

public class A {
    // Super Class
    // Atribut X dan Y dengan modifier protected
    protected int x;
    protected int y;
```
Hal ini terjadi karena X dan Y tidak bisa diakses karena Access Modifiernya private pada kelas A. KEtika atribut pada Class A diubah Access Modifiernya menjadi protected, maka sudah bisa diakses pada Class B.

* Percobaan 4 <br>
Program yang digunakan : Child, Parent
Child merupakan SubClass dari SuperClass Parent. Tetapi terdapat error pada konstruktor SubClass Child.
```java
package com.Rasyid.modul6.percobaan;

public class Child extends Parent {
    int x;

    public Child() {
        x = 5;
        super();
    }
}
```
Lalu ketika posisi super ditukar, maka sudah tidak terjadi error.
```java
package com.Rasyid.modul6.percobaan;

public class Child extends Parent {
    int x;

    public Child() {
        super();
        x = 5;
        // Super harus dijadikan pernyataan pertama dalam konstruktor
    }
}
```
Hal ini terjadi karena SUper harus dijadikan pernyataan pertama dalam konstruktor.

## Kesimpulan
Kesimpulan yang didapat dari modul6 - Konsep Inheritance yaitu; Ketika terdapat konstruktor tambahan pada SubClass, maka konstruktor yang dijalankan duluan merupakan kontruktor pada SuperClassnya terlebih dahulu. Posisi Super dan pemilihan atribut Access Modifier dapat mempengaruhi Konsep Inheritance. Posisi Super harus dijadikan pernyataan pertama dalam konstruktor. Terdapat perbedaan pemanggilan, untuk menggunakan konsep inheritance maupun pemanggilan pada Class itu sendiri.