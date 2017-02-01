package step2;

import java.io.File;

public class TestFile2 {
	public static void main(String[] args) {
		String dir="C:\\java-kosta\\util\\eclipse";
		File f = new File(dir);
		
		File list[];
		list = f.listFiles();
		for(int i=0;i<list.length;i++)
			if(list[i].isFile())
				System.out.println(list[i].getName());
	}
}
