package school;

import java.io.Serializable;

public class Employee extends Person  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3663336652483018998L;
	private String department;

	public Employee() {
		super();
	}

	public Employee(Employee e) {
		super(e.getTel(), e.getAddress(), e.getName());
		this.department = e.getDepartment();
	}

	public Employee(String tel, String name, String address) {
		super(tel, name, address);
	}

	public Employee(String department) {
		super();
		this.department = department;
	}

	public Employee(String tel, String address, String name, String department) {
		super(tel, name, address);
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
		return "��ȣ=" + super.getTel() + ", �ּ�=" + super.getAddress()
				+ ", �̸�=" + super.getName() + ", �μ�=" + department;
	}
}
