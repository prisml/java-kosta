package step4;
/*
 * ä�� Ŭ���̾�Ʈ
 * ���� �޼����� ������ ���(��½�����)
 * ģ������ �޼����� �Է�(�Է½�����)
 */
class InputWorker implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<10;i++)
			System.out.println("�Է½����� ����"+i);
	}
	
}
class OutputWorker implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<10;i++)
			System.out.println("��½����� ����"+i);
	}
	
}
public class TestThread4 {
	public static void main(String[] args) {
		InputWorker iw = new InputWorker();
		OutputWorker ow = new OutputWorker();
		Thread t1, t2;
		t1 = new Thread(iw);
		t2 = new Thread(ow);
		t1.start();
		t2.start();
		System.out.println("���ν����� ����");
	}
}
