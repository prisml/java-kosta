package step4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileService {

	public void copyAndPasteFile(String orgPath, String destPath) throws IOException {
		File f = new File(destPath).getParentFile();
		f.mkdirs();
		BufferedReader br = new BufferedReader(new FileReader(orgPath));
		PrintWriter pw = new PrintWriter(new FileWriter(destPath));
		String string;
		while((string=br.readLine())!=null)
			pw.println(string);
		br.close();
		pw.close();
	}

}
