package step4;
class A{
	A(){
		System.out.println("A ��ü ����");
	}
}
class B extends A{
	B(){
		System.out.println("B ��ü ����");
	}
}
class C extends B{
	C(){
		System.out.println("C ��ü ����");
	}
}
public class TestSuper1 {
	public static void main(String[] args) {
		C a = new C();
		// A -> B -> C ������ ��ü ����
	}
}
