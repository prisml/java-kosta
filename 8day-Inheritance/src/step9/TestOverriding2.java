package step9;

public class TestOverriding2 {
	public static void main(String[] args) {
		Employee e = new Employee("������",300);
		Manager m = new Manager("�豸��",500,"������");
		System.out.println(e.getDetails());
		System.out.println(m.getDetails());
	}
}
