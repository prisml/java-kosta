package step1.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

import common.IP;

public class NetClient {
	public void go() throws IOException {
		Socket socket = null;
		BufferedReader br = null;
		try {
			// ip�� port�� ����� ������ �����Ѵ�
			socket = new Socket(IP.INST, 5432);
			System.out.println("**Ŭ���̾�Ʈ ����**");
			/*
			 * socket.getInputStream() �� ByteStream�̹Ƿ� BufferedReader�� �̿��ϱ� ���ؼ���
			 * CharacterStream(2byte����)���� �����ؾ� �Ѵ� InputStreamReader�� 1byte ����
			 * ByteStream�� 2byte���� CharacterStream���� �����ϴ� Processing Stream�̴�
			 */
			InputStreamReader ir = new InputStreamReader(socket.getInputStream());
			br = new BufferedReader(ir);
			System.out.println("�������� ���� �޼��� : " + br.readLine());
		} finally {
			if (br != null)
				br.close();
			if (socket != null)
				socket.close();
		}
	}

	public static void main(String[] args) {
		try {
			new NetClient().go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
