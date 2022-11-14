package Inheritence;

public abstract class ThreeDimensionalShape extends Shape{

	public ThreeDimensionalShape(String isim, double deger) {
		super(isim, deger);
	}

	public abstract double yuzeyAlani();
	public abstract double hacim();
	
	
}
