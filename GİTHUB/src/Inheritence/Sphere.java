package Inheritence;

public class Sphere extends ThreeDimensionalShape{

	public Sphere(String isim, double deger) {
		super(isim, deger);
		
	}

	public double yuzeyAlani() {
		return 4*3.14*deger*deger;
	}
	
	public double hacim() {
		return (4/3)*3.14*deger*deger*deger;
	}

}
