package step2;

import java.io.File;

public class FileService {

	public void printFileName(String filePath) {
		File f = new File(filePath);
		File list[];
		list = f.getParentFile().listFiles();
		for(int i=0;i<list.length;i++)
			if(list[i].isFile() && !list[i].getPath().equals(f.getPath()))
				System.out.println(list[i].getName());
	}
}
