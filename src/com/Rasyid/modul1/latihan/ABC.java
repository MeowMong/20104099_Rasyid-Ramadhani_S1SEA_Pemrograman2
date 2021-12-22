package com.Rasyid.modul1.latihan;

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
            nt = scanner.nextInt();
            t = nt;
        }
        for (int i = 1; i <= t; i++) {
            System.out.println();
            System.out.print("Masukkan A\t: ");
            a = input.nextInt();
            System.out.print("Masukkan B\t: ");
            b = input.nextInt();
            System.out.print("Masukkan C\t: ");
            c = input.nextInt();
            System.out.println("A+B-C= " + (a + b - c));
        }

    }

}
