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
		Scanner scan = null;
		PrintWriter pw = null;
		BufferedReader br = null;

		try {
			socket = new Socket(IP.INST, 5432);
			System.out.println("**클라이언트 창**");
			scan = new Scanner(System.in);
			pw = new PrintWriter(socket.getOutputStream(), true);
			br = new BufferedReader(new InputStreamReader(socket.getInputStream())); 
			while (true) {
				String message = scan.nextLine();
				pw.println(message);
				if (message.equals("종료")) {
					System.out.println("클라이언트 종료");
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
