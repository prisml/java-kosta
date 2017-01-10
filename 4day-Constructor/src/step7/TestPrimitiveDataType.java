package step7;

public class TestPrimitiveDataType {
	public static void main(String[] args) {
		// 정수형
		byte b1=11;
		//참고 : byte형의 최대값 최소값
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		// byte b2=130; //최대값을 넘으므로 error
		short s=130; // 2byte
		int i=130; // 4byte
		long lo=130; // 8byte 이므로 가능
		// 실수형
		// float f=3.14; // 실수형의 기본형은 double이므로 error
		float f=3.14f; // float형임을 f로 명시해 알려준다
		double d=3.14; // 실수형의 기본형 8byte
		// answkgud
		//char c='헐ㅎ'; char 형은 한 문자만 가능하므로 error
		char c='헐';
		//논리형 boolean 형은 오직 true or false만 가능
		boolean flag=true;
		boolean bo=false;
		byte by1=1;
		byte by2=2;
		//byte by3=by1+by2; //--> 연산 후에는 정수형의 기본인 int형으로 인식
		// 해결방안은 첫번째 by3의 타입을 int로 변경하면 된다.
		int by3=by1+by2;
		// 두번째 방안은 연산결과를 byte형으로 캐스팅하면 된다.
		byte by4=(byte)(by1+by2);
	}
}
