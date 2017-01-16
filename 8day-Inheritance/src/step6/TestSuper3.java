package step6;

public class TestSuper3 {
	public static void main(String[] args) {
		Person p  = new Person("공유");
		System.out.println(p.getName());
		Teacher t = new Teacher("송강호","영화");
		System.out.println(t.getName());
		System.out.println(t.getSubject());
	}
}
