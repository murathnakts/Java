package JAVA;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String cevap1, cevap2, cevap3, cevap4, cevap5;
		int sayac = 0;
		String[] cevaplar = new String[5];
		String[] dogruyanlis = new String[5];

		System.out.println("SORU 1)Kuresel Isinmanin En Buyuk Etkisi Hangisidir? ");
		System.out.println("A-Kutuplarin Erimesi B-Kuraklik C-Ekonomik Krizler D-Savaslar");
		cevap1 = input.next();
		switch (cevap1) {
		case "A":
			System.out.println("DOGRU CEVAP VERDINIZ!\n");
			cevaplar[0] = "A";
			dogruyanlis[0] = "Dogru";
			sayac++;
			break;
		case "B":
			System.out.println("YANLIS CEVAP VERDINIZ!!\n");
			cevaplar[0] = "B";
			dogruyanlis[0] = "Yanlis";
			break;
		case "C":
			System.out.println("YANLIS CEVAP VERDINIZ!!\n");
			cevaplar[0] = "C";
			dogruyanlis[0] = "Yanlis";
			break;
		case "D":
			System.out.println("YANLIS CEVAP VERDINIZ!!\n");
			cevaplar[0] = "D";
			dogruyanlis[0] = "Yanlis";
			break;
		default:
			System.out.println("Hatali Giris");
			return;
		}

		System.out.println("SORU 2)Hangi Gezegende Kuresel Isinma Vardir?");
		System.out.println("A-Mars B-Pluton C-Dunya D-Neptun");
		cevap2 = input.next();
		switch (cevap2) {
		case "A":
			System.out.println("YANLIS CEVAP VERDINIZ!!\n");
			cevaplar[1] = "A";
			dogruyanlis[1] = "Yanlis";
			break;
		case "B":
			System.out.println("YANLIS CEVAP VERDINIZ!!\n");
			cevaplar[1] = "B";
			dogruyanlis[1] = "Yanlis";
			break;
		case "C":
			System.out.println("DOGRU CEVAP VERDINIZ!\n");
			cevaplar[1] = "C";
			dogruyanlis[1] = "Dogru";
			sayac++;
			break;
		case "D":
			System.out.println("YANLIS CEVAP VERDINIZ!!\n");
			cevaplar[1] = "D";
			dogruyanlis[1] = "Yanlis";
			break;
		default:
			System.out.println("Hatali Giris");
			return;

		}

		System.out.println("SORU3)Hangi Gaz Kuresel Isinmaya Neden Olur?");
		System.out.println("A-O2\nB-CO2\nC-N2\nD-H2");
		cevap3 = input.next();
		switch (cevap3) {
		case "A":
			System.out.println("YANLIS CEVAP VERDINIZ!!\n");
			cevaplar[2] = "A";
			dogruyanlis[2] = "Yanlis";
			break;
		case "B":
			System.out.println("DOGRU CEVAP VERDINIZ!\n");
			cevaplar[2] = "B";
			dogruyanlis[2] = "Dogru";
			sayac++;
			break;
		case "C":
			System.out.println("YANLIS CEVAP VERDINIZ!!\n");
			cevaplar[2] = "C";
			dogruyanlis[2] = "Yanlis";
			break;
		case "D":
			System.out.println("YANLIS CEVAP VERDINIZ!!\n");
			cevaplar[2] = "D";
			dogruyanlis[2] = "Yanlis";
			break;
		default:
			System.out.println("Hatali Giris");
			return;
		}

		System.out.println("SORU 4)Gunes Enerjisinin Tutulmasina Ne Ad Verilir?");
		System.out.println("A-Gunes Tutulmasi\nB-Buzlarin Erimesi\nC-Ozon Tabakasi Delinmesi\nD-Sera Etkisi");
		cevap4 = input.next();
		switch (cevap4) {
		case "A":
			System.out.println("YANLIS CEVAP VERDINIZ!!\n");
			cevaplar[3] = "A";
			dogruyanlis[3] = "Yanlis";
			break;
		case "B":
			System.out.println("YANLIS CEVAP VERDINIZ!!\n");
			cevaplar[3] = "B";
			dogruyanlis[3] = "Yanlis";
			break;
		case "C":
			System.out.println("YANLIS CEVAP VERDINIZ!!\n");
			cevaplar[3] = "C";
			dogruyanlis[3] = "Yanlis";
			break;
		case "D":
			System.out.println("DOGRU CEVAP VERDINIZ!\n");
			cevaplar[3] = "D";
			dogruyanlis[3] = "Dogru";
			sayac++;
			break;
		default:
			System.out.println("Hatali Giris");
			return;
		}

		System.out.println("SORU 5)Kuresel Isinma Nasil Engellenebilir?");
		System.out.println(
				"A-CO2 Tuketimi Azaltilmalidir.\nB-Enerji Tuketimi Azaltilmalidir.\nC-Komur Tuketimi Artmalidir.\nD-Tasarruf Yapilmali.");
		cevap5 = input.next();
		switch (cevap5) {
		case "A":
			System.out.println("DOGRU CEVAP VERDINIZ!\n");
			cevaplar[4] = "A";
			dogruyanlis[4] = "Dogru";
			sayac++;
			break;
		case "B":
			System.out.println("YANLIS CEVAP VERDINIZ!!\n");
			cevaplar[4] = "B";
			dogruyanlis[4] = "Yanlis";
			break;
		case "C":
			System.out.println("YANLIS CEVAP VERDINIZ!!\n");
			cevaplar[4] = "C";
			dogruyanlis[4] = "Yanlis";
			break;
		case "D":
			System.out.println("YANLIS CEVAP VERDINIZ!!\n");
			cevaplar[4] = "D";
			dogruyanlis[4] = "Yanlis";
			break;
		default:
			System.out.println("Hatali Giris");
			return;

		}

		if (sayac == 5) {
			System.out.println("Mukemmel\n");
		} else if (sayac == 4) {
			System.out.println("Cok iyi\n");
		} else {
			System.out.println("Bilgileri Tazeleme Zamani\n");
		}

		System.out.println("Verilen Cevaplar: ");
		for (int i = 0; i < cevaplar.length; i++) {
			System.out.printf("Cevap %d: " + cevaplar[i] + " " + dogruyanlis[i] + "\n", (i + 1));
		}

	}
}
