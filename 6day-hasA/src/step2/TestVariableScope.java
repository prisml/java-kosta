package step2;

public class TestVariableScope {
	// instance variable : heap 영역 저장, 기본 초기화 0
	private int i;
	public void test1(){
		int j; // local variable
		System.out.println(i); // 기본초기화되어 0 출력
		//System.out.println(j); // j는 지역변수이므로 초기화 필요
		int k=0; // 지역변수는 명시적 초기화해야 사용 가능
		System.out.println(k);
	}
	public void test2(int i){
		System.out.println(i);
		System.out.println(this.i);
		int j=2;
	}
	public void test3(){
		System.out.println(i);
		//System.out.println(j);
	}
	public void test4(){
		if(i<=0){
			int k=5;
		}
		//System.out.println(k); // error
		// 선언된 자신의 실행영역 내에서만 사용 가능하다.
	}
	public void test5(){
		int k=0;
		if(i<=0)
			k=5;
		System.out.println(k);
	}
	public static void main(String[] args) {
		// 메인메서드는 static 이므로 같은 클래스의 메서드라도
		// 객체를 생성해서 호출해야 한다 ( static은 다음주에 공부 예정)
		TestVariableScope t = new TestVariableScope();
		t.test1();
	}
}
