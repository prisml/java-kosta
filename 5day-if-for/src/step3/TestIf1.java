package step3;

public class TestIf1 {
	public static void main(String[] args) {
		int age=25;
		if(age>18)
			System.out.println("성인");
		else if(age>13)
			System.out.println("청소년");
		else if(age>0)
			System.out.println("아이");
		else
			System.out.println("잘못된 입력값");
	}
}
