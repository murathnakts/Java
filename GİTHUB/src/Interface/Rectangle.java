package Interface;

public class Rectangle implements Polygon {
	
	public void getArea() {
		int length = 6;
		int length2 = 5;
		int area = length*length2;
		
		System.out.println("Dikdortgenin Alani: " + area);
	}
	
	public void getSides() {
		System.out.println("Dikdortgenin Kenar Sayisi: 4");
	}
}
