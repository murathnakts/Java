package JAVA;

public class TimeTest {

	public static void main(String[] args) {
		/*
		 * Time1 saat = new Time1(); saat.setTime(22, 15, 36);
		 * System.out.println(saat.saat()); saat.setTime(30, 56, 12);
		 * System.out.println(saat.saat()); System.out.println("Set Sayisi: " +
		 * Time1.getcount());
		 */

		Time2 saat2 = new Time2(9, 30);
		saat2.setSaatDakika(9, 30);
		System.out.println(saat2.saat());
		Time2 saat3 = new Time2(3, 27, 45);
		System.out.println(saat3.saat());

	}

}
