package step7;

import java.io.File;

public class MoveFileWorker implements Runnable {

	private int time;
	private int count;

	public MoveFileWorker(int time, int count) {
		this.time = time;
		this.count = count;
	}

	@Override
	public void run() {
		new File(CommonInfo.MOVIE_PATH).mkdirs();
		new File(CommonInfo.MUSIC_PATH).mkdirs();
		for (int l = 0; l < count; l++) {
			try {
				Thread.sleep(time);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			File[] list = new File(CommonInfo.MAKE_PATH).listFiles();
			for (int i = 0; i < list.length; i++) {
				String fName = list[i].getName();
				if(fName.substring(fName.lastIndexOf(".")+1, fName.length()).equals("mp3"))
					list[i].renameTo(new File(CommonInfo.MUSIC_PATH + File.separator + fName));
				else
					list[i].renameTo(new File(CommonInfo.MOVIE_PATH + File.separator + fName));
			}
		}
	}
}
