package com.Rasyid.modul4.projek;

import java.util.Scanner;

public class Trial {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Scanner pilihan = new Scanner(System.in);
		TrialKompos play = new TrialKompos();

		boolean status;

		System.out.println("=-=-=-=-> Permainan SerangAku.com <-=-=-=-=");
		System.out.print("Masukkan nama Anda\t: ");
		String player = input.nextLine();
		play.setPlayerName(player);
		System.out.println("\nSelamat Datang, " + play.getPlayerName() + "!");

		boolean keluar = false;
		do {
			System.out.print("\n" + play.getPlayerName() + ", Main yuk ?\n1. Ayo!\n2. Ngga dulu deh...\n> ");
			int pilih = input.nextInt();
			switch (pilih) {
			case 1:
				System.out.println("\nPada suatu hari yang indah, " + play.getPlayerName()
						+ " berpetualang mencari satu potongan puzzle yang hilang.");
				System.out.println("Ketika diperjalanan mencari potongan tersebut, " + play.getPlayerName()
						+ " bertemu dengan musuh, apa yang harus dilakukan ?");
				System.out.println();

				System.out.println(
						"Hint : Gunakan input key 'z' untuk menyerang, 'x' untuk bertahan, dan 'c' untuk kabur~");
				play.setDefault(200, 1000, 100, 50);
				boolean exit = false;
				do {
					System.out.print("\nz. Serang\nx. Memperkuat diri\nc. Jurus 1000 langkah~\n> ");
					char pilihSerang = pilihan.next().charAt(0);
					switch (pilihSerang) {
					case 'z':
						status = play.getPlayerWin(play.getPlayerPower());
						if (status) {
							System.out.println("Selamat! Kamu Menang!");
							exit = true;
						} else {
							play.getAttackPlayer();
							System.out.println("Darah " + play.getPlayerName() + "\t : " + play.getPlayerHP()
									+ "\nDarah Musuh\t: " + play.getEnemyHP());
							if (play.getPlayerHP() <= 0) {
								System.out.println("Cie kalah, coba lagi yaaa...");
								exit = true;
							}
							break;
						}
						break;

					case 'x':
						System.out.print(
								"\nApa yang ingin ditingkatkan ?\n" + "z. Kekuatan Serangan -> Perkuat seranganmu\n"
										+ "x. Vitalitas Tinggi  -> Perkuat  daya tahanmu\n"
										+ "c. Cek Status Kamu saat ini\n> ");
						char perkuat = pilihan.next().charAt(0);
						switch (perkuat) {
						case 'z':
							play.setPlayerUpDamage(20);
							break;
						case 'x':
							play.setPlayerUpHP(50);
							break;
						default:
							System.out.println("Status kamu saat ini :\n" + "Serangan\t-> " + play.getPlayerPower()
									+ "\nDaya Tahan\t-> " + play.getPlayerHP());
							break;
						}
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
