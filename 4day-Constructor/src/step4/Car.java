package step4;

public class Car {
	private String model; // instance variable
	// constructor
	public Car(String model) // model -> local variable
	{
		this.model = model;
	}
	public String getModel() { // method getter
		return model;
	}
	public void setModel(String model) { // method setter
		this.model = model;
	}
}
