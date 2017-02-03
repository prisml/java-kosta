package step1;

class Worker{
	public void work()
	{
		for(int i=0;i< 10 ;i++)
			System.out.println("직원이 일을하다 " + i);
	}
}
public class TestThread1 {
	public static void main(String[] args) {
		Worker w = new Worker();
		w.work();
		System.out.println("main thread 종료");
	}
}
