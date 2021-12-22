# Modul 9 : Exception

## Dasar Teori

### 1. Apa itu Exception ?
<p>Exception adalah suatu kondisi abnormal yang terjadi pada saat menjalankan program. Teknik yang dipakai dalam Java untuk menangani kondisi yang tidak biasa saat menjalankan operasi normal dalam program dinamakan exception handling. Karena dalam java segala sesuatu merupakan objek, maka exception juga direpresentasikan dalam sebuah objek yang menjelaskan tentang exception tersebut. Contoh exception adalah pembagian bilangan dengan 0, pengisian elemen array diluar ukuran array, kegagalan koneksi database, file yang akan dibuka tidak ada, dan mengakses objek yang belum diinisialisasi. Terdapat dua penanganan exception yaitu:</p>
1. Menangani sendiri exception tersebut.
2. Meneruskannya ke luar dengan cara membuat objek tentang exception tersebut dan melemparkannya (throw) keluar agar ditangani oleh kode yang memanggil method(method yang didalamnya terdapat exception) tersebut.
<p>Ada lima keyword yang digunakan oleh Java untuk menangani exception yaitu try, catch, finally, throw dan throws.
<p>

### 2. Tipe-Tipe Exception
<p>Pada exception, superclass tertinggi adalah class Throwable, tetapi kita hampir tidak pernah menggunakan class ini secara langsung. Dibawah class Throwable terdapat dua subclass yaitu class Error dan class Exception.<p>

### 3. Penggunaan Block "try-catch"
<p>Untuk menangani exception dalam program, dengan meletakkan kode program yang memungkinkan terjadinya exception didalam blok try, diikuti dengan blok catch yang menentukan jenis exception yang ingin ditangani.</p>

### Deklarasi Block try-catch

```java
public class Percobaan2 {
	public static void main(String[] args){
		int a[] = new int[5];
		try{
			a[5] = 100 ;
		}catch(ArrayIndexOutOfBoundsException e){
		System.out.println("Indeks Array melebihi batas");
	}
	System.out.println("Setelah blok try-catch"); }
}
```
<p>Output yang dihasilkan :<p>

```java
Terjadi exception karena Indeks Array melebihi batas Setelah blok
try-catch
```

### 4. Menggunakan Keyword "Finally"
<p>Terdapat kode yang harus dijalankan walaupun terjadi atau tidak terjadi exception, misalkan kita membuka file, hal ini memungkinkan terjadinya exception misal file tidak ada, file tidak bisa dibuka, selanjutnya yang harus dilakukan adalah menutup file tersebut.</p>

### Deklarasi Finally

```java
public class Percobaan2 {
	public static void main(String[] args) {
		int a[] = new int[5];
		try{
			a[5] = 100 ;
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Terjadi exception karena Indeks Array melebihi batas");
		}finally{
			System.out.println("Selalu Dijalankan");
		}
		System.out.println("Setelah blok try-catch");
	}
}
```

### 5. Menggunakan Keyword "throw" dan "throws"
<p>Secara eksplisit, kita dapat melempar (throw) exception dari program menggunakan keyword throw. Jika exception tersebut adalah checked exception, maka pada method harus ditambahkan throws. Jika exception tersebut adalah unchecked exception, maka pada method tidak perlu ditambahkan throws.</p>

### Deklarasi throw dan throws

```java
public class Percobaan6 {
	public static void method1() throwsFileNotFoundException{
		throw new FileNotFoundException("File Tidak Ada");
	} public static void main(String[] args) {
		try {
			method1();
		} catch (FileNotFoundException ex) {
			System.out.println(ex.getMessage());
		}
	}
}

```

<hr>

## Latihan

