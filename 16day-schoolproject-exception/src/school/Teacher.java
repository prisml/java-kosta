package school;

public class Teacher extends Person {
	private String subject;

	public Teacher() {
		super();
	}

	public Teacher(Teacher t) {
		super(t.getTel(), t.getName(), t.getAddress());
		this.subject = t.getSubject();
	}

	public Teacher(String tel, String name, String address) {
		super(tel, name, address);
	}

	public Teacher(String subject) {
		super();
		this.subject = subject;
	}

	public Teacher(String tel, String name, String address, String subject) {
		super(tel, name, address);
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
		return "번호=" + super.getTel() + ", 주소=" + super.getAddress() + ", 이름=" + super.getName() + ", 과목="
				+ subject;
	}
}
