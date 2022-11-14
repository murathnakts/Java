package Inheritence;

public class Employee {
	protected String adı, soyadı, tc;

	public Employee(String adı, String soyadı, String tc) {
		this.adı = adı;
		this.soyadı = soyadı;
		this.tc = tc;
	}

	public void write() {
		System.out.println(tc + " " + adı + " " + soyadı);
	}

	public String getAdı() {
		return adı;
	}

	public void setAdı(String adı) {
		this.adı = adı;
	}

	public String getSoyadı() {
		return soyadı;
	}

	public void setSoyadı(String soyadı) {
		this.soyadı = soyadı;
	}

	public String getTc() {
		return tc;
	}

	public void setTc(String tc) {
		this.tc = tc;
	}
}
