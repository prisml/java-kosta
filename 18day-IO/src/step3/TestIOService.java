package step3;

import java.util.ArrayList;

public class TestIOService {
	public static void main(String[] args) {
		String path="C:\\java-kosta\\test\\iotest\\list.txt";
		IOService service = new IOService(path);
		ArrayList<String> list = new ArrayList<String>();
		list.add("아이유");
		list.add("장기하");
		list.add("설현");
		list.add("김규익");
		service.writeList(list);
		System.out.println(path+"에 저장완료");
	}
}
