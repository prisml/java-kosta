package step3;

import java.util.ArrayList;

public class TestIOService2 {
	public static void main(String[] args) {
		String path="C:\\java-kosta\\test\\iotest\\list.txt";
		IOService service = new IOService(path);
		ArrayList<String> list = service.readList();
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
	}
}
