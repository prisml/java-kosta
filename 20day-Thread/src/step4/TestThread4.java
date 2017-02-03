package step4;
/*
 * 채팅 클라이언트
 * 나의 메세지를 서버로 출력(출력스레드)
 * 친구들의 메세지를 입력(입력스레드)
 */
class InputWorker implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<10;i++)
			System.out.println("입력스레드 실행"+i);
	}
	
}
class OutputWorker implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<10;i++)
			System.out.println("출력스레드 실행"+i);
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
		System.out.println("메인스레드 종료");
	}
}
