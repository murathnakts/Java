package Interface;

public class Square implements Polygon {
	
	public void getArea() {
		int length = 6;
		int area = length*length;
		
		System.out.println("Karenin Alani: " + area);
	}
	
	public void getSides() {
		System.out.println("Karenin Kenar Sayisi: 4");
	}
}
