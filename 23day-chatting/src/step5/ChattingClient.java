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
 * ä�� Ŭ���̾�Ʈ
 * 2�� �����尡 ��Ƽ�������Ǿ�� �Ѵ�
 * main thread : �ֿܼ��� �Է¹޾� ������ �޼����� ����ϴ� ������
 * ClientWorker Thread : �������� ���� ä�ø޼����� �Է¹޾� �ֿܼ� ����ϴ� ������
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
				if(msg.equals("����"))
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
