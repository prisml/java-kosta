package step5;

import java.io.IOException;

public class TestSerialService2 {
	public static void main(String[] args) {
		String path= "C:\\java-kosta\\test\\serial\\member.obj";
		SerialService service = new SerialService(path);
		try {
			MemberVo vo = service.readMemberVO();
			System.out.println(vo.getId());
			System.out.println(vo.getPassword());
			System.out.println(vo.getName());
			System.out.println(vo.getAddress());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
