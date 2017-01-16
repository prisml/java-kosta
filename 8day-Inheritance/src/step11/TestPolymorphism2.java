package step11;

class Animal{
	public void eat(){
		System.out.println("¸Ô´Ù");
	}
}
class Person extends Animal{
	public void eat(){
		System.out.println("¼öÀú·Î ¸Ô´Ù");
	}
}
class Dog extends Animal{}
class Cat extends Animal{}
class Truck{}

class Service{
	public void receive(Animal a){
		a.eat();
	}
}

public class TestPolymorphism2 {
	public static void main(String[] args) {
		Service service = new Service();
		service.receive(new Animal());
		service.receive(new Person());
		service.receive(new Dog());
		service.receive(new Cat());
	}
}
