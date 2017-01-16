package step8;

class Animal {
	public void eat() {
		System.out.println("¸Ô´Ù");
	}
}

class Person extends Animal {
	public void eat() {
		System.out.println("¼öÀú·Î ¸Ô´Ù");
	}
}

class Dog extends Animal {
}

class Student extends Person {
	public void eat(){
		super.eat();
		System.out.println("µğÀúÆ®¸¦ ¸Ô´Ù");
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
