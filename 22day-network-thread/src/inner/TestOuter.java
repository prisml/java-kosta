package inner;
/*
 * Inner class(Nested class)�� ����ϴ� ������
 * Outer class�� private member�� ���� ������ ����ϱ� ���ؼ���
 * (private member�� �ٸ� Ŭ���������� ���� �Ұ�������
 *  Inner class �� ���ܷ� �Ѵ�)
 *  ����) Inner class ������ �� class���� : Outer$Inner.class
 */
class Outer{
	private String password; // private���� ���������Ƿ� �ٸ� Ŭ���������� ���� �Ұ�
	Outer(String password){
		this.password = password;
	}
	class Inner{
		public void teset(){
			// Outer class�� private member�� ���� ���� �� ��� ����
			System.out.println(password);
		}
	}
}

public class TestOuter {
	public static void main(String[] args){
		Outer outer = new Outer("javaking");
		// Inner class (or Nested Class) ��ü ������ ���ؼ���
		// Outer class ��ü ������ �����Ǿ�� �Ѵ�
		Outer.Inner inner = outer.new Inner();
		inner.teset();
	}
}
