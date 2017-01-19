package step7.model;

public abstract class PizzaService {
	protected void prepare(){
		System.out.println("���츦 �����");
	}
	protected abstract void topping();
	protected void bake(){
		System.out.println("����");
	}
	protected void cut(){
		System.out.println("�ڸ���");
	}
	protected void box(){
		System.out.println("������ �ϴ�");
	}
	// template method
	public void makePizza(){
		prepare();
		topping();
		bake();
		cut();
		box();
	}
}
