package step3;

import java.util.ArrayList;

public class TestIOService {
	public static void main(String[] args) {
		String path="C:\\java-kosta\\test\\iotest\\list.txt";
		IOService service = new IOService(path);
		ArrayList<String> list = new ArrayList<String>();
		list.add("������");
		list.add("�����");
		list.add("����");
		list.add("�����");
		service.writeList(list);
		System.out.println(path+"�� ����Ϸ�");
	}
}
