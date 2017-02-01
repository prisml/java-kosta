package step3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class IOService {
	String path;
	FileWriter fw = null;
	public IOService(String path) {
		this.path=path;
	}
	public void writeList(ArrayList<String> list) {
		File f = new File(path).getParentFile();
		f.mkdirs();
		try {
			fw = new FileWriter(path);
		} catch (IOException e) {
			System.out.println("파일없음");
			e.printStackTrace();
		}
		PrintWriter pw = new PrintWriter(fw);
		for(int i=0;i<list.size();i++)
			pw.println(list.get(i));
		System.out.println("출력완료");
		pw.close();
	}
	public ArrayList<String> readList() {
		ArrayList<String> list = new ArrayList<String>();
		File f = new File(this.path);
		if(!f.exists())
			return null;
		try {
			String string;
			BufferedReader br= new BufferedReader(new FileReader(this.path));
			while((string = br.readLine()) != null)
				list.add(string);
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return list;
	}
}
