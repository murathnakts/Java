package JAVA;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Oylama2 {

	public static void main(String[] args) {
		HashMap cevaplar = new HashMap();
		Scanner input = new Scanner(System.in);
		String sorunlar[] = { "Siyaset", "Ekonomi", "Cevre", "Kuresel", "Kulturel" };
		int cevap1, cevap2, cevap3, cevap4, cevap5, devam = 1, i = 0, g = 0;
		double ort1, ort2, ort3, ort4, ort5;
		int sum1 = 0, sum2 = 0, sum3 = 0, sum4 = 0, sum5 = 0;
		int max = sum1;

		while (devam == 1) {
			g++;
			System.out.printf("Teste Hosgeldiniz %d. kisi\n", g);
			System.out.println("Lutfen sorulara 1-10 arasi bir puan veriniz!!");

			System.out.println(sorunlar[0] + " Hakkindaki Yorumunuz Nedir? ");
			cevap1 = input.nextInt();
			while (cevap1 <= 0 || cevap1 > 10) {
				System.out.println("Hatali Giris Yaptiniz!!!");
				System.out.println("1-10 Arasi Deger Girmeniz Gerekmektedir.");
				System.out.println(sorunlar[0] + " Hakkindaki Yorumunuz Nedir? ");
				cevap1 = input.nextInt();
			}
			cevaplar.put(i, cevap1);

			System.out.println(sorunlar[1] + " Hakkindaki Yorumunuz Nedir? ");
			cevap2 = input.nextInt();
			while (cevap2 <= 0 || cevap2 > 10) {
				System.out.println("Hatali Giris Yaptiniz!!!");
				System.out.println("1-10 Arasi Deger Girmeniz Gerekmektedir.");
				System.out.println(sorunlar[1] + " Hakkindaki Yorumunuz Nedir? ");
				cevap2 = input.nextInt();
			}
			cevaplar.put(i + 1, cevap2);

			System.out.println(sorunlar[2] + " Hakkindaki Yorumunuz Nedir? ");
			cevap3 = input.nextInt();
			while (cevap3 <= 0 || cevap3 > 10) {
				System.out.println("Hatali Giris Yaptiniz!!!");
				System.out.println("1-10 Arasi Deger Girmeniz Gerekmektedir.");
				System.out.println(sorunlar[2] + " Hakkindaki Yorumunuz Nedir? ");
				cevap3 = input.nextInt();
			}
			cevaplar.put(i + 2, cevap3);

			System.out.println(sorunlar[3] + " Hakkindaki Yorumunuz Nedir? ");
			cevap4 = input.nextInt();
			while (cevap4 <= 0 || cevap4 > 10) {
				System.out.println("Hatali Giris Yaptiniz!!!");
				System.out.println("1-10 Arasi Deger Girmeniz Gerekmektedir.");
				System.out.println(sorunlar[3] + " Hakkindaki Yorumunuz Nedir? ");
				cevap4 = input.nextInt();
			}
			cevaplar.put(i + 3, cevap4);

			System.out.println(sorunlar[4] + " Hakkindaki Yorumunuz Nedir? ");
			cevap5 = input.nextInt();
			while (cevap5 <= 0 || cevap5 > 10) {
				System.out.println("Hatali Giris Yaptiniz!!!");
				System.out.println("1-10 Arasi Deger Girmeniz Gerekmektedir.");
				System.out.println(sorunlar[4] + " Hakkindaki Yorumunuz Nedir? ");
				cevap5 = input.nextInt();
			}
			cevaplar.put(i + 4, cevap5);
			i += 5;

			System.out.println("Teste devam etmek isterseniz 1'e basin.");
			devam = input.nextInt();
			System.out.println();

		}
		
		System.out.println("-----------------------------------------------------");
		System.out.println("Kisiler  |" + sorunlar[0] +" |"+ sorunlar[1] +" |"+ sorunlar[2] +" |"+ sorunlar[3] +" |"+ sorunlar[4]+"|");
		System.out.println("---------|--------|--------|------|--------|--------|");
		
		for (int j = 0; j < g*5; j += 5) {
			if(j/5 + 1 > 9) {
				System.out.printf("%d.kisi  |   %d    |   %d    |  %d   |   %d    |   %d    |", j / 5 + 1, cevaplar.get(j),
						cevaplar.get(j + 1), cevaplar.get(j + 2), cevaplar.get(j + 3), cevaplar.get(j + 4));
				System.out.println();
			}else {
			System.out.printf("0%d.kisi  |   %d    |   %d    |  %d   |   %d    |   %d    |", j / 5 + 1, cevaplar.get(j),
					cevaplar.get(j + 1), cevaplar.get(j + 2), cevaplar.get(j + 3), cevaplar.get(j + 4));
			System.out.println();
			}
		}
	

		int ilk[] = new int[g];
		int ikinci[] = new int[g];
		int ucuncu[] = new int[g];
		int dorduncu[] = new int[g];
		int besinci[] = new int[g];

		for (int k = 0; k < g * 5; k += 5) {
			ilk[k / 5] = (int) cevaplar.get(k);
			ikinci[k / 5] = (int) cevaplar.get(k + 1);
			ucuncu[k / 5] = (int) cevaplar.get(k + 2);
			dorduncu[k / 5] = (int) cevaplar.get(k + 3);
			besinci[k / 5] = (int) cevaplar.get(k + 4);

		}

		for (int value : ilk) {
			sum1 = sum1 + value;
		}
		for (int value : ikinci) {
			sum2 = sum2 + value;
		}
		for (int value : ucuncu) {
			sum3 = sum3 + value;
		}
		for (int value : dorduncu) {
			sum4 = sum4 + value;
		}
		for (int value : besinci) {
			sum5 = sum5 + value;
		}

		ort1 = (double) sum1 / ilk.length;
		ort2 = (double) sum2 / ikinci.length;
		ort3 = (double) sum3 / ucuncu.length;
		ort4 = (double) sum4 / dorduncu.length;
		ort5 = (double) sum5 / besinci.length;

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

		System.out.println("---------|--------|--------|------|--------|--------|");
		System.out.printf("Ortalama |  %.2f  |  %.2f  | %.2f |  %.2f  |  %.2f  |\n", ort1, ort2, ort3, ort4, ort5);
		System.out.println("-----------------------------------------------------");
		if (max == sum1) {
			System.out.println("En Cok Oy Alan: " + sorunlar[0]);
		} else if (max == sum2) {
			System.out.println("En Cok Oy Alan: " + sorunlar[1]);
		} else if (max == sum3) {
			System.out.println("En Cok Oy Alan: " + sorunlar[2]);
		} else if (max == sum4) {
			System.out.println("En Cok Oy Alan: " + sorunlar[3]);
		} else if (max == sum5) {
			System.out.println("En Cok Oy Alan: " + sorunlar[4]);
		}
		
		if (min == sum5) {
			System.out.println("En Az Oy Alan: " + sorunlar[4]);
		} else if (min == sum4) {
			System.out.println("En Az Oy Alan: " + sorunlar[3]);
		} else if (min == sum3) {
			System.out.println("En Az Oy Alan: " + sorunlar[2]);
		} else if (min == sum2) {
			System.out.println("En Az Oy Alan: " + sorunlar[1]);
		} else if (min == sum1) {
			System.out.println("En Az Oy Alan: " + sorunlar[0]);
		}

	}
		
	}


