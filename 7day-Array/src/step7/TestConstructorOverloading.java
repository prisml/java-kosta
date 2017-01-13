package step7;

class Car {
	private String model;
	private int price;
	private String color;

	public Car() {
	}

	public Car(String model) {
		this.model = model;
	}

	public Car(int price) {
		this.price = price;
	}

	public Car(String model, int price) {
		this.model = model;
		this.price = price;
	}

	Car(String model, int price, String color) {
		this(model, price);
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}

public class TestConstructorOverloading {
	public static void main(String[] args) {
		// �Ʒ��� ���� �پ��� �ɼ����� ��ü ������ �� �� �ִ�
		/*
		 * Car c1 = new Car(); Car c2 = new Car("���"); Car c3 = new Car("����ũ",
		 * 100);
		 */
	}
}
