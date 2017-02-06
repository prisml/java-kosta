package step2.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * ������ Ŭ���̾�Ʈ�� ���� �޼����� �޾�
 * �Ʒ��� ���� �޼����� ����� �� ���� Ŭ���̾�Ʈ�� ��ٸ���
 * 
 * 127.0.0.1 ���� �޼��� : �ȳ�
 * 192.168.0.74 ���� �޼��� : �氡
 */
public class NetServer {
	public void go() throws IOException {
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
					System.out.println(socket.getInetAddress() + " ���� �޼��� : " + br.readLine());
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
			new NetServer().go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
