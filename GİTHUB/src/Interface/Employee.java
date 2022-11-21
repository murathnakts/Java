package Interface;

public class Employee {
	protected String ayrac = "------------------";
	protected String name ,surname ,job;
	protected int salary,annualPermit;
	
	Employee(String name, String surname) {
		
		this.name = name;
		this.surname = surname;
		this.job = "Calisan";
		this.salary = 5500;
		this.annualPermit = 10;
	}
	
	Employee(String name, String surname, int salary) {
		
		this.name = name;
		this.surname = surname;
		this.salary = salary;
		this.annualPermit = 10;
		if(salary > 6000) {
			this.job = "Kidemli Calisan";
			annualPermit+=3;
		}else if (salary > 0 && salary <= 6000) {
			this.job = "Calisan";
			
		}else {
			this.job = "Stajyer";
			annualPermit = 0; 
		}
	}

	public Employee() {
		
	}
	
	public int makeRaise(int howMuch) {
		salary+=howMuch;
		return salary;
		
	}
	
	public int makeRaise(double howMuch) {
		double money = (double)salary*howMuch;
		makeRaise((int)money);
		return salary;
	}
	
	public void setJob(String job) {
		this.job = job;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void setAnnualPermit(int permit) {
		this.annualPermit = permit;
	}
	
	public String getJob() {
		return job;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public int getAnnualPermit() {
		return annualPermit;
	}
	
	public void info() {
		System.out.println(getJob() + " Bilgileri\n" + ayrac + "\nCalisan Ismi : " + name + "\nCalisan Soyismi : " + surname + 
		"\nGorevi : " + getJob() + "\nMaasi : " + salary + "\nIzin Gunu : " + getAnnualPermit() + " Is Gunu\n" + ayrac);
	}
	
	public void raiseInfo() {
		System.out.println(getJob() + "Zam Uygulamasi\n" + ayrac + "\nYeni Verilecek Maas : " + getSalary() + "\n" + ayrac);
	}
}