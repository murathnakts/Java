package JAVA;

import java.util.ArrayList;

public class DiziList {
	
	public static void main(String[] args) {
		ArrayList<String> item = new ArrayList<String>();
		item.add("Red");
		item.add("Yellow");
		item.add(0, "Green");
		
		for (String renk : item) {
			System.out.print(renk + " ");
		}
		System.out.println("\n");
		item.remove("Red");
		
		for (String renk : item) {
			System.out.print(renk + " ");
		}
		System.out.println("\n");
		System.out.println(item.get(1));
		System.out.println();
		System.out.println(item.contains("Red") ? "Evet Var" : "Hayir Yok");
	}
}
