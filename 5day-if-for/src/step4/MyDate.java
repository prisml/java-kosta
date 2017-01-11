package step4;

public class MyDate {
	private int day;
	private int month;

	public MyDate() {
	}

	public MyDate(int day) {
		this.day = day;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		if (day < 32 && day > 0)
			this.day = day;
		else
			System.out.println("잘못된 일입니다");
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if (month < 13 && month > 0)
			this.month = month;
		else
			System.out.println("잘못된 월입니다");

	}
}
