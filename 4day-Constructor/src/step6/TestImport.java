package step6;

import step4.Car;
import step5.MemberVO;

public class TestImport {
	public static void main(String[] args) {
		MemberVO mvo = new MemberVO("KTX","æ∆¿Ã¿Ø");
		System.out.println(mvo.getId() + " " + mvo.getName());
		Car c = new Car("K5");
		System.out.println(c.getModel());
	}
}
