package com.Rasyid.modul4.projek;

import java.util.Scanner;

public class SerangAku {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner pilihan = new Scanner(System.in);
        Komponen pemain = new Komponen();
        Komponen play = new Komponen();
        Komponen enemy = new Komponen();

        System.out.println("=-=-=-=-> Permainan SerangAku.com <-=-=-=-=");

        System.out.print("Masukkan nama Anda\t: ");
        String player = input.nextLine();
        play.setPemain(player);
        System.out.println("\nSelamat Datang, " + play.getPemain() + "!");

        boolean keluar = false;
        do {
            System.out.print("\n" + play.getPemain() + ", Main yuk ?\n1. Ayo!\n2. Ngga dulu deh...\n> ");
            int pilih = input.nextInt();
            switch (pilih) {
            case 1:
                System.out.println("\nPada suatu hari yang indah, " + play.getPemain()
                        + " berpetualang mencari satu potongan puzzle yang hilang.");
                System.out.println("Ketika diperjalanan mencari potongan tersebut, " + play.getPemain()
                        + " bertemu dengan musuh, apa yang harus dilakukan ?");
                System.out.println("");
                play.setDarah(200, 1000);
                play.setSerangan(100, 50);
                boolean exit = false;
                do {
                    System.out.print("\n1. Serang\n2. Memperkuat diri\n3.Jurus 1000 langkah~\n> ");
                    int pilihSerang = pilihan.nextInt();
                    switch (pilihSerang) {
                    case 1:
                        System.out.println(play.getPemain() + " Menyerang dengan damage : " + play.getSerangan());
                        play.getSeranganPemain();
                        System.out.println("Darah musuh tersisa : " + play.getDarahMusuh());
                        break;

                    case 2:
                        System.out.println("Menu belum dibuat");
                        break;

                    default:
                        System.out.println("Kasian deh lo");
                        exit = true;
                    }
                } while (exit == false);
                System.out.println("yey");
                break;

            default:
                System.out.println("Selamat Tinggal~");
                keluar = true;
            }
        } while (keluar == false);
    }

}
