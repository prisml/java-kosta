package step3.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * EchoServer(�޾Ƹ�����)
 * Ŭ���̾�Ʈ�� �����Ͽ� �����͸�
 * �����ϸ� �Է¹޾� �ֿܼ� ����ϰ�
 * �ٽ� �� �����͸� Ŭ���̾�Ʈ�� ����ϴ�
 * �޾Ƹ� ����
 */

public class EchoServer {
	public void go()  throws IOException {
		ServerSocket ss = null;
		ss = new ServerSocket(5432);
		System.out.println("** ���� ���� **");
		try {
			BufferedReader br = null;
			while (true) {
				Socket socket = null;
				try {
					socket = ss.accept();
					br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
					String msg = br.readLine();
					if(msg.equals("����"))
						System.out.println(socket.getInetAddress() + " " + msg);
					else
						System.out.println(socket.getInetAddress() + " ���� �޼��� : " + msg);
					PrintWriter pw = new PrintWriter(socket.getOutputStream());
					pw.println("Server : " + msg);
					pw.close();
					br.close();
					socket.close();
				} catch (Exception e) {
					System.out.println(socket.getInetAddress() + "����");
				}
			}
		} finally {
			if (ss != null)
				ss.close();
		}
		
	}
	public static void main(String[] args) {
		try {
			new EchoServer().go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
