package step5;

import java.io.IOException;

class MemberDAO { // DAO : Data Access Object
	public void register(String info) throws IOException {
		if (info.equals("")) {
			// �����϶� IOException�� ���Ƿ� �߻���Ű�ڴ�
			throw new IOException("������ ����� �� ����");
		}
		System.out.println("D");
		System.out.println(info + "������ database�� ����");
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
