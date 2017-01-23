package step1;

public class Student extends Person {
	private String studentNumber;

	public Student() {
		super();
	}

	public Student(Student s) {
		super(s.getPhoneNumber(), s.getName(), s.getAddress());
		this.studentNumber = s.getStudentNumber();
	}

	public Student(String phoneNumber, String name, String address) {
		super(phoneNumber, name, address);
	}

	public Student(String studentNumber) {
		super();
		this.studentNumber = studentNumber;
	}

	public Student(String phoneNumber, String name, String address, String studentNumber) {
		super(phoneNumber, name, address);
		this.studentNumber = studentNumber;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	@Override
	public String toString() {
		return "��ȣ=" + super.getPhoneNumber() + ", �ּ�=" + super.getAddress()
		+ ", �̸�=" + super.getName() + ", �й�=" + studentNumber;
	}

}
