package step5;

public class Account {
	//private ���������ڷ� �ܺ���������
	private int money;
	private String name;
	//public setter/getter�� ���������ϰ� �Ѵ�
	
	//setter : �ܺο��� ������ �Ҵ�
	public void setMoney(int m){
		money = m;
	}
	//getter method : �ܺη� ������ �����Ҷ� ���
	public int getMoney(){
		return money;
	}
	public void setName(String string) {
		name = string;
		
	}
	public String getName() {
		return name;
	}
}
