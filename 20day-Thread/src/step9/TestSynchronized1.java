package step9;
/*
 * ���� ������ ȯ�濡�� �׽�Ʈ
 * (���������� �����ϹǷ� ���� ����)
 */
class Toilet{
	private boolean seat; // ����Ʈ �ʱ�ȭ false
	public void use(String user) throws InterruptedException{
		if(seat==true){
		Thread.sleep(100);
		System.out.println(user+" ����");
		Thread.sleep(1000);
		seat=true;
		System.out.println(user+"���");
		Thread.sleep(2000);
		seat=false;
		}else{
			System.out.println(user+"�� ���� ȭ��� ������̹Ƿ� ���Ұ�~");
		}
	}
}
public class TestSynchronized1 {

}
