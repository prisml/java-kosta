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
		Scanner scan = null;
		PrintWriter pw = null;
		BufferedReader br = null;

		try {
			socket = new Socket(IP.INST, 5432);
			System.out.println("**Ŭ���̾�Ʈ â**");
			scan = new Scanner(System.in);
			pw = new PrintWriter(socket.getOutputStream(), true);
			br = new BufferedReader(new InputStreamReader(socket.getInputStream())); 
			while (true) {
				String message = scan.nextLine();
				pw.println(message);
				if (message.equals("����")) {
					System.out.println("Ŭ���̾�Ʈ ����");
					break;
				}
				message = br.readLine();
				System.out.println(message);
			}

		} finally {
			if (br != null) {
				br.close();
			}
			if (pw != null) {
				pw.close();
			}
			if (scan != null) {
				scan.close();
			}
			if (socket != null)
				socket.close();
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
