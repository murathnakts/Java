package JAVA;

public class Swap {
	
	public static void main(String[] args) {

		int[] array = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };

		int[] temp = new int[10];
		int total = 0;

		for (int i = 0; i < array.length; i++) {
			temp[i] = array[9 - i];
		}

		for (int i = 0; i < array.length; i++) {
			array[i] = temp[i];
		}

		for (int arra : array) {
			System.out.print(arra + " ");
			total += arra;
		}

		System.out.println("\n" + "Toplam: " + total + "\n");

		modifyArray(array);
		modifyElement(9);

	}

	public static void modifyArray(int[] array) {

		for (int arra : array) {

			arra += 2;
			System.out.print(arra + " ");
		}
	}

	public static void modifyElement(int sayi) {

		sayi *= 2;

		System.out.println("\nYeni Sayi: " + sayi);
	}
}
