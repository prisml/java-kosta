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
 * 서버에 메세지를 출력하고
 * 서버에서 출력한 메세지를 입력받아
 * 자신의 콘솔에 출력하는 역할을 한다
 * 종료라는 메세지를 사용자로부터 입력받으면
 * 프로그램을 종료한다
 */
public class EchoClient {
	public void go() throws UnknownHostException, IOException {
		Socket socket = null;
		BufferedReader br = null;
		Scanner scan = new Scanner(System.in);
		try {
			// ip와 port를 명시해 소켓을 생성한다
			while (true) {
				socket = new Socket(IP.MY_IP, 5432);
				System.out.print("msg : ");
				String msg = scan.nextLine();
				if (msg.equals("종료")){
					System.out.println("프로그램 종료");
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
