package JAVA;

import java.util.Arrays;

public class Diziler {

	public static void main(String[] args) {

		double[] Array = { 6.4, 9.3, 0.2, 7.9, 3.4 };
		Arrays.sort(Array);
		System.out.printf("doubleArray: ");

		for (double arra : Array) {
			System.out.printf("%.1f ", arra);
		}

		int filledIntArray[] = new int[10];
		Arrays.fill(filledIntArray, 7);
		displayArray(filledIntArray, "intArray");

		int[] intArray = { 1, 2, 3, 4, 5, 6 };
		int[] intArrayCopy = new int[intArray.length];
		System.arraycopy(intArray, 0, intArrayCopy, 0, intArray.length);
		displayArray(intArray, "intArray");
		displayArray(intArrayCopy, "intArrayCopy");

		boolean b = Arrays.equals(intArray, intArrayCopy);
		System.out.printf("%n%nintArray %s intArrayCopy %n", (b ? "==" : "!="));

		b = Arrays.equals(intArray, filledIntArray);
		System.out.printf("int Array %s filledIntArray", (b ? "==" : "!="));
	}

	public static void displayArray(int[] array, String string) {
		System.out.printf("%n%s: ", string);

		for (int value : array) {
			System.out.printf("%d ", value);
		}

	}

}
