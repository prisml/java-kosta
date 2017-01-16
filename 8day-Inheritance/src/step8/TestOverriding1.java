package step8;

class Animal {
	public void eat() {
		System.out.println("�Դ�");
	}
}

class Person extends Animal {
	public void eat() {
		System.out.println("������ �Դ�");
	}
}

class Dog extends Animal {
}

class Student extends Person {
	public void eat(){
		super.eat();
		System.out.println("����Ʈ�� �Դ�");
	}
}

public class TestOverriding1 {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();
		Person p = new Person();
		p.eat();
		Student s = new Student();
		s.eat();
	}
}
