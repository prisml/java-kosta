package step4;

import java.io.FileNotFoundException;

public class TestThrows1 {
	public static void main(String[] args){
		MemoService service = new MemoService();
		String fileName="C:\\java-kosta\\a1.txt";
		try {
			service.readMemo(fileName);
			System.out.println("�޸� �б� �Ϸ�");
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("���� ���� �� ����");
	}
}
