package step2;

import java.io.IOException;

public class TestImageService {
	public static void main(String[] args) {
		String orgPath="C:\\java-kosta\\test\\asl.jpg";
		String destPath="C:\\java-kosta\\test\\img\\asl.jpg";
		ImageService service = new ImageService();
		try {
			service.copyAndPaste(orgPath,destPath);
			System.out.println("복붙완료");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
