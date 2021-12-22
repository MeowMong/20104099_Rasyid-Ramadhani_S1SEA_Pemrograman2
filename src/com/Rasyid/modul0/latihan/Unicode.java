package com.Rasyid.modul0.latihan;

public class Unicode {
    public static void main(String[] args) {
        char A = '\u0041';
        char n = '\u006e';
        char a = '\u0061';
        char k = '\u006b';
        char y = '\u0079';
        char m = '\u006d';

        String anak = "\u0041\u006e\u0061\u006b";
        String ayam = "\u0061\u0079\u0061\u006d";

        System.out.println("Lahirlah... " + (anak + " " + ayam));
    }
}
