package step2;
class Animal{
	private int age = 1;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
class Person extends Animal{
	public void study(){
		System.out.println("공부하다");
	}
}
public class TestInheritance2 {
	public static void main(String[] args) {
		Person p = new Person();
		System.out.println(p.getAge());
	}
}
