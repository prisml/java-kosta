package step6;
abstract class Parent{
	public void eat(){
		System.out.println("�Դ�");
	}
	// abstract method : ������ ���� ���� �Ѵ�
	// �ڽ� Ŭ�������� ������ �����Ѵ�
	// abstract method�� �ϳ� �̻� �����ϸ� �� Ŭ������
	// abstract class�� ����Ǿ�� �Ѵ�
	public abstract void study();
}
class Child extends Parent {

	// �θ� Ŭ������ abstract method�� �ݵ�� �����ؾ�
	// ��ü ���� ������ �ڽ� Ŭ������ �� �� �ִ�
	public void study() {
		System.out.println("�����ϴ�");
	}
	
}
public class TestAbstract1 {
	public static void main(String[] args) {
		Child c = new Child();
		c.eat();
		c.study();
	}
}
