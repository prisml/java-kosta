package step1;
interface Flyer{
	String ID = "javaking"; // public static final �� �ڵ� ����
	public static void test(){// jdk 1.8���� ����
		System.out.println("interface�� static method ������ �� �ִ�");
	}
	// public void fly(){} // compile error ��ü�� ������ �޼��带 ������ �� ����
	public void fly();
}
class Animal{}
class Bird extends Animal implements Flyer{
	@Override
	public void fly() {
		System.out.println("���� ����");
	}
}
class Airplane implements Flyer{
	public void fly() {
		System.out.println("����Ⱑ ����");
	}
}
// interface�� �����Ͽ� ���� ������ �����ϰ� �Ѵ�
public class TestInterface1 {
	public static void main(String[] args) {
		// ���� �������̽� Ÿ���� ������ ���� ��ü ���� ����
		// ������ �����ȴ�
		Flyer f1 = new Bird();
		f1.fly();
		Flyer f2 = new Airplane();
		f2.fly();
		// Animal�� Flyer�� implement ���� �ʾұ� ������ error
		// Flyer f3 = new Animal(); 
		// f2.ID = "STAR"; // final ����̹Ƿ� ���Ҵ� �Ұ�
		System.out.println(Flyer.ID);
		Flyer.test();
		// �� �� ����ó�� interface�� �߻�޼���(�߿�) ���� �ܿ�
		// static final ��� �� static method(1.8��������)�� ���� �� �� �ִ�
	}
}
