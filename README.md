# Modul 8 : Polimorfisme

## Dasar Teori

### 1. Polimorfisme
<p>Polimorfisme merupakan kemampuan untuk mempunyai beberapa bentuk class yang berbeda. Polimorfisme ini terjadi pada saat suatu obyek bertipe parent class, tetapi pemanggilan konstruktor yang dilakukan merupakan konstruktor dari subclass</p>

### 2. Deklarasi Polimorfisme (Polymorphic Arguments)

```java
Class Pegawai(){
	...
}

Class Manajer extends Pegawai {
	...
}

public class Tes {
	// Polymorphic Argument
	public static void Proses(Pegawai peg){
		...
	}
	public static void main(String[] args){
		Manajer man = new Manajer();
		Proses(man);
	}
}
```

<p>Polymorphic arguments adalah tipe suatu parameter yang menerima suatu nilai yang bertipe subclass-nya. Deklarasi diatas merupakan contoh Polymorphic Arguments dengan class Pegawai sebagai Parent class dan Manajer sebagai SubClassnya.</p>

### 3. Virtual Method Invocation (VMI)
<p>Virtual Method Invocation (VMI) merupakan peristiwa ketika terjadi polimorfisme dan overriding. Pada saat obyek yang sudah dibuat tersebut memanggil overriden method pada parent class, compiler Java akan melakukan Invocation (pemanggilan) terhadap overriding method pada subclass, dimana yang seharusnya dipanggil adalah overriden method.</p>

### 4. Deklarasi VMI

```java
	Pegawai peg = new Manajer();
	<nama_class> <variable_bebas> = new <konstruktor>
}
```

### 5. Instance of Statements
<p>Instanceof sangat berguna untuk mengetahui tipe asal dari suatu Polymorphic Arguments.</p>

### 4. Deklarasi instanceof

```java
Class Pegawai(){
	...
}

Class Manajer extends Pegawai {
	...
}

Class Kurir extends Pegawai {
	...
}

public class Tes {
	public static void Proses(Pegawai peg){
		// penggunaan instanceof
		if (peg instanceof Manajer) {
			...lakukan tugas-tugas manajer...
		} else if (peg instanceof Kurir) {
			...lakukan tugas-tugas kurir...
		} else {
			...lakukan tugas-tugas lainnya...
		}
	}
	
	public static void main(String[] args){
		Manajer man = new Manajer();
		Kurir kur = new Kurir();
		Proses(man);
		Proses(kur);
	}
}
```

<hr>

## Praktikum
[ -> Program <- ](https://github.com/HaiNyore/20104099_Rasyid-Ramadhani_S1SEA_Pemrograman2/tree/modul7/src/com/Rasyid/modul7/percobaan)

* Percobaan dengan Virtual Method Invocation<br>
Terdapat 3 class yang akan digunakan dalam project ini, yaitu :
<br>1. Pegawai
<br>2. Gaji
<br>3. VirtualDemo

<p>Ketika main program dijalankan akan output seperti ini :<p>

```java
Menyusun Pegawai
Menyusun Pegawai
Memanggil mailCheck Berdasarkan Referensi Gaji --
Memeriksa kelas gaji dalam surat
Surat tertuju untuk Wahyu dengan gaji 5000.0

Memanggil mailCheck Berdasarkan Referensi Pegawai --
Memeriksa kelas gaji dalam surat
Surat tertuju untuk Rasyid dengan gaji 2500.0
```

<p>Terdapat output yang mencetak "Menyusun Pegawai" sebanyak 2 kali, hal ini terjadi karena konstruktor dalam class Pegawai dan Gaji akan sama-sama mencetaknya. Class ini menggunakan konsep inheritance.<p>

```java
public class Pegawai {
	public Pegawai(String name, String address, int number) {
        System.out.println("Menyusun Pegawai"); // Akan mencetak
        this.name = name;
        this.address = address;
        this.number = number;
    }
	...
}

public class Gaji extends Pegawai {
	public Gaji(String name, String address, int number, double salary) {
        super(name, address, number);
        setSalary(salary);
    }
	...
}
```

<p>Lalu pada main program terdapat salah satu objek menggunakan Virtual Method Invocation. Objek e yang dibuat tersebut memanggil overriden method pada parent class (Class Pegawai), lalu compiler Java akan melakukan pemanggilan terhadap overriding method pada subclass (Class Gaji). Objek-objek tersebut berisi parameter yang akan dimasukkan datanya.<p>

```java
public class VirtualDemo {
    public static void main(String[] args) {
		// Tanpa menggunakan VMI
        Gaji s = new Gaji("Wahyu", "KUBAR", 3, 5000.00);
		// Menggunakan VMI
        Pegawai e = new Gaji("Rasyid", "Bekasi", 2, 2500.00);
		...
	}
	...
}
```

<p>Output akan tercetak dengan data yang dimasukkan dengan objek sebelumnya.<p>


## Kesimpulan
<p>Polimorfisme dapat dilakukan dengan inheritance, overriding, dan overloading. Ketika terjadi Polimorfisme dan Overriding dalam objek, maka terjadi Virtual Method Invocation (VMI). Polimorphic Argument dapat digunakan untuk menerima suatu nilai yang bertipe SubClass-nya.<p>