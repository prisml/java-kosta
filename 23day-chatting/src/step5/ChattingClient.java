package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import common.IP;

/*
 * 채팅 클라이언트
 * 2개 스레드가 멀티스레딩되어야 한다
 * main thread : 콘솔에서 입력받아 서버로 메세지를 출력하는 스레드
 * ClientWorker Thread : 서버에서 오는 채팅메세지를 입력받아 콘솔에 출력하는 스레드
 * 
 */
public class ChattingClient {
	Socket socket;
	
	public void go() throws UnknownHostException, IOException{
		socket = new Socket(IP.INST, 5432);
		System.out.println("*** Chatting Client ***");
		
		PrintWriter pw =null;
		String msg = null;
		Scanner scan = new Scanner(System.in);
		
		Thread tr = new Thread(new ClientWorker());
		tr.setDaemon(true);
		tr.start();

		
		try {
			pw = new PrintWriter(socket.getOutputStream(), true);
			while(true){
				Thread.sleep(100);
				msg = scan.nextLine();
				pw.println(msg);
				if(msg.equals("종료"))
					break;
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			scan.close();
			pw.close();
		}
	}
	public static void main(String[] args) {
		try {
			new ChattingClient().go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	class ClientWorker implements Runnable{
		@Override
		public void run() {
			System.out.println("worker run");
			BufferedReader br = null;
			try {
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				while(true){
					System.out.println(br.readLine());
				}
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					if(br != null)
						br.close();
					if(socket != null)
						socket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
