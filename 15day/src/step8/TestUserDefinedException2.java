package step8;

import java.util.Scanner;

public class TestUserDefinedException2 {
	public static void main(String[] args) {
		System.out.print("�г����� �Է��ϼ���(2�� �̻� 5�� ���ϸ� ��ϰ���) : ");
		Scanner scan = new Scanner(System.in);
		String nickName = scan.nextLine();
		MemberService service = new MemberService();
		try {
			service.register(nickName);
			System.out.println(nickName + " ī�� �г��� ��� �Ϸ�");
		} catch (NickNameException e) {
			System.out.println(e.getMessage());
		}
		scan.close();
	}
}
