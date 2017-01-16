package step5;

class Parent {
	private String name;

	public Parent(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

class Child extends Parent {
	private String id;

	// Child{super();}// �θ� ������ �Ű������� �´� �����͸� �Է��ؾ� �Ѵ�
	// ���� �⺻ �����ڸ� ȣ���ϹǷ� compile error �߻�
	public Child(String name, String id) {
		super(name);
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}

public class TestSuper2 {
	public static void main(String[] args) {
		Child c = new Child("������","java");
		System.out.println(c.getName());//��ӹ޾����Ƿ� ��� ����
		System.out.println(c.getId());
	}
}
