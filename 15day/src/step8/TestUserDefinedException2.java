package step8;

import java.util.Scanner;

public class TestUserDefinedException2 {
	public static void main(String[] args) {
		System.out.print("닉네임을 입력하세요(2자 이상 5자 이하만 등록가능) : ");
		Scanner scan = new Scanner(System.in);
		String nickName = scan.nextLine();
		MemberService service = new MemberService();
		try {
			service.register(nickName);
			System.out.println(nickName + " 카페 닉네임 등록 완료");
		} catch (NickNameException e) {
			System.out.println(e.getMessage());
		}
		scan.close();
	}
}
