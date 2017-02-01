package ex;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TestOutput2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input;
		FileWriter fw = null;
		System.out.println("**점심메뉴**");
		try {
			fw = new FileWriter("C:\\java-kosta\\test\\점심메뉴.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
		PrintWriter pw = new PrintWriter(fw);
		while (true) {
			input = sc.nextLine();
			if(input.equals("주문끝")){
				System.out.println("주문이 완료되었습니다.");
				break;
			}
			System.out.println(input + " 주문!");
			pw.println(input+"\n");
		}
		sc.close();
		pw.close();
	}
}
