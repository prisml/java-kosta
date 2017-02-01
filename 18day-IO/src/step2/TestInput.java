package step2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestInput {
	public static void main(String[] args) {
		FileReader fr;
		try {
			fr = new FileReader("C:\\java-kosta\\test\\Æ®·³ÇÁ.txt");
			BufferedReader br = new BufferedReader(fr);
			String line=null;
			while((line = br.readLine()) != null)
				System.out.println(line);
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
