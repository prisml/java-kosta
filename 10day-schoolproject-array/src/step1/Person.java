package step1;

public class Person {
	private String phoneNumber;
	private String address;
	private String name;

	public Person() {
		super();
	}

	public Person(Person p) {
		super();
		this.phoneNumber = p.getPhoneNumber();
		this.address = p.getAddress();
		this.name = p.getName();
	}

	public Person(String phoneNumber, String name, String address) {
		super();
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "번호=" + phoneNumber + ", 주소=" + address + ", 이름=" + name;
	}
}
