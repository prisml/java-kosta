package step4;

import java.io.IOException;

public class TestCopyAndPaste {
	public static void main(String[] args) {
		FileService service = new FileService();
		String orgPath="C:\\java-kosta\\test\\���޷���.txt";
		String destPath="C:\\java-kosta\\test\\iotest\\document\\���޷���.txt";
		try {
			service.copyAndPasteFile(orgPath,destPath);
			System.out.println("copyAndPaste �Ϸ�");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
