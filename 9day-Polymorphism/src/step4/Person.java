package step4;

public class Person extends Animal{
	public void play(){ //메서드 오버라이딩
		System.out.println("사람이 데이트 하며 놀다");
	}
	public void ticketing(){// Person의 독자적인 메서드
		System.out.println("사람이 티켓을 구매하다");
	}
}