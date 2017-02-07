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
				if (msg.equals("종료")) {
					System.out.println(address + "님이 퇴장하였습니다");
					list.remove(address);
					break;
				} else
					System.out.println("[" + address + "] : " + msg);
				pw.println("Server : " + msg);
			}
			socket.close();
		} catch (IOException e) {
			System.out.println(address + "예의 없이 퇴장");
			list.remove(address);
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException e) {
				System.out.println("뷁");
			}
			pw.close();
		}
	}
}
