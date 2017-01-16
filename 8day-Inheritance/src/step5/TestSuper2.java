package step5;

class Parent {
	private String name;

	public Parent(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

class Child extends Parent {
	private String id;

	// Child{super();}// 부모 생성자 매개변수에 맞는 데이터를 입력해야 한다
	// 위는 기본 생성자를 호출하므로 compile error 발생
	public Child(String name, String id) {
		super(name);
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}

public class TestSuper2 {
	public static void main(String[] args) {
		Child c = new Child("아이유","java");
		System.out.println(c.getName());//상속받았으므로 사용 가능
		System.out.println(c.getId());
	}
}
