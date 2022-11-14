package Inheritence;

import java.util.Scanner;

public class TestEmployee {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Adinizi Giriniz: ");
		String isim = input.next();
		System.out.println("Soyadinizi Giriniz: ");
		String soyisim = input.next();
		System.out.println("Tc Giriniz: ");
		String tc = input.next();
		System.out.println("Gunluk Kazanc Giriniz: ");
		int wage = input.nextInt();
		System.out.println("Calistiginiz Gun Sayisi Giriniz: ");
		int days = input.nextInt();
		
		HourlyEmployee h = new HourlyEmployee(isim, soyisim, tc, wage, days);
		
		h.write();

	}

}
