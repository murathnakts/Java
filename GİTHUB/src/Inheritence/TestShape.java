package Inheritence;

public class TestShape {

	public static void main(String[] args) {
		Circle c = new Circle("Daire", 5);
		System.out.println(c.getIsim() + "'nin Alani " + c.alan());
		
		Square s = new Square("Kare", 5);
		System.out.println(s.getIsim() + "'nin Alani " + s.alan());
		
		Triangle t = new Triangle("Ucgen", 5);
		System.out.println(t.getIsim() + "'nin Alani " + t.alan());
				
		Cube cu = new Cube("Kup", 5);
		System.out.println(cu.getIsim() + "'un Yuzey Alani " + cu.yuzeyAlani() + " Hacmi " + cu.hacim());
		
		Sphere sp = new Sphere("Kure", 5);
		System.out.println(sp.getIsim() + "'nin Yuzey Alani " + sp.yuzeyAlani() + " Hacmi " + sp.hacim());
		
		Tetrahedrom te = new Tetrahedrom("Piramit", 5);
		System.out.println(te.getIsim() + "'in Yuzey Alani " + te.yuzeyAlani() + " Hacmi " + te.hacim());
	}

}
