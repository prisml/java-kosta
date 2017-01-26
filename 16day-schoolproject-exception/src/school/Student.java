package school;

public class Student extends Person {
	private String studentNumber;

	public Student() {
		super();
	}

	public Student(Student s) {
		super(s.getTel(), s.getName(), s.getAddress());
		this.studentNumber = s.getStudentNumber();
	}

	public Student(String tel, String name, String address) {
		super(tel, name, address);
	}

	public Student(String studentNumber) {
		super();
		this.studentNumber = studentNumber;
	}

	public Student(String tel, String name, String address, String studentNumber) {
		super(tel, name, address);
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
		return "번호=" + super.getTel() + ", 주소=" + super.getAddress()
		+ ", 이름=" + super.getName() + ", 학번=" + studentNumber;
	}

}
