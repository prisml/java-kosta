package step5;

import java.io.FileNotFoundException;
import java.io.IOException;

public class TestSerialService {
	public static void main(String[] args) {
		String path= "C:\\java-kosta\\test\\serial\\member.obj";
		SerialService service = new SerialService(path);
		MemberVo vo = new MemberVo("java", "angel", "������", "�Ǳ�");
		try {
			service.writeMemberVO(vo);
			System.out.println("���� �Ϸ�");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
