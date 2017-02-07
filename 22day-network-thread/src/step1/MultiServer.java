package step1;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.TreeSet;

public class MultiServer {
	TreeSet<String> list;

	public void go() throws IOException {
		System.out.println("*** MutiServer Start ***");
		list = new TreeSet<String>();
		ServerSocket ss = new ServerSocket(5432);
		try {
			while (true) {
				Socket socket = ss.accept();
				String address = socket.getInetAddress().toString();
				if (!list.contains(address)) {
					list.add(address);
					System.out.println(address + " 님이 입장하였습니다");
				}
				Echo echo = new Echo(address, socket, list);
				Thread tread = new Thread(echo);
				tread.start();
			}
		} finally {
			ss.close();
		}
	}

	public static void main(String[] args) {
		try {
			new MultiServer().go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
