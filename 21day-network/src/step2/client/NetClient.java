package step2.client;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import common.IP;

/* 
 * ������ �����Ͽ�
 * �޼����� �����ϰ�
 * ������ �����Ѵ�
 */
public class NetClient {
	public void go() throws UnknownHostException, IOException {
		Socket socket = null;
		Scanner scan = new Scanner(System.in);
		try {
			// ip�� port�� ����� ������ �����Ѵ�
			while (true) {
				socket = new Socket(IP.MY_IP, 5432);
				System.out.print("msg(exit -1) : ");
				String msg = scan.nextLine();
				if(msg.equals("-1"))
					break;
				PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
				pw.println(msg);
				pw.close();
				socket.close();
			}
		} finally {
			scan.close();
		}
	}

	public static void main(String[] args) {
		try {
			new NetClient().go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
