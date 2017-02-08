package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/*
 * 채팅서버
 * 다수의 클라이어트와 지속적으로 통신
 * 클라이언트가 보낸 메세지를 입력받아
 * 접속한 모든 클라이언트에게 메세지를 출력한다
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
			printAll(socket, "님이 입장하였습니다.");
			System.out.println(socket.getInetAddress().toString() + " 입장");
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
					if (msg.equals("종료")) {
						printAll(socket, "님이 종료하였습니다.");
						System.out.println(socket.getInetAddress().toString() + " 퇴장");
						list.remove(pw);
						break;
					}
					printAll(socket, ": " + msg);
				}
			} catch (Exception e) {
				printAll(socket, "예의 없이 퇴장");
				System.out.println(socket.getInetAddress().toString() + " 예의 없이 퇴장");
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
