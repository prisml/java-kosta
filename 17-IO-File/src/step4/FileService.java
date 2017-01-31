package step4;

import java.io.File;
import java.io.IOException;

public class FileService {

	public void makeDirAndFile(String movieFilePath) throws IOException{
		File f = new File(movieFilePath);
		f.getParentFile().mkdirs();
		f.createNewFile();
	}

	public void makeDirAndFiles(String dir, String info) throws IOException {
		File f = new File(dir);
		f.mkdirs();
		String[] fs = info.split(",");
		for(int i=0;i<fs.length;i++)
		{
			File sf = new File(dir+ File.separator + fs[i]);
			sf.createNewFile();
		}
	}

}
