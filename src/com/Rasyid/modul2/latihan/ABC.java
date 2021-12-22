package com.Rasyid.modul2.latihan;

import java.util.Scanner;

public class ABC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        int a, b, c, t, nt, sn;

        System.out.print("Masukan jumlah testcase\t: ");
        t = scanner.nextInt();
        while (t > 10) {
            System.out.print("Masukkan kembali Testcase (<=10)\t: ");
            t = scanner.nextInt();
        }
        for (int i = 1; i <= t; i++) {
            System.out.println();
            System.out.print("Masukkan A" + i + "\t: ");
            a = input.nextInt();
            System.out.print("Masukkan B" + i + "\t: ");
            b = input.nextInt();
            System.out.print("Masukkan C" + i + "\t: ");
            c = input.nextInt();
            System.out.println("A + B - C\t= " + (a + b - c));
        }
    }
}
