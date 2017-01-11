package step2;

public class TestOperator1 {
	public static void main(String[] args) {
		int i = 7;
		int j = 3;
		System.out.println(i*j);
		System.out.println(i/j);
		System.out.println(i%j);
		System.out.println(i==j);
		System.out.println("**************");
		boolean flag=false;
		System.out.println(flag);
		System.out.println(!flag);
		System.out.println("**************");
		int k=7;
		System.out.println(k++);
		System.out.println(k);
		System.out.println(++k);
		System.out.println(k);
		System.out.println("**************");
		System.out.println(--k);
		System.out.println(k--);
		System.out.println(k);
		System.out.println("**************");
		int balance=100;
		//balance=balance+200;
		//위 코드를 줄여서 표현하면
		balance+=200;
		System.out.println(balance);
		System.out.println("**************");
		/*
		 * 	& 와 | 연산과  && 와 || 연산은 결과는 같으나
		 *	성능에는 차이가 있다
		 * 
		 * 	and 연산
		 * 	true & true -> true
		 * 	나머진 거짓
		 * 
		 * 	&& 연산자를 이용하면 and 연산일 경우
		 * 	false 가 처음 도출되면 다음 연산은 생략하고
		 * 	결론을 낸다(성능 향상)
		 * 	
		 * 	or 연산
		 * 	false | false -> false
		 * 	나머진 참
		 * 
		 * 	|| 연산자를 이용하면 선행조건결과가 true이면
		 * 	다음 조건 연산하지 않고 바로 true로 결론을 낸다
		 */
		System.out.println(true||false);
		System.out.println(true&&false);
		System.out.println("**************");
		// 삼항연산자
		int x=10;
		//			조건식?참:거짓;
		int result=(x>0)?x+1:x+2;
		System.out.println(result);
	}
}
