package step5;

public class Person {
	private String name;

	public Person() {
	}

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void tour() {
		RentCar rc = new RentCar("�ҳ�Ÿ", 10);
		System.out.println(rc.getModel() + " Ÿ�� " + name + " �����ϴ�");
	}
}
