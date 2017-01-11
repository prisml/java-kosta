package step8;

public class TestSwitch3 {
	public static void main(String[] args) {
		MonthService service = new MonthService();
		int month = 2;
		service.printLastDay(month);
		month = 1;
		service.printLastDay(month);
		month = 4;
		service.printLastDay(month);
		month = 13;
		service.printLastDay(month);
	}
}
