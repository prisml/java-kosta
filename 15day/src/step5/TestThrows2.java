package step5;

import java.io.IOException;

class MemberDAO { // DAO : Data Access Object
	public void register(String info) throws IOException {
		if (info.equals("")) {
			// 공란일때 IOException을 고의로 발생시키겠다
			throw new IOException("공란은 등록할 수 없음");
		}
		System.out.println("D");
		System.out.println(info + "정보를 database에 저장");
	}
}

class MemberService { // Service : business Object
	public void register(String info) throws IOException {
		MemberDAO dao = new MemberDAO();
		try {
			dao.register(info);
			System.out.println("E");
		} finally {
			System.out.println("F");
		}
	}
}

public class TestThrows2 {
	public static void main(String[] args) {
		MemberService service = new MemberService();
		try {
			// service.register("adf");//DEAB
			service.register("");//FCB
			System.out.println("A");
		} catch (IOException e) {
			System.out.println("C");
			System.out.println(e.getMessage());
		}
		System.out.println("B");
	}

}
