package step7;

public class TestFileWorkerThread {
	public static void main(String[] args) {
		MakeFileWorker mw = new MakeFileWorker(1000, 30);
		Thread makeThread = new Thread(mw);
		makeThread.start();
		MoveFileWorker mw2 = new MoveFileWorker(7000, 5);
		Thread moveThread = new Thread(mw2);
		moveThread.start();
	}
}
