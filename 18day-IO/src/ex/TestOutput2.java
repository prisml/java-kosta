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
		System.out.println("**���ɸ޴�**");
		try {
			fw = new FileWriter("C:\\java-kosta\\test\\���ɸ޴�.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
		PrintWriter pw = new PrintWriter(fw);
		while (true) {
			input = sc.nextLine();
			if(input.equals("�ֹ���")){
				System.out.println("�ֹ��� �Ϸ�Ǿ����ϴ�.");
				break;
			}
			System.out.println(input + " �ֹ�!");
			pw.println(input+"\n");
		}
		sc.close();
		pw.close();
	}
}
