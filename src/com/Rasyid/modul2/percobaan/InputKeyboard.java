package com.Rasyid.modul2.percobaan;

import java.util.Scanner;

public class InputKeyboard{
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int var_a, var_b;
        System.out.print("Masukkan nilai var_a\t: ");
        var_a = scanner.nextInt();
        System.out.print("Masukkan nilai var_b\t: ");
        var_b = scanner.nextInt();
        
        System.out.println();
        System.out.println("Variabel yang terdapat dalam program\t: ");
        System.out.println("var_a = " + var_a);
        System.out.println("var_b = " + var_b);
    }
}
