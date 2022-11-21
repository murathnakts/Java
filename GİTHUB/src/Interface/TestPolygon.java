package Interface;

public class TestPolygon {

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		
		r.getArea();
		r.getSides();
		r.getPerimeter(5,6,5,6);
		
		Square s = new Square();
		
		s.getArea();
		s.getSides();
		s.getPerimeter(6,6,6,6);
		
		Triangle t = new Triangle(5, 6, 7);
		
		t.getArea();
		t.getPerimeter(5,6,7);
		t.getSides();

	}

}
