package step1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestOutput {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("C:\\java-kosta\\test\\memo.txt");
			PrintWriter pw = new PrintWriter(fw);
			pw.println("방가방가 IO");
			pw.close();
			System.out.println("작업완료");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
		}
	}
}
