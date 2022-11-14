package Inheritence;

public class Cube extends ThreeDimensionalShape {

	public Cube(String isim, double deger) {
		super(isim, deger);
		// TODO Auto-generated constructor stub
	}

	
	public double yuzeyAlani() {
		return 6*deger*deger;
	}

	
	public double hacim() {
		return deger*deger*deger;
	}

}
