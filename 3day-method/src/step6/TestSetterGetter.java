package step6;

public class TestSetterGetter {
	public static void main(String[] args) {
		Car car = new Car();
		car.setModel("�ҳ�Ÿ");
		System.out.println(car.getModel());
		car.setPrice(2000);
		System.out.println(car.getPrice());
	}
}
