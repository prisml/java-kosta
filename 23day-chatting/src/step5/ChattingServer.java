package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/*
 * ä�ü���
 * �ټ��� Ŭ���̾�Ʈ�� ���������� ���
 * Ŭ���̾�Ʈ�� ���� �޼����� �Է¹޾�
 * ������ ��� Ŭ���̾�Ʈ���� �޼����� ����Ѵ�
 */
public class ChattingServer {
	private ArrayList<PrintWriter> list = new ArrayList<PrintWriter>();

	public void go() throws IOException {
		System.out.println("** Chatting Server ***");
		ServerSocket ss = new ServerSocket(5432);
		try {
			while (true) {
				Socket socket = ss.accept();
				new Thread(new ServerWorker(socket)).start();
			}
		} finally {
			ss.close();
		}
	}

	public static void main(String[] args) {
		try {
			new ChattingServer().go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	class ServerWorker implements Runnable {
		PrintWriter pw;
		Socket socket;

		public ServerWorker(Socket socket) {
			super();
			this.socket = socket;
			try {
				pw = new PrintWriter(socket.getOutputStream(), true);
				list.add(pw);
			} catch (IOException e) {
				e.printStackTrace();
			}
			printAll(socket, "���� �����Ͽ����ϴ�.");
			System.out.println(socket.getInetAddress().toString() + " ����");
		}

		public void printAll(Socket sc, String msg) {
			for (int i = 0; i < list.size(); i++) {
				list.get(i).println("[" + sc.getInetAddress() + "] " + msg);
			}
		}

		@Override
		public void run() {
			BufferedReader br = null;
			String msg = null;
			try {
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				while (true) {
					msg = br.readLine();
					if (msg.equals("����")) {
						printAll(socket, "���� �����Ͽ����ϴ�.");
						System.out.println(socket.getInetAddress().toString() + " ����");
						list.remove(pw);
						break;
					}
					printAll(socket, ": " + msg);
				}
			} catch (Exception e) {
				printAll(socket, "���� ���� ����");
				System.out.println(socket.getInetAddress().toString() + " ���� ���� ����");
			} finally {
				try {
					if (br != null)
						br.close();
					if (socket != null)
						socket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}
}
