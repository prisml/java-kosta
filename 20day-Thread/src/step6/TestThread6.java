package step6;
class Worker extends Thread{

	@Override
	public void run() {
		for(long i=0;i<9000000000l;i++);
		System.out.println(getName() + "번 스레드 실행완료.. 우선순위"+ getPriority());
	}
	
}
public class TestThread6 {
	public static void main(String[] args) {
		/*Worker t1 = new Worker();
		t1.setName("첫번째 일꾼");
		Worker t2 = new Worker();
		t2.setName("두번째 일꾼");
		t1.start();t2.start();
		System.out.println(Thread.MAX_PRIORITY);
		System.out.println(Thread.MIN_PRIORITY);
		System.out.println(Thread.NORM_PRIORITY);*/
		/*
		 * 스레드 운선순위 테스트를 위해
		 * Worker Thread 20개 생성하고 
		 * 각각의 스레드에 이름을 설정(0번째 스레드)하고
		 * 10번 인덱스에 해당하는 스레드 하나만 setPriority(10)
		 * 나머지 19개는 setPriority(1);
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
