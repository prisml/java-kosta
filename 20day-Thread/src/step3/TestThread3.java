package step3;
class Worker implements Runnable{
	// Worker Thread�� ���೻��
	// jvm�� ���� ����
	@Override
	public void run() {
		for(int i=0;i< 10 ;i++)
			System.out.println("����(������)�� �����ϴ� " + i);
	}
	
}
public class TestThread3 {
	public static void main(String[] args) throws InterruptedException {
		Worker worker = new Worker();
		Thread t = new Thread(worker);
		t.start();
		Thread.sleep(1);
		System.out.println("���� ������ ����");
	}
}
