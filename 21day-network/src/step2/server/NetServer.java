package step2.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 서버는 클라이언트가 보낸 메세지를 받아
 * 아래와 같이 메세지를 출력한 후 다음 클라이언트를 기다린다
 * 
 * 127.0.0.1 님의 메세지 : 안녕
 * 192.168.0.74 님의 메세지 : 방가
 */
public class NetServer {
	public void go() throws IOException {
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
					System.out.println(socket.getInetAddress() + " 님의 메세지 : " + br.readLine());
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
			new NetServer().go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
