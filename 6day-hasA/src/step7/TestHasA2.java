package step7;

public class TestHasA2 {
	public static void main(String[] args) {
		Car c = new Car("¼Ò³ªÅ¸",new Engine("GDI",2500));
		System.out.println(c.getModel());
		System.out.println(c.getEngine().getType());
		System.out.println(c.getEngine().getDisplacement());
		c.setEngine("Hybrid");
		System.out.println(c.getEngine().getType());
	}
}
