package step1.server;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class NetServer {
	public void go() throws IOException {
		ServerSocket serverSocket = null;
		int count = 1 ;
		try {
			serverSocket = new ServerSocket(5432);
			System.out.println("***��������***");
			// ����ϴٰ� Ŭ���̾�Ʈ �����ϸ� �����Ѵ�
			// accept()�� ���� �� �����ϴ� ���� Socket��
			// Ŭ���̾�Ʈ�� ����� ��ü�̴�( ex - ����� ��ȭ�� )
			while (true) {
				Socket socket = serverSocket.accept();
				System.out.println(count + "����IP:"+socket.getInetAddress());
				PrintWriter pw = new PrintWriter(socket.getOutputStream());
				pw.println("PYD Server - count : " + count++);
				System.out.println("������ Ŭ���̾�Ʈ���� �޼��� ����");
				pw.close();
				socket.close();
			}
		} finally {
			if(serverSocket != null)
				serverSocket.close();
		}
	}

	public static void main(String[] args) {
		try {
			new NetServer().go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
