package step5;

import java.io.IOException;

public class TestCopyAndPasteDir {
	public static void main(String[] args) {
		FileService service = new FileService();
		String orgDir="C:\\java-kosta\\test\\iotest\\document";
		String destDir="C:\\java-kosta\\test\\iotest\\report";
		try {
			service.copyAndPasteDir(orgDir,destDir);
			System.out.println("복붙 완료~");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
