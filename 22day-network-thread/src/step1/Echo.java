package step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.TreeSet;

public class Echo implements Runnable {
	String address;
	Socket socket;
	TreeSet<String> list;

	public Echo(String address, Socket socket, TreeSet<String> list) {
		super();
		this.address = address;
		this.socket = socket;
		this.list = list;
	}

	@Override
	public void run() {
		BufferedReader br = null;
		PrintWriter pw = null;
		String msg = null;
		try {
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw = new PrintWriter(socket.getOutputStream(), true);
			while (true) {
				msg = br.readLine();
				//if(msg == null)
				//	continue;
				if (msg.equals("����")) {
					System.out.println(address + "���� �����Ͽ����ϴ�");
					list.remove(address);
					break;
				} else
					System.out.println("[" + address + "] : " + msg);
				pw.println("Server : " + msg);
			}
			socket.close();
		} catch (IOException e) {
			System.out.println(address + "���� ���� ����");
			list.remove(address);
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException e) {
				System.out.println("��");
			}
			pw.close();
		}
	}
}
