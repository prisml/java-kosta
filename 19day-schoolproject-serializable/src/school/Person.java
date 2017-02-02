package school;

import java.io.Serializable;

public class Person  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4941182977490629855L;
	private String tel;
	private String address;
	private String name;

	public Person() {
		super();
	}

	public Person(String phoneNumber, String name, String address) {
		super();
		this.tel = phoneNumber;
		this.address = address;
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
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
		return "번호=" + tel + ", 주소=" + address + ", 이름=" + name;
	}
}
