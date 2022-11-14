package Inheritence;

public class Tetrahedrom extends ThreeDimensionalShape {

	public Tetrahedrom(String isim, double deger) {
		super(isim, deger);
	}

	
	public double yuzeyAlani() {
		return 1.73*deger*deger;
	}

	
	public double hacim() {
		return 0.12*deger*deger*deger;
	}

}
