package step5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileService {

	public void copyAndPasteDir(String orgDir, String destDir)  throws IOException {
		File f = new File(destDir);
		f.mkdirs();
		PrintWriter pwReport = new PrintWriter(new FileWriter(destDir + File.separator + "report.txt"));
		File[] list = new File(orgDir).listFiles();
		for(int i=0;i<list.length;i++){
			BufferedReader br = new BufferedReader(new FileReader(orgDir + File.separator + list[i].getName()));
			PrintWriter pw = new PrintWriter(new FileWriter(destDir + File.separator + list[i].getName()));
			String string;
			pwReport.println(list[i].getName());
			while((string=br.readLine())!=null){
				pw.println(string);
				pwReport.println(string);
			}
			pwReport.println("***********************************");
			br.close();
			pw.close();
		}
		pwReport.close();
	}

}