* [Latihan 1](https://github.com/HaiNyore/20104099_Rasyid-Ramadhani_S1SEA_Pemrograman2/blob/modul9/src/com/Rasyid/modul9/latihan/Percobaan4.java)
<br><p>Ketika program Latihan 1 dijalankan, output sebagai berikut :<p>
```java
File Tidak Ada
```
<p>Pada kode program, terdapat method yang melemparkan checked exception menggunakan keywords "throws" pada line 6 dengan terdapat tambahan pesan dengan menggunakan try-catch main program. Deklarasi import java.io.FileNotFoundException dilakukan sebagai penanda untuk melakukan throw FileNotFoundException.<p>

```java
try {
	method1();
} catch (FileNotFoundException ex) {
	System.out.println(ex.getMessage());
}
```

* [Latihan 2](https://github.com/HaiNyore/20104099_Rasyid-Ramadhani_S1SEA_Pemrograman2/blob/modul9/src/com/Rasyid/modul9/latihan/Percobaan5.java)
<br><p>Ketika program Latihan 2 dijalankan, user akan diminta input dalam bentuk angka, lalu output notifikasi akan bergantung kepada inputan usernya, sebagai berikut :<p>
```java
Masukan Angka : 11
Angka lebih dari 10
Selesai

Atau

Masukan Angka : 5
Angka kurang dari atau sama dengan 10
Selesai
```
<p>Pada kode program, menggunakan objek Scanner sebagai fungsi input user. Objek input dilakukan dengan metode try-catch. Output akan berdasarkan input nilai dari user, apabila nilai lebih dari 10 maka akan melempar unchecked exception dengan menggunakan keyword "throw". Ketika input kurang dari atau sama dengan 10, maka Exception akan menampilkan notifikasi output "Angka lebih dari 10". Lalu program selesai diseksekusi, maka akan menampilkan output "Selesai".<p>

```java
try {
	System.out.print("Masukan Angka : ");
	int num = sc.nextInt();
	if (num > 10)
		throw new Exception(); // Throw Exception
	System.out.println("Angka kurang dari atau sama dengan 10");
} catch (Exception s) {
	System.out.println("Angka lebih dari 10");
}
System.out.println("Selesai");

```

* [Latihan 3](https://github.com/HaiNyore/20104099_Rasyid-Ramadhani_S1SEA_Pemrograman2/blob/modul9/src/com/Rasyid/modul9/latihan/Percobaan6.java)
<br><p>Ketika program Latihan 3 dijalankan, akan muncul notifikasi error dalam bentuk pop up dengan pesan sebagai berikut :<p>

```java
com.Rasyid.modul9.latihan.ExceptionC

dan

com.Rasyid.modul9.latihan.ExceptionB

```

<p>Pada kode program, terdapat konsep inheritance yang digunakan untuk membuat SuperClass dan Subclass Exception. Program akan menangani exception dengan menangkap SubClass Exception dengan SuperClass.<p>

```java
import javax.swing.*;
class ExceptionA extends Exception {}
class ExceptionB extends ExceptionA {}
class ExceptionC extends ExceptionB {}
```

<p>Lalu pada metode metode try-catch, terdapat syntax [showMessageDialog] yang akan menampilkan pesan ketika program dijalankan yang berisi notifikasi Error Exception.<p>

```java
try {
	throw new ExceptionC();
} catch (ExceptionA a) {
	JOptionPane.showMessageDialog(null, a.toString(), "Exception", JOptionPane.INFORMATION_MESSAGE);
}
try {
	throw new ExceptionB();
} catch (ExceptionA b) {
	JOptionPane.showMessageDialog(null, b.toString(), "Exception", JOptionPane.INFORMATION_MESSAGE);
}
```

<hr>

## Kesimpulan
<p>Exception merupakan kondisi abnormal yang terjadi ketika menjalankan suatu program. Terdapat beberapa tipe exception seperti Checked Exception dan Unchecked Exception. Untuk menangani error exception, terdapat beberapa metode yang dapat dilakukan, seperti menangani sendiri secara manual exception tersebut atau melemparkannya keluar (throw) untuk ditangani oleh kode. Lalu keyword yang digunakan untuk menangani exception dalam Java yaitu; try, catch, finally, throw dan throws.<p>
