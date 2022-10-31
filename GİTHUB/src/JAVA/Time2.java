package JAVA;

public class Time2 {

	private int hour;
	private int minute;
	private int second;

	public Time2() {

	}

	public Time2(int saat) {
		this.hour = saat;
	}

	public Time2(int saat, int dakika) {
		this.hour = saat;
		this.minute = dakika;
	}

	public Time2(int saat, int dakika, int saniye) {
		this.hour = saat;
		this.minute = dakika;
		this.second = saniye;
	}

	public void setSaat(int saat) {

		if (hour < 0 || hour > 23) {
			System.out.println("Yanlis Saat Girildi!!");
			return;
		}

		this.hour = hour;

	}

	public void setSaatDakika(int saat, int dakika) {

		if (hour < 0 || hour > 23 || minute < 0 || minute > 59) {
			System.out.println("Yanlis Saat Girildi!!");
			return;
		}

		this.hour = hour;
		this.minute = minute;

	}

	public void setSaatDakikaSaniye(int saat, int dakika, int saniye) {

		if (hour < 0 || hour > 23 || minute < 0 || minute > 59 || second < 0 || second > 59) {
			System.out.println("Yanlis Saat Girildi!!");
			return;
		}

		this.hour = hour;
		this.minute = minute;
		this.second = second;
		
	}
	

	public String saat () {
		
		
		return String.format("%02d:%02d:%02d",hour,minute,second);
		
	}
	
}
