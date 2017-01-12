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
		RentCar rc = new RentCar("소나타", 10);
		System.out.println(rc.getModel() + " 타고 " + name + " 여행하다");
	}
}
