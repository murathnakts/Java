package Inheritence;

public class Shape {
	
	protected String isim;
	protected double deger;
	
	public Shape(String isim, double deger) {
		super();
		this.isim = isim;
		this.deger = deger;
	}


	public String getIsim() {
		return isim;
	}


	public void setIsim(String isim) {
		this.isim = isim;
	}

	
}
