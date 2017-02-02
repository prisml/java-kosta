package step6;

import java.io.Serializable;

public class FoodVO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1368572017913190997L;
	private String name;
	private int price;
	public FoodVO(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "FoodVO [name=" + name + ", price=" + price + "]";
	}
}
