package step3.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import common.IP;

/*
 * EchoClient
 * ������ �޼����� ����ϰ�
 * �������� ����� �޼����� �Է¹޾�
 * �ڽ��� �ֿܼ� ����ϴ� ������ �Ѵ�
 * ������ �޼����� ����ڷκ��� �Է¹�����
 * ���α׷��� �����Ѵ�
 */
public class EchoClient {
	public void go() throws UnknownHostException, IOException {
		Socket socket = null;
		BufferedReader br = null;
		Scanner scan = new Scanner(System.in);
		try {
			// ip�� port�� ����� ������ �����Ѵ�
			while (true) {
				socket = new Socket(IP.MY_IP, 5432);
				System.out.print("msg : ");
				String msg = scan.nextLine();
				if (msg.equals("����")){
					System.out.println("���α׷� ����");
					PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
					pw.println(msg);
					break;
				}
				
				PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
				pw.println(msg);
				
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				System.out.println(br.readLine());
				
				pw.close();
				socket.close();
			}
		} finally {
			if(br != null)
				br.close();
			scan.close();
		}
	}

	public static void main(String[] args) {
		try {
			new EchoClient().go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
