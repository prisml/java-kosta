package step6;
class Worker extends Thread{

	@Override
	public void run() {
		for(long i=0;i<9000000000l;i++);
		System.out.println(getName() + "�� ������ ����Ϸ�.. �켱����"+ getPriority());
	}
	
}
public class TestThread6 {
	public static void main(String[] args) {
		/*Worker t1 = new Worker();
		t1.setName("ù��° �ϲ�");
		Worker t2 = new Worker();
		t2.setName("�ι�° �ϲ�");
		t1.start();t2.start();
		System.out.println(Thread.MAX_PRIORITY);
		System.out.println(Thread.MIN_PRIORITY);
		System.out.println(Thread.NORM_PRIORITY);*/
		/*
		 * ������ ����� �׽�Ʈ�� ����
		 * Worker Thread 20�� �����ϰ� 
		 * ������ �����忡 �̸��� ����(0��° ������)�ϰ�
		 * 10�� �ε����� �ش��ϴ� ������ �ϳ��� setPriority(10)
		 * ������ 19���� setPriority(1);
		 */
		for(int i=0;i<20;i++)
		{
			Worker t = new Worker();
			t.setName(i+"");
			if(i==10) t.setPriority(10);
			else t.setPriority(1);
			t.start();
		}
	}
}
