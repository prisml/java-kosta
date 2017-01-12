package step4;

public class MyDate {
	int month=1;
	int day=1;

	public MyDate() {}

	public MyDate(int month, int day) {
		if (month > 0 && month < 13 && day > 0 && day < 32) {
			this.month = month;
			this.day = day;
		}
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

}
