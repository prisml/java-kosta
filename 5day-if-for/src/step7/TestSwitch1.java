package step7;

public class TestSwitch1 {
	public static void main(String[] args) {
		int grade=2;
		switch(grade){
		case 1: System.out.println("하버드"); break;
		case 2: System.out.println("옥스퍼드"); break;
		case 3: System.out.println("북경대"); break;
		default:System.out.println("판교대");
		}
	}
}
