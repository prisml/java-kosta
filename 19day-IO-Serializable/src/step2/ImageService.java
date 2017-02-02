package step2;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class ImageService {
	public void copyAndPaste(String orgPath, String destPath) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(orgPath));
		new File(destPath).getParentFile().mkdirs();
		PrintStream ps = new PrintStream(new FileOutputStream(destPath));
		int data = -1;
		while((data = bis.read())!=-1)
			ps.write(data);
		bis.close();
		ps.close();
	}
}
