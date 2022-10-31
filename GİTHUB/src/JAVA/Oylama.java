package JAVA;

import java.util.ArrayList;
import java.util.Scanner;

public class Oylama {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList cevaplar = new ArrayList();
		String sorunlar[] = { "Siyaset", "Ekonomi", "Cevre", "Kuresel", "Kulturel" };
		int cevap1, cevap2, cevap3, cevap4, cevap5, devam, i = 0;
		double ort1, ort2, ort3, ort4, ort5;
		int sum1 = 0, sum2 = 0, sum3 = 0, sum4 = 0, sum5 = 0;
		int max = sum1;

		while (1 == 1) {
			i++;
			cevaplar.add(i);
			System.out.printf("Teste Hosgeldiniz %d. kisi\n", i);
			System.out.println("Lutfen sorulara 1-5 arasi bir puan veriniz!!");
			System.out.println(sorunlar[0] + " Hakkindaki Yorumunuz Nedir? ");
			cevap1 = input.nextInt();
			if (cevap1 <= 0 || cevap1 > 5) {
				System.out.println("Hatali Giris Yaptiniz!!!");
				return;
			}
			cevaplar.add(cevap1);
			System.out.println(sorunlar[1] + " Hakkindaki Yorumunuz Nedir? ");
			cevap2 = input.nextInt();
			if (cevap2 <= 0 || cevap2 > 5) {
				System.out.println("Hatali Giris Yaptiniz!!!");
				return;
			}
			cevaplar.add(cevap2);
			System.out.println(sorunlar[2] + " Hakkindaki Yorumunuz Nedir? ");
			cevap3 = input.nextInt();
			if (cevap3 <= 0 || cevap3 > 5) {
				System.out.println("Hatali Giris Yaptiniz!!!");
				return;
			}
			cevaplar.add(cevap3);
			System.out.println(sorunlar[3] + " Hakkindaki Yorumunuz Nedir? ");
			cevap4 = input.nextInt();
			if (cevap4 <= 0 || cevap4 > 5) {
				System.out.println("Hatali Giris Yaptiniz!!!");
				return;
			}
			cevaplar.add(cevap4);
			System.out.println(sorunlar[4] + " Hakkindaki Yorumunuz Nedir? ");
			cevap5 = input.nextInt();
			if (cevap5 <= 0 || cevap5 > 5) {
				System.out.println("Hatali Giris Yaptiniz!!!");
				return;
			}
			cevaplar.add(cevap5);

			System.out.println("Teste devam etmek isterseniz 1'e basin.");
			devam = input.nextInt();

			if (devam != 1) {
				break;
			}
		}

		System.out.println("Kisiler |Siyaset |Ekonomi |Cevre |Kuresel |Kulturel |");

		for (int j = 0; j < i * 6; j += 6) {
			System.out.printf("%d.kisi  |   %d    |   %d    |  %d   |   %d    |   %d     |", cevaplar.get(j),
					cevaplar.get(j + 1), cevaplar.get(j + 2), cevaplar.get(j + 3), cevaplar.get(j + 4),
					cevaplar.get(j + 5));
			System.out.println();
		}

		int siyaset[] = new int[i];
		int ekonomi[] = new int[i];
		int cevre[] = new int[i];
		int kuresel[] = new int[i];
		int kulturel[] = new int[i];

		for (int k = 0; k < i * 6; k += 6) {
			siyaset[k / 6] = (int) cevaplar.get(k + 1);
			ekonomi[k / 6] = (int) cevaplar.get(k + 2);
			cevre[k / 6] = (int) cevaplar.get(k + 3);
			kuresel[k / 6] = (int) cevaplar.get(k + 4);
			kulturel[k / 6] = (int) cevaplar.get(k + 5);
		}

		for (int value : siyaset) {
			sum1 = sum1 + value;
		}
		for (int value : ekonomi) {
			sum2 = sum2 + value;
		}
		for (int value : cevre) {
			sum3 = sum3 + value;
		}
		for (int value : kuresel) {
			sum4 = sum4 + value;
		}
		for (int value : kulturel) {
			sum5 = sum5 + value;
		}

		ort1 = (double) sum1 / siyaset.length;
		ort2 = (double) sum2 / ekonomi.length;
		ort3 = (double) sum3 / cevre.length;
		ort4 = (double) sum4 / kuresel.length;
		ort5 = (double) sum5 / kulturel.length;

		if (max < sum2) {
			max = sum2;
		}
		if (max < sum3) {
			max = sum3;
		}
		if (max < sum4) {
			max = sum4;
		}
		if (max < sum5) {
			max = sum5;
		}

		int min = sum1;

		if (min > sum2) {
			min = sum2;
		}
		if (min > sum3) {
			min = sum3;
		}
		if (min > sum4) {
			min = sum4;
		}
		if (min > sum5) {
			min = sum5;
		}

		System.out.println("--------|--------|--------|------|--------|---------|");
		System.out.printf("Ortalama|  %.2f  |  %.2f  | %.2f |  %.2f  |  %.2f   |\n", ort1, ort2, ort3, ort4, ort5);
		System.out.println("--------|--------|--------|------|--------|---------|");
		if (max == sum1) {
			System.out.println("En Cok Oy Alan: Siyaset " + sum1);
		} else if (max == sum2) {
			System.out.println("En Cok Oy Alan: Ekonomi " + sum2);
		} else if (max == sum3) {
			System.out.println("En Cok Oy Alan: Cevre " + sum3);
		} else if (max == sum4) {
			System.out.println("En Cok Oy Alan: Kuresel " + sum4);
		} else if (max == sum5) {
			System.out.println("En Cok Oy Alan: Kulturel " + sum5);
		}

		if (min == sum1) {
			System.out.println("En Az Oy Alan: Siyaset " + sum1);
		} else if (min == sum2) {
			System.out.println("En Az Oy Alan: Ekonomi " + sum2);
		} else if (min == sum3) {
			System.out.println("En Az Oy Alan: Cevre " + sum3);
		} else if (min == sum4) {
			System.out.println("En Az Oy Alan: Kuresel " + sum4);
		} else if (min == sum5) {
			System.out.println("En Az Oy Alan: Kulturel " + sum5);
		}

	}
}
