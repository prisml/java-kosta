package step2;
class Person{
	int age=1;
	static int sAge=1;
	public static void test(){
		System.out.println("static test ½ÇÇà");
	}
}
public class TestStatic1 {
	public static void main(String[] args) {
		Person p = new Person();
		Person a = new Person();
		System.out.println(p.age);
		System.out.println(Person.sAge);
		p.sAge++;
		Person.test();
		System.out.println(a.sAge);
	}
}