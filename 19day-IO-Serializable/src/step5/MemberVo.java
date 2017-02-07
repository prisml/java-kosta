package step5;

import java.io.Serializable;

public class MemberVo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5613773078790675416L;
	private String id;
	private transient String password;
	private String name;
	private String address;
	public MemberVo(String id, String password, String name, String address) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.address = address;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}