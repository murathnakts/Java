package Interface;

public interface Polygon {

	void getArea();

	default void getSides() {
		System.out.println("Kenar Sayisi");
	}

	default void getPerimeter(int... sides) {
		int perimeter = 0;
		for (int side : sides) {
			perimeter += side;
		}
		System.out.println("Cevresi: " + perimeter);
	}

}
