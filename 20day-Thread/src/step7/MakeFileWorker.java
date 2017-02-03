package step7;

import java.io.File;
import java.io.IOException;
import java.util.Random;

public class MakeFileWorker implements Runnable {

	private int time;
	private int count;

	public MakeFileWorker(int time, int count) {
		this.time = time;
		this.count = count;
	}

	@Override
	public void run() {
		new File(CommonInfo.MAKE_PATH).mkdirs();
		for (int i = 0; i < count; i++) {
			File f = null;
			if (new Random().nextBoolean())
				f = new File(CommonInfo.MAKE_PATH + File.separator + i + ".mp3");
			else
				f = new File(CommonInfo.MAKE_PATH + File.separator + i + ".avi");
			try {
				f.createNewFile();
				Thread.sleep(time);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
