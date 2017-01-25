package step4;

import java.io.FileNotFoundException;

public class TestThrows1 {
	public static void main(String[] args){
		MemoService service = new MemoService();
		String fileName="C:\\java-kosta\\a1.txt";
		try {
			service.readMemo(fileName);
			System.out.println("메모 읽기 완료");
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("정상 수행 후 종료");
	}
}
