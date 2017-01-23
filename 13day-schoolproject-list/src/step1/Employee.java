package step1;

public class Employee extends Person {
	private String department;

	public Employee() {
		super();
	}

	public Employee(Employee e) {
		super(e.getPhoneNumber(), e.getAddress(), e.getName());
		this.department = e.getDepartment();
	}

	public Employee(String phoneNumber, String name, String address) {
		super(phoneNumber, name, address);
	}

	public Employee(String department) {
		super();
		this.department = department;
	}

	public Employee(String phoneNumber, String address, String name, String department) {
		super(phoneNumber, name, address);
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		super.toString();
		return "번호=" + super.getPhoneNumber() + ", 주소=" + super.getAddress()
				+ ", 이름=" + super.getName() + ", 부서=" + department;
	}
}
