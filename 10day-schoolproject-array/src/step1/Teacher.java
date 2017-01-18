package step1;

public class Teacher extends Person {
	private String subject;

	public Teacher() {
		super();
	}

	public Teacher(Teacher t) {
		super(t.getPhoneNumber(), t.getName(), t.getAddress());
		this.subject = t.getSubject();
	}

	public Teacher(String phoneNumber, String name, String address) {
		super(phoneNumber, name, address);
	}

	public Teacher(String subject) {
		super();
		this.subject = subject;
	}

	public Teacher(String phoneNumber, String name, String address, String subject) {
		super(phoneNumber, name, address);
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "번호=" + super.getPhoneNumber() + ", 주소=" + super.getAddress() + ", 이름=" + super.getName() + ", 과목="
				+ subject;
	}
}
