package step3;
class Worker implements Runnable{
	// Worker Thread의 실행내용
	// jvm에 의해 실행
	@Override
	public void run() {
		for(int i=0;i< 10 ;i++)
			System.out.println("직원(스레드)이 일을하다 " + i);
	}
	
}
public class TestThread3 {
	public static void main(String[] args) throws InterruptedException {
		Worker worker = new Worker();
		Thread t = new Thread(worker);
		t.start();
		Thread.sleep(1);
		System.out.println("메인 스레드 종료");
	}
}
