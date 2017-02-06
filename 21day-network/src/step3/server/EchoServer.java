package step3.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * EchoServer(메아리서버)
 * 클라이언트가 접속하여 데이터를
 * 전송하면 입력받아 콘솔에 출력하고
 * 다시 그 데이터를 클라이언트로 출력하는
 * 메아리 서버
 */

public class EchoServer {
	public void go()  throws IOException {
		ServerSocket ss = null;
		ss = new ServerSocket(5432);
		System.out.println("** 서버 실행 **");
		try {
			BufferedReader br = null;
			while (true) {
				Socket socket = null;
				try {
					socket = ss.accept();
					br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
					String msg = br.readLine();
					if(msg.equals("종료"))
						System.out.println(socket.getInetAddress() + " " + msg);
					else
						System.out.println(socket.getInetAddress() + " 님의 메세지 : " + msg);
					PrintWriter pw = new PrintWriter(socket.getOutputStream());
					pw.println("Server : " + msg);
					pw.close();
					br.close();
					socket.close();
				} catch (Exception e) {
					System.out.println(socket.getInetAddress() + "오류");
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
