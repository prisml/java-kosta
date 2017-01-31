package step6;

import java.io.File;

public class MoveService {

	public void execute(String orgDir, String destDir, String ext) {
		File[] list = new File(orgDir).listFiles();
		File dir = new File(destDir);
		dir.mkdirs();
		for(int i=0;i<list.length;i++){
			String fName = list[i].getName();
			File orgFile = new File(list[i].getPath());
			File destFile = new File(destDir + File.separator + fName);
			if(fName.substring(fName.lastIndexOf(".")+1, fName.length()).equals(ext))
				orgFile.renameTo(destFile);
		}
	}

}
