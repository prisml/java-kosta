package step8;

public class MemberService {

	public void register(String nickName) throws NickNameException{
		if(nickName.length()>=2 && nickName.length()<=5)
			System.out.println(nickName);
		else
			throw new NickNameException("�� �г����� ��ϵ� �� �����ϴ�(2�� �̻� 5�� ���ϸ� ����)");
	}
}
