package Inheritence;

public class HourlyEmployee extends Employee {
	
	protected int wage,day;
	
	public HourlyEmployee(String adı, String soyadı, String tc, int wage, int day) {
		super(adı, soyadı, tc);
		this.wage = wage;
		this.day = day;
	}
	
	public int earnings() {
		return wage*day;
	}
	
	public void write() {
		super.write();
		System.out.println("Aylik Kazanc: "+ earnings() + "TL ");
	}

	public int getWage() {
		return wage;
	}

	public void setWage(int wage) {
		this.wage = wage;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	
}
