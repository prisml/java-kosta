package step5;
/*
 * �������� ������ ���񽺸� ���� ( ex - ä�� or �α��� or �˻� )
 * --> Thread class 1�� ����
 * �ټ��� Ŭ���̾�Ʈ�� ���ÿ� �����ϸ�
 * ���������� Ŭ���̾�Ʈ ���� ���� �����带 �����ؾ� �Ѵ�
 */
class ServerWorker implements Runnable{
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		for(int i=0;i<10;i++)
			System.out.println(name + " ����-�˻�����"+i);
	}
}
public class TestThread5 {
	public static void main(String[] args) {
		ServerWorker sw = new ServerWorker();
		Thread t1 = new Thread(sw,"ù��° �ϲ�");
		Thread t2 = new Thread(sw,"�ι�° �ϲ�");
		t1.start();t2.start();
		System.out.println("main");
	}
}
