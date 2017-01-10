package step2;

public class TestCar {
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.model = "sm5";
		System.out.println(c1.model);
		c1.price = 2000;
		System.out.println(c1.price);

		Car c2 = new Car();
		c2.model = "sonata";
		c2.price = 2500;
		System.out.println(c2.model + " " + c2.price);
	}
}
